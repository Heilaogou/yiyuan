package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.bean.RegisteredtypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisteredtypeMapper {
    //模糊查询挂号类型
    List<Registeredtype> registeredTypeList(Registeredtype registeredtype);
    //新增挂号类型
    int addRegisteredType(Registeredtype registeredtype);
    int count(Registeredtype registeredtype);
    //修改挂号类型
    int editRegisteredType(Registeredtype registeredtype);

    int countByExample(RegisteredtypeExample example);

    int deleteByExample(RegisteredtypeExample example);

    int deleteByPrimaryKey(Integer registeredid);


    int insertSelective(Registeredtype record);

    List<Registeredtype> selectByExample(RegisteredtypeExample example);

    Registeredtype selectByPrimaryKey(Integer registeredid);

    int updateByExampleSelective(@Param("record") Registeredtype record, @Param("example") RegisteredtypeExample example);

    int updateByExample(@Param("record") Registeredtype record, @Param("example") RegisteredtypeExample example);

    int updateByPrimaryKeySelective(Registeredtype record);

    int updateByPrimaryKey(Registeredtype record);
}