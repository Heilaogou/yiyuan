package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Type;
import com.itgaoshu.yiyuan.bean.TypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeMapper {
    int countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Integer typeid);
    //查询药品类型列表
    List<Type> findAllType(Type type);
    //新增药品类型
    int addType(Type type);
    int count(Type type);
    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}