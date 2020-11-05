package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Skull;
import com.itgaoshu.yiyuan.bean.SkullExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SkullMapper {
    int countByExample(SkullExample example);

    int deleteByExample(SkullExample example);

    int deleteByPrimaryKey(Integer skullid);
    //查询所有经办人信息
    List<Skull> findAllSkull(Skull skull);
    //添加经办人
    int addSkull(Skull skull);
    //修改经办人
    int editSkull(Skull skull);
    //删除经办人
    int deleteSkull(Integer skullid);

    int insertSelective(Skull record);

    List<Skull> selectByExample(SkullExample example);

    Skull selectByPrimaryKey(Integer skullid);

    int updateByExampleSelective(@Param("record") Skull record, @Param("example") SkullExample example);

    int updateByExample(@Param("record") Skull record, @Param("example") SkullExample example);

    int updateByPrimaryKeySelective(Skull record);

    int updateByPrimaryKey(Skull record);
}