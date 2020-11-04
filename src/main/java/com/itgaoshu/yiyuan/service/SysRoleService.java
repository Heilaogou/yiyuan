package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysRole;
import com.itgaoshu.yiyuan.bean.SysRoleMenuKey;

import java.util.List;

public interface SysRoleService {
    //查询所有角色  模糊查询
    List<SysRole> selectAllSysRole(SysRole sysRole);
    //添加角色
    int insertSysRole(SysRole sysRole);
    //删除角色
    int deleteSysRole(Integer roleid);
    //修改角色
    int updateSysRole(SysRole sysRole);
    //显示菜单
    DataGridView selectAllMenu(Integer roleid);
    //分配菜单前删除该角色所拥有的菜单
    int deleteAllSysRoleMenuKeyByRid(Integer rid);
    //分配菜单
    int insertSysRoleMenuKey(SysRoleMenuKey srmk);
}
