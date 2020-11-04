package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Warehuose;
import com.itgaoshu.yiyuan.bean.WarehuoseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehuoseMapper {

    //根据主键删除仓库
    int deleteWarehuose(Integer warehouseid);
    //新增仓库
    int addWarehuose(Warehuose record);
    //自己新增的模糊查询方法
    List<Warehuose> findAllWarehuose(Warehuose wh);
    int count(Warehuose wh);


    int insertSelective(Warehuose record);
    int countByExample(WarehuoseExample example);
    int deleteByExample(WarehuoseExample example);
    List<Warehuose> selectByExample(WarehuoseExample example);
    Warehuose selectByPrimaryKey(Integer warehouseid);
    int updateByExampleSelective(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);
    int updateByExample(@Param("record") Warehuose record, @Param("example") WarehuoseExample example);
    int updateByPrimaryKeySelective(Warehuose record);
    int updateByPrimaryKey(Warehuose record);
}