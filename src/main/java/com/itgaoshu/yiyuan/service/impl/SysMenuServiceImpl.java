package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.SysMenu;
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
    //查询所有菜单
    @Override
    public List<SysMenu> selectByMenu() {
        return smm.selectByMenu();
    }
}
