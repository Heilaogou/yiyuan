package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Jilu;
import com.itgaoshu.yiyuan.bean.JiluExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiluMapper {
    int countByExample(JiluExample example);

    int deleteByExample(JiluExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(Jilu record);

    int insertSelective(Jilu record);

    List<Jilu> selectByExample(JiluExample example);

    Jilu selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") Jilu record, @Param("example") JiluExample example);

    int updateByExample(@Param("record") Jilu record, @Param("example") JiluExample example);

    int updateByPrimaryKeySelective(Jilu record);

    int updateByPrimaryKey(Jilu record);
}