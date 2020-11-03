package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Checkup;
import com.itgaoshu.yiyuan.bean.CheckupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckupMapper {
    int countByExample(CheckupExample example);

    int deleteByExample(CheckupExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Checkup record);

    int insertSelective(Checkup record);

    List<Checkup> selectByExample(CheckupExample example);

    Checkup selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Checkup record, @Param("example") CheckupExample example);

    int updateByExample(@Param("record") Checkup record, @Param("example") CheckupExample example);

    int updateByPrimaryKeySelective(Checkup record);

    int updateByPrimaryKey(Checkup record);
}