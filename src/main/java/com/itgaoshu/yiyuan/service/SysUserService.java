package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.SysUser;

import java.util.List;

public interface SysUserService {
    //查询全部用户  模糊查询
    List<SysUser> selectAllSysUser(SysUser sysUser);
    //添加用户
    int insertSysUser(SysUser sysUser);
}
