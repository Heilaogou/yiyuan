package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SysUserController {
    @Autowired
    private SysUserService sus;
    //查询全部用户  模糊查询
    public Object selectAllSysUser(SysUser sysUser,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<SysUser> users=sus.selectAllSysUser(sysUser);
        PageInfo pageInfo=new PageInfo(users);
        Map<String,Object> tableData=new HashMap<>();
        tableData.put("code",0);
        tableData.put("msg","");
        tableData.put("count",pageInfo.getTotal());
        tableData.put("data",pageInfo.getList());
        return tableData;
    }
}
