package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.SysRoleMenuExample;
import com.itgaoshu.yiyuan.bean.SysRoleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    int countByExample(SysRoleMenuExample example);

    int deleteByExample(SysRoleMenuExample example);

    int deleteByPrimaryKey(SysRoleMenuKey key);

    int insert(SysRoleMenuKey record);

    int insertSelective(SysRoleMenuKey record);

    List<SysRoleMenuKey> selectByExample(SysRoleMenuExample example);

    int updateByExampleSelective(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);

    int updateByExample(@Param("record") SysRoleMenuKey record, @Param("example") SysRoleMenuExample example);
}