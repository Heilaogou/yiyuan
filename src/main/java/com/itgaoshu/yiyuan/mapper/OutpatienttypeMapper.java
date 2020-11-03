package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Outpatienttype;
import com.itgaoshu.yiyuan.bean.OutpatienttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutpatienttypeMapper {
    int countByExample(OutpatienttypeExample example);

    int deleteByExample(OutpatienttypeExample example);

    int deleteByPrimaryKey(Integer outpatientid);

    int insert(Outpatienttype record);

    int insertSelective(Outpatienttype record);

    List<Outpatienttype> selectByExample(OutpatienttypeExample example);

    Outpatienttype selectByPrimaryKey(Integer outpatientid);

    int updateByExampleSelective(@Param("record") Outpatienttype record, @Param("example") OutpatienttypeExample example);

    int updateByExample(@Param("record") Outpatienttype record, @Param("example") OutpatienttypeExample example);

    int updateByPrimaryKeySelective(Outpatienttype record);

    int updateByPrimaryKey(Outpatienttype record);
}