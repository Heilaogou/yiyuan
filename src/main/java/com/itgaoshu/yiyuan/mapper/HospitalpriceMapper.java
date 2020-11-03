package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Hospitalprice;
import com.itgaoshu.yiyuan.bean.HospitalpriceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HospitalpriceMapper {
    int countByExample(HospitalpriceExample example);

    int deleteByExample(HospitalpriceExample example);

    int deleteByPrimaryKey(Integer hospitalpriceid);

    int insert(Hospitalprice record);

    int insertSelective(Hospitalprice record);

    List<Hospitalprice> selectByExample(HospitalpriceExample example);

    Hospitalprice selectByPrimaryKey(Integer hospitalpriceid);

    int updateByExampleSelective(@Param("record") Hospitalprice record, @Param("example") HospitalpriceExample example);

    int updateByExample(@Param("record") Hospitalprice record, @Param("example") HospitalpriceExample example);

    int updateByPrimaryKeySelective(Hospitalprice record);

    int updateByPrimaryKey(Hospitalprice record);
}