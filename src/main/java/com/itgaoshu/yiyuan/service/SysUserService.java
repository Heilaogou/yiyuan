package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysUser;
import org.apache.ibatis.annotations.Param;

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
    //根据uid和rid查询角色
    int selectUidRid(Integer uid,Integer rid);
    //分配角色前根据uid删除已分配角色
    int deleteByUid(Integer uid);
    //查询登陆者信息
    List<SysUser> selectLogin(SysUser sysUser);
    //修改用户2(个人资料)
    int updateSysUserIs(SysUser sysUser);
    //修改用户密码(个人资料)
    int updateSysUserIsPwd(SysUser sysUser);
}
