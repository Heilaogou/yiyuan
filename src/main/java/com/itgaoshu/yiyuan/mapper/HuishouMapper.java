package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Huishou;
import com.itgaoshu.yiyuan.bean.HuishouExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HuishouMapper {
    int countByExample(HuishouExample example);

    int deleteByExample(HuishouExample example);

    int deleteByPrimaryKey(Integer huishouid);

    int insert(Huishou record);

    int insertSelective(Huishou record);

    List<Huishou> selectByExample(HuishouExample example);

    Huishou selectByPrimaryKey(Integer huishouid);

    int updateByExampleSelective(@Param("record") Huishou record, @Param("example") HuishouExample example);

    int updateByExample(@Param("record") Huishou record, @Param("example") HuishouExample example);

    int updateByPrimaryKeySelective(Huishou record);

    int updateByPrimaryKey(Huishou record);
}