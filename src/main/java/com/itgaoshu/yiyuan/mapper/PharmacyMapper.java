package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Pharmacy;
import com.itgaoshu.yiyuan.bean.PharmacyExample;
import com.itgaoshu.yiyuan.bean.Report;
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
    List<Pharmacy> selectpharmacy();



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