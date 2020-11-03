package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.SysMenu;
import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.mapper.SysMenuMapper;
import com.itgaoshu.yiyuan.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper smm;
    //认证
    @Override
    public SysUser loginname(String loginname) {
        return smm.loginname(loginname);
    }
    //查询所有菜单
    @Override
    public List<SysMenu> queryMenuByUid(Integer userid) {
        return smm.queryMenuByUid(userid);
    }

    @Override
    public List<SysMenu> loadAvailableMenu() {
        return smm.loadAvailableMenu();
    }

    @Override
    public List<SysMenu> selAllMenuByUser(Integer userId) {
        return smm.selAllMenuByUser(userId);
    }

    //查询菜单管理左侧菜单树
    @Override
    public List<SysMenu> selectByMenu() {
        return smm.selectByMenu();
    }
    //查询所有菜单  模糊查询
    @Override
    public List<SysMenu> selectAllSysMenus(SysMenu sysMenu) {
        return smm.selectAllSysMenus(sysMenu);
    }
    //添加菜单
    @Override
    public int addSysMenu(SysMenu sysMenu) {

        return smm.addSysMenu(sysMenu);
    }
    //删除菜单
    @Override
    public int deleteSysMenu(Integer id) {
        return smm.deleteSysMenu(id);
    }
    //修改菜单
    @Override
    public int updateSysMenu(SysMenu sysMenu) {

        return smm.updateSysMenu(sysMenu);
    }
    //检查是否存在子级目录
    @Override
    public int checkSysMenuChildren(Integer id) {
        return smm.checkSysMenuChildren(id);
    }
}
