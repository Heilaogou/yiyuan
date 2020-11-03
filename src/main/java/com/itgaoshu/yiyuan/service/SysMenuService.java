package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.SysMenu;

import java.util.List;

public interface SysMenuService {
    //查询所有菜单
    List<SysMenu> selectByMenu();
}
