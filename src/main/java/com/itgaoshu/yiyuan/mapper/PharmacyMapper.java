package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Huishou;
import com.itgaoshu.yiyuan.bean.Pharmacy;
import com.itgaoshu.yiyuan.bean.PharmacyExample;
import com.itgaoshu.yiyuan.bean.Report;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//药房管理
public interface PharmacyMapper {
    //查询所有需要取药的患者信息
    List<Report> tselpreson();
    //出库
    @Update("update pharmacy set drugstorenum=drugstorenum-#{num} where pharmacyname=#{name}")
    Integer chuku(@Param("num") Integer num,@Param("name") String name);
    //取药结束更改挂号状态
    @Update("update report set state=3 where reportid=#{reportId}")
    Integer updReport(Integer reportId);
    //查询所有药品
    List<Pharmacy> selectpharmacy(String pharmacyName);
    //报缺药品
    @Insert("insert into baoque(baoquename,baoquenum) values(#{name},#{num})")
    Integer addbaoque(@Param("num") Integer baoqueNum,@Param("name") String baoqueName);
    //药品回收并根据药房id删除药品
    @Delete("delete from pharmacy where pharmacyid=#{pharmacyid}")
    Integer delpharymary(Integer pharmacyid);
    @Insert("insert into huishou(huishouname,huishounumber,huishoupihao,jbr,beizhu)" +
            "values(#{huishouname},#{huishounumber},#{huishoupihao},#{jbr},#{beizhu})")
    Integer addHuishou(Huishou huishou);



    int countByExample(PharmacyExample example);

    int deleteByExample(PharmacyExample example);

    int deleteByPrimaryKey(Integer pharmacyid);

    int insert(Pharmacy record);

    int insertSelective(Pharmacy record);

    List<Pharmacy> selectByExample(PharmacyExample example);

    Pharmacy selectByPrimaryKey(Integer pharmacyid);

    int updateByExampleSelective(@Param("record") Pharmacy record, @Param("example") PharmacyExample example);

    int updateByExample(@Param("record") Pharmacy record, @Param("example") PharmacyExample example);

    int updateByPrimaryKeySelective(Pharmacy record);

    int updateByPrimaryKey(Pharmacy record);
}