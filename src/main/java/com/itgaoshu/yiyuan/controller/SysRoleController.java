package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysRole;
import com.itgaoshu.yiyuan.bean.SysRoleMenuKey;
import com.itgaoshu.yiyuan.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("role")
public class SysRoleController {
    @Autowired
    private SysRoleService srs;
    //查询所有角色  模糊查询
    @RequestMapping("selectAllSysRole")
    @ResponseBody
    public Object selectAllSysRole(SysRole sysRole,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<SysRole> roles=srs.selectAllSysRole(sysRole);
        PageInfo pageInfo=new PageInfo(roles);
        Map<String,Object> tableData=new HashMap<>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());
        return tableData;
    }
    //添加角色
    @RequestMapping("insertSysRole")
    @ResponseBody
    public String insertSysRole(SysRole sysRole){
        int i=srs.insertSysRole(sysRole);
        if(i!=0){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
    //删除角色
    @RequestMapping("deleteSysRole")
    @ResponseBody
    public String deleteSysRole(Integer roleid){
        int i=srs.deleteSysRole(roleid);
        if(i!=0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //修改角色
    @RequestMapping("updateSysRole")
    @ResponseBody
    public String updateSysRole(SysRole sysRole){
        int i=srs.updateSysRole(sysRole);
        if(i!=0){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //显示菜单
    @RequestMapping("selectAllMenu")
    @ResponseBody
    public DataGridView selectAllMenu(Integer roleid){
        return srs.selectAllMenu(roleid);
    }
    //分配菜单
    @RequestMapping("insertSysRoleMenuKey")
    @ResponseBody
    public String insertSysRoleMenuKey(Integer roleid,Integer[] ids){
        int n=0;
        Integer rid=roleid;
        srs.deleteAllSysRoleMenuKeyByRid(rid);
        for(int i=0;i<ids.length;i++){
            SysRoleMenuKey srmk=new SysRoleMenuKey();
            srmk.setRid(rid);
            srmk.setMid(ids[i]);
            n=srs.insertSysRoleMenuKey(srmk);
        }
        if(n!=0){
            return "分配成功";
        }else{
            return "分配失败";
        }
    }
}
