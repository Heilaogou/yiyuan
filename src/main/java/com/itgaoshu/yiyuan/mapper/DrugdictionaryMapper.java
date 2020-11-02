package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Drugdictionary;
import com.itgaoshu.yiyuan.bean.DrugdictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugdictionaryMapper {
    int countByExample(DrugdictionaryExample example);

    int deleteByExample(DrugdictionaryExample example);

    int deleteByPrimaryKey(Integer drugid);

    int insert(Drugdictionary record);

    int insertSelective(Drugdictionary record);

    List<Drugdictionary> selectByExample(DrugdictionaryExample example);

    Drugdictionary selectByPrimaryKey(Integer drugid);

    int updateByExampleSelective(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByExample(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByPrimaryKeySelective(Drugdictionary record);

    int updateByPrimaryKey(Drugdictionary record);
}