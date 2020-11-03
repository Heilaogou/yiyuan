package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.mapper.SysUserMapper;
import com.itgaoshu.yiyuan.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sum;
    //查询全部用户  模糊查询
    @Override
    public List<SysUser> selectAllSysUser(SysUser sysUser) {
        return sum.selectAllSysUser(sysUser);
    }
    //添加用户
    @Override
    public int insertSysUser(SysUser sysUser) {
        return sum.insertSysUser(sysUser);
    }
}
