package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Area;
import com.itgaoshu.yiyuan.bean.AreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaMapper {
    //查询所有药品产地
    List<Area> findAllArea(Area a);
    //新增药品产地
    int addArea(Area a);
    int count(Area a);
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(Integer areaid);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(Integer areaid);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}