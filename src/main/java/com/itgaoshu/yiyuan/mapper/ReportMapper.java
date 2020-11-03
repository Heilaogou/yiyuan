package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Report;
import com.itgaoshu.yiyuan.bean.ReportExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReportMapper {
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