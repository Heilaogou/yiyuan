package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.DoctorExample;
import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.sun.tools.javac.tree.DCTree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {
    //添加医生
    int addDoctor(Doctor dt);
    int count(Doctor dt);
    //修改医生信息
    int editDoctor(Doctor record);
    //查询医生列表
    List<Doctor> doctorList(Doctor dt);
    //查询科室信息
    List<Departments> findAllDepartments();
    //查询挂号类型
    List<Registeredtype>findAllRegisteredtype();
    int deleteByExample(DoctorExample example);
    int countByExample(DoctorExample example);
    int deleteByPrimaryKey(Integer doctorid);
    int insertSelective(Doctor record);
    List<Doctor> selectByExample(DoctorExample example);
    Doctor selectByPrimaryKey(Integer doctorid);
    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);
    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);
    int updateByPrimaryKeySelective(Doctor record);
}