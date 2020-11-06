package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjecttypeMapper {
    //新增项目大类
    int addProjecttype(Projecttype projecttype);
    int countp(Projecttype projecttype);
    //查询项目大类
    List<Projecttype> findAllProjecttype(Projecttype projecttype);


    //查询住院床位
    List<Bed> findAllBed(Bed bed);
    //新增住院床位
    int addBed(Bed bed);
    int countb(Bed bed);
    //下拉框
    List<Departments> departmentList();
    //修改床位信息
    int editBed(Bed bed);
    //删除床位信息
    int deleteBed(Bed bed);

    //查询所有收费类型
    List<Moneytype> findAllMoneytype(Moneytype moneytype);
    //新增收费类型
    int countm(Moneytype moneytype);
    int addMoneytype(Moneytype moneytype);
    //修改收费类型
    int editMoneytype(Moneytype moneytype);
    //删除收费类型
    int deleteMoneytype(Integer moneyid);

    //查询所有门诊收费项目
    List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype);
    //新增门诊收费项目
    int counto(Outpatienttype outpatienttype);
    int addOutpatienttype(Outpatienttype outpatienttype);
    //修改收费类型
    int editOutpatienttype(Outpatienttype outpatienttype);
    //删除收费类型
    int deleteOutpatienttype(Integer outpatientid);
    //下拉框
    List<Projecttype> findAllProjecttype1();
    List<Unit> findAllUnit();

    //查询所有门诊收费项目
    List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype);
    //新增门诊收费项目
    int counti(Inoutpatienttype inoutpatienttype);
    int addInoutpatienttype(Inoutpatienttype inoutpatienttype);
    //修改收费类型
    int editInoutpatienttype(Inoutpatienttype inoutpatienttype);
    //删除收费类型
    int deleteInoutpatienttype(Integer inoutpatientid);
    //下拉框
    List<Projecttype> findAllProjecttype2();
    List<Unit> findAllUnit1();







    int countByExample(ProjecttypeExample example);
    int deleteByExample(ProjecttypeExample example);
    int deleteByPrimaryKey(Integer projectid);
    int insertSelective(Projecttype record);
    List<Projecttype> selectByExample(ProjecttypeExample example);
    Projecttype selectByPrimaryKey(Integer projectid);
    int updateByExampleSelective(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);
    int updateByExample(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);
    int updateByPrimaryKeySelective(Projecttype record);
    int updateByPrimaryKey(Projecttype record);
}