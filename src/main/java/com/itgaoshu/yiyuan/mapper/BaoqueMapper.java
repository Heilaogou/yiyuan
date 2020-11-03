package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Baoque;
import com.itgaoshu.yiyuan.bean.BaoqueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaoqueMapper {
    int countByExample(BaoqueExample example);

    int deleteByExample(BaoqueExample example);

    int deleteByPrimaryKey(Integer baoqueid);

    int insert(Baoque record);

    int insertSelective(Baoque record);

    List<Baoque> selectByExample(BaoqueExample example);

    Baoque selectByPrimaryKey(Integer baoqueid);

    int updateByExampleSelective(@Param("record") Baoque record, @Param("example") BaoqueExample example);

    int updateByExample(@Param("record") Baoque record, @Param("example") BaoqueExample example);

    int updateByPrimaryKeySelective(Baoque record);

    int updateByPrimaryKey(Baoque record);
}