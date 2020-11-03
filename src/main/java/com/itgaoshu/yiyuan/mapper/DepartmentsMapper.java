package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.DepartmentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentsMapper {

    //查询所有科室
    List<Departments> selectAll();

    int countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);

    int deleteByPrimaryKey(Integer departmentid);

    int insert(Departments record);

    int insertSelective(Departments record);

    List<Departments> selectByExample(DepartmentsExample example);

    Departments selectByPrimaryKey(Integer departmentid);

    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}