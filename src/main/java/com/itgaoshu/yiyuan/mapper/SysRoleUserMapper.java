package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.SysRoleUserExample;
import com.itgaoshu.yiyuan.bean.SysRoleUserKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleUserMapper {
    int countByExample(SysRoleUserExample example);

    int deleteByExample(SysRoleUserExample example);

    int deleteByPrimaryKey(SysRoleUserKey key);

    int insert(SysRoleUserKey record);

    int insertSelective(SysRoleUserKey record);

    List<SysRoleUserKey> selectByExample(SysRoleUserExample example);

    int updateByExampleSelective(@Param("record") SysRoleUserKey record, @Param("example") SysRoleUserExample example);

    int updateByExample(@Param("record") SysRoleUserKey record, @Param("example") SysRoleUserExample example);
}