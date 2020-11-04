package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.DepartmentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentsMapper {



    int countByExample(DepartmentsExample example);

    int deleteByExample(DepartmentsExample example);
    //查询所有科室
    List<Departments> selectAll(Departments dm);
    //根据主键删除科室
    int deleteByPrimaryKey(Integer departmentid);
    //新增科室
    int addDepartment(Departments dm);
    //根据id查询科室
    Departments selectByPrimaryKey(Integer departmentid);
    //根据主键修改科室
    int updateByPrimaryKey(Departments record);
    //页
    int count(Departments dm);
    int insertSelective(Departments record);

    List<Departments> selectByExample(DepartmentsExample example);


    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    int updateByPrimaryKeySelective(Departments record);

}