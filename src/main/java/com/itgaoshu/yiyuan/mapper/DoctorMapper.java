package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.DoctorExample;
import com.sun.tools.javac.tree.DCTree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {
    int countByExample(DoctorExample example);
    //查询医生列表
    List<Doctor> doctorList(Doctor dt);
    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer doctorid);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer doctorid);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}