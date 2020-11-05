package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReportMapper {
    //查询所有挂号类型
    @Select("select * from registeredtype")
    List<Registeredtype> selreg();
    //查询所有科室
    @Select("select * from departments")
    List<Departments> selDep();
    //根据挂号类型和科室查询所有当天值班的医生
    /*@Select("select *\n" +
            "from doctor d,\n" +
            "     (select doctorId from paiban where ${day}='有班')p\n" +
            "where d.departmentId=#{dep}\n" +
            "  and d.registeredId=#{reg}\n" +
            "  and d.doctorId = p.doctorId")*/

    @Select("select * from doctor d\n" +
            "    where d.departmentId=#{dep}\n" +
            "    and d.registeredId=#{reg}")

    /*,(select doctorId from paiban
    where <if test="day==1">one</if>
    <if test="day==2">two</if>
    <if test="day==3">three</if>
    <if test="day==4">four</if>
    <if test="day==5">five</if>
    <if test="day==6">six</if>
    <if test="day==7">seven</if> ='有班')p*/
    List<Doctor> seldoctor(@Param("reg") int registerId,
                           @Param("dep") int departmentId);

    //根据挂号类型查询费用
    @Select("select price from registeredtype where registeredId=#{registerId}")
    double seltymo(int registerId);

    //查重手机号
    @Select("select * from report where phone=#{phone}")
    List<Report> selByPhone(String phone);

    //查重身份证号
    @Select("select * from report where carid=#{carid}")
    List<Report> selByCar(String carid);

    //查询所有挂号
    //@Select("select * from report where reportName like '%${name}%'")
    List<Report> selAll(@Param("name") String name,Integer cc);

    //添加挂号
    @Insert("INSERT INTO report (reportname,sex,age,department,doctor,reporttype,price,time,users,state,phone,carid)\n" +
            " VALUES (#{reportname},#{sex},#{age},#{department},#{doctor},#{reporttype},#{price},NOW(),#{users},1,#{phone},#{carid})")
    int addre(Report r);
    //添加挂号费(挂号时就缴纳完毕)
    @Insert("insert cashier(reportid,durgname,durgnum,repiceprice,repicetotal,state,ctime,mstate)" +
            "values(#{id},'挂号费',1,#{price},#{price},2,NOW(),1)")
    int addCashierOfReport(@Param("id") Integer id,@Param("price")Double price);

    //删除挂号，置state=0
    @Update("update report set state=0 where reportid=#{id}")
    int delre(Integer id);

    //转住院
    @Update("update report set state=4,zhuan=#{zhuan} where reportid=#{id}")
    Integer zhuanyuan(@Param("id") Integer id,@Param("zhuan") String zhuan);
    //======================================处方划价=========================================

    //根据挂号id查询病人的处方信息
    @Select("select * from cashier where reportid=#{perid}")
    List<Cashier> selall(Integer perid);

    //查询药房中的所有药品信息
    List<Pharmacy> seldrug(String drugname);

    //根据挂号id查询病因
    @Select("select zhuan from report where reportid=#{reid}")
    String selbing(Integer reid);
    //根据挂号id更新病因
    @Update("update report set zhuan=#{bing} where reportid=#{id}")
    int addbing(@Param("id") Integer reid,@Param("bing") String bing);

    //根据挂号id查询病人处方中当前药品的数量
    @Select("select durgnum from cashier where reportid=#{id} and durgname=#{name}")
    Integer selchu(@Param("id") Integer reid,@Param("name") String mename);

    //根据挂号id在处方表中添加药品,即state=0
    @Insert("insert into cashier(reportid,durgname,durgnum,repiceprice,repicetotal,state,ctime,mstate)" +
            "values(#{id},#{dname},#{dnum},#{price},#{total},0,NOW(),0)")
    int addchu(@Param("id") Integer reid,@Param("dname") String durgname,
               @Param("dnum") Integer durgnum,@Param("price") Double repiceprice,
               @Param("total") Double repicetotal);

    //更新药房中药品的数量
    @Update("update pharmacy set drugstorenum=drugstorenum-#{num} where pharmacyName=#{name}")
    int updPharmacyOfnum(@Param("name") String durgname,@Param("num") Integer durgnum);

    //根据挂号id更新处方表的药品
    @Update("update cashier set durgnum=durgnum+#{num},repicetotal=#{total},ctime=NOW() " +
            "where reportid=#{id} and durgname=#{name} and state=0")
    int updchu(@Param("id") Integer reid,@Param("name") String durgname,
               @Param("num") Integer durgnum,@Param("total") Double repicetotal);

    //(模糊)查询所有项目信息
    @Select("select * from outpatienttype o,unit u " +
            "where u.unitid =o.unit and o.projectname like '%${value}%'")
    List<Outpatienttype> selout(String projectName);

    //根据挂号id查询病人处方中的项目信息
    @Select("select * from cashier where reportid=#{perid} and state=1")
    List<Cashier> selximu(Integer perid);

    //给选中的病人添加项目
    @Insert("insert into cashier(reportid,durgname,durgnum,repiceprice,repicetotal,state,ctime,ostate,mstate)" +
            "values(#{id},#{dname},#{dnum},#{price},#{total},1,NOW(),#{ostate},0)")
    int addchuo(@Param("id") Integer reportId,@Param("dname") String durgname,
                @Param("dnum") Integer durgnum,@Param("price") Double repiceprice,
                @Param("total") Double repicetotal,@Param("ostate") Integer ostate);

    //根据处方id删除项目
    @Delete("delete from cashier where cashier=#{id}")
    int delo(Integer cashier);

    //根据挂号id查询当前病人所有未缴费的项目
    @Select("select * from cashier where reportid=#{perid} and state=1 and mstate=0")
    List<Cashier> selxiang(Integer perid);

    //根据挂号id查询当前病人要交的项目费用
    @Select("select sum(repicetotal) from cashier where reportid=#{perid} and state=1 and mstate=0")
    Double selshoux(Integer perid);
    //根据挂号id缴费
    @Update("update cashier set mstate=1 where reportid=#{perid} and state=1")
    Integer shoufei(Integer perid);

    //根据挂号id查询病人已缴费且需要检查的项目
    @Select("select * from cashier where reportid=#{perid} and state=1 and ostate=1 and mstate=1")
    List<Cashier> selcha(Integer perid);
    //病人做完需要检查的项目后填写检查到的病因
    @Update("update cashier set jie=#{bing} where reportid=#{reid} and cashier=#{cashier}")
    Integer addbingc(@Param("reid") Integer reid,@Param("bing") String bing,
                     @Param("cashier")Integer cashier);

    //根据挂号id查询当前病人处方中的所有药品信息
    @Select("select * from cashier where reportid=#{perid} and state=0")
    List<Cashier> selpepi(Integer perid);
    //根据挂号id查询未缴费的项目
    @Select("select count(*) from cashier where reportid=#{reid} and state=1 and mstate=0")
    Integer seljiao(Integer reid);
    //根据挂号id查询已缴费但未检查的项目
    @Select("select count(*) from cashier where reportid=#{reid} and state=1 " +
            "and ostate=1 and (jie is null or jie='')")
    Integer selwei(Integer reid);
    //根据挂号id查询处方中药品总价
    @Select("select sum(repicetotal) from cashier where reportid=#{reportId} and state=0 and mstate=0")
    Double selch(Integer reportId);
    //根据挂号id缴纳药品费用
    @Update("update cashier set mstate=1 where reportid=#{id} and state=0 and mstate=0")
    Integer shoufeic(@Param("id") Integer reid);
    //缴纳完药品费用后更改挂号状态为2，表示此病人看诊结束
    @Update("update report set state=2 where reportid=#{reid}")
    Integer updState2(Integer reid);

    //模糊查询所有患者
    List<Report> selhuan(String name);
    //根据挂号id查询病人挂号的总费用
    @Select("select sum(repicetotal) from cashier where reportid=#{reid} and mstate=1")
    Double zong(Integer reid);







    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(Integer reportid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(Integer reportid);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);
}