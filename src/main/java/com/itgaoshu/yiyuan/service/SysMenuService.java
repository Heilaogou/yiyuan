package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.SysMenu;
import com.itgaoshu.yiyuan.bean.SysUser;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface SysMenuService {
    //认证
    SysUser loginname(String loginname);
    //查询所有菜单
    List<SysMenu> queryMenuByUid(Integer userid);
    List<SysMenu> loadAvailableMenu();
    List<SysMenu> selAllMenuByUser(Integer userId);
    //查询菜单管理左侧菜单树
    List<SysMenu> selectByMenu();
    //查询所有菜单  模糊查询
    List<SysMenu> selectAllSysMenus(SysMenu sysMenu);
    //添加菜单
    int addSysMenu(SysMenu sysMenu);
    //删除菜单
    int deleteSysMenu(Integer pid);
    //修改菜单
    int updateSysMenu(SysMenu sysMenu);
    //检查是否存在子级目录
    int checkSysMenuChildren(Integer id);
}
