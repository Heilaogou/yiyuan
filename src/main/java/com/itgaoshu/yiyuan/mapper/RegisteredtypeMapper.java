package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.bean.RegisteredtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisteredtypeMapper {
    int countByExample(RegisteredtypeExample example);

    int deleteByExample(RegisteredtypeExample example);

    int deleteByPrimaryKey(Integer registeredid);

    int insert(Registeredtype record);

    int insertSelective(Registeredtype record);

    List<Registeredtype> selectByExample(RegisteredtypeExample example);

    Registeredtype selectByPrimaryKey(Integer registeredid);

    int updateByExampleSelective(@Param("record") Registeredtype record, @Param("example") RegisteredtypeExample example);

    int updateByExample(@Param("record") Registeredtype record, @Param("example") RegisteredtypeExample example);

    int updateByPrimaryKeySelective(Registeredtype record);

    int updateByPrimaryKey(Registeredtype record);
}