package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.SysRoleMapper;
import com.itgaoshu.yiyuan.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper srm;
    //查询所有角色  模糊查询
    @Override
    public List<SysRole> selectAllSysRole(SysRole sysRole) {
        return srm.selectAllSysRole(sysRole);
    }
    //添加角色
    @Override
    public int insertSysRole(SysRole sysRole) {
        return srm.insertSysRole(sysRole);
    }
    // 删除角色
    @Override
    public int deleteSysRole(Integer roleid) {
        return srm.deleteSysRole(roleid);
    }
    //修改角色
    @Override
    public int updateSysRole(SysRole sysRole) {
        return srm.updateSysRole(sysRole);
    }
    //显示菜单
    @Override
    public DataGridView selectAllMenu(Integer roleid) {
        Integer rid=roleid;
        List<SysMenu> menus=srm.selectAllSysMenu();
        List<SysRoleMenuKey> rolemenu=srm.selectAllSysRoleMenuKeyByRid(rid);
        List<TreeNode> data=new ArrayList<>();
        for (SysMenu menu:menus) {
            String checkArr="0";
            for (SysRoleMenuKey rolem:rolemenu) {
                if(menu.getId()==rolem.getMid()){
                    checkArr="1";
                    break;
                }
            }
            Integer id=menu.getId();
            Integer pid=menu.getPid();
            String title=menu.getTitle();
            Boolean spread=menu.getSpread()==true;
            data.add(new TreeNode(id,pid,title,spread,checkArr));
        }
        return new DataGridView(data);
    }
    //分配菜单前删除该角色所拥有的菜单
    @Override
    public int deleteAllSysRoleMenuKeyByRid(Integer rid) {
        return srm.deleteAllSysRoleMenuKeyByRid(rid);
    }
    //分配菜单
    @Override
    public int insertSysRoleMenuKey(SysRoleMenuKey srmk) {
        return srm.insertSysRoleMenuKey(srmk);
    }
}
