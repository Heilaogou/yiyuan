package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Projecttype;
import com.itgaoshu.yiyuan.bean.ProjecttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjecttypeMapper {
    int countByExample(ProjecttypeExample example);

    int deleteByExample(ProjecttypeExample example);

    int deleteByPrimaryKey(Integer projectid);

    int insert(Projecttype record);

    int insertSelective(Projecttype record);

    List<Projecttype> selectByExample(ProjecttypeExample example);

    Projecttype selectByPrimaryKey(Integer projectid);

    int updateByExampleSelective(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByExample(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByPrimaryKeySelective(Projecttype record);

    int updateByPrimaryKey(Projecttype record);
}