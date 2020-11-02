package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Upplier;
import com.itgaoshu.yiyuan.bean.UpplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpplierMapper {
    int countByExample(UpplierExample example);

    int deleteByExample(UpplierExample example);

    int deleteByPrimaryKey(Integer supplierid);

    int insert(Upplier record);

    int insertSelective(Upplier record);

    List<Upplier> selectByExample(UpplierExample example);

    Upplier selectByPrimaryKey(Integer supplierid);

    int updateByExampleSelective(@Param("record") Upplier record, @Param("example") UpplierExample example);

    int updateByExample(@Param("record") Upplier record, @Param("example") UpplierExample example);

    int updateByPrimaryKeySelective(Upplier record);

    int updateByPrimaryKey(Upplier record);
}