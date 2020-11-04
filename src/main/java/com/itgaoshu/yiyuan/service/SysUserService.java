package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysUser;

import java.util.List;

public interface SysUserService {
    //查询全部用户  模糊查询
    List<SysUser> selectAllSysUser(SysUser sysUser);
    //添加用户
    int insertSysUser(SysUser sysUser);
    //修改用户
    int updateSysUser(SysUser sysUser);
    //重置密码为123456
    int resetpwd(SysUser sysUser);
    //删除用户
    int deleteSysUser(Integer userid);
    //检查用户名是否存在
    int checkloginname(SysUser sysUser);
    //查询角色
    DataGridView selectAllRole(Integer userid);
    //分配角色
    int insertRoleUser(Integer uid,Integer rid);
}
