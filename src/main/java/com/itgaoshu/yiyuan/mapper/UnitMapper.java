package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Unit;
import com.itgaoshu.yiyuan.bean.UnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {
    //新增计量单位
    int addUnit(Unit unit);
    int count(Unit unit);
    //查询计量单位列表
    List<Unit> findAllUnit(Unit unit);

    int countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer unitid);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer unitid);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}