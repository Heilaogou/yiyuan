package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    //查询所有角色  模糊查询
    List<SysRole> selectAllSysRole(SysRole sysRole);
    //添加角色
    @Insert("insert into sys_role values(null,#{rolename},#{roledesc},#{available})")
    int insertSysRole(SysRole sysRole);
    //删除角色
    @Delete("delete from sys_role where roleid=#{roleid}")
    int deleteSysRole(Integer roleid);
    //修改角色
    @Update("update sys_role set rolename=#{rolename},roledesc=#{roledesc},available=#{available} where roleid=#{roleid}")
    int updateSysRole(SysRole sysRole);
    //查询所有菜单
    @Select("select * from sys_menu")
    List<SysMenu> selectAllSysMenu();
    //查询指定角色所拥有的菜单
    @Select("select * from sys_role_menu where rid=#{rid}")
    List<SysRoleMenuKey> selectAllSysRoleMenuKeyByRid(Integer rid);
    //显示菜单
    DataGridView selectAllMenu(Integer roleid);
    //分配菜单前删除该角色所拥有的菜单
    @Delete("delete from sys_role_menu where rid=#{rid}")
    int deleteAllSysRoleMenuKeyByRid(Integer rid);
    //分配菜单
    @Insert("insert into sys_role_menu values(#{rid},#{mid})")
    int insertSysRoleMenuKey(SysRoleMenuKey srmk);
}