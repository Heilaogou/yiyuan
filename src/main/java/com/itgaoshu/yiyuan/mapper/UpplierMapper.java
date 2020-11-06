package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Upplier;
import com.itgaoshu.yiyuan.bean.UpplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpplierMapper {
    //查询供货商列表
    List<Upplier> findAllUpplier(Upplier upplier);
    //新增供货商
    int addUpplier(Upplier upplier);
    int count(Upplier upplier);
    //删除供货商
    int deleteUpplier(Integer upplierid);

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