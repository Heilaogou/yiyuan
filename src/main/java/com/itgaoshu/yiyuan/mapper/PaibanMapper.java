package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.bean.PaibanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaibanMapper {
    int countByExample(PaibanExample example);

    int deleteByExample(PaibanExample example);

    int deleteByPrimaryKey(Integer paiid);

    int insert(Paiban record);

    int insertSelective(Paiban record);

    List<Paiban> selectByExample(PaibanExample example);

    Paiban selectByPrimaryKey(Integer paiid);

    int updateByExampleSelective(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByExample(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByPrimaryKeySelective(Paiban record);

    int updateByPrimaryKey(Paiban record);
}