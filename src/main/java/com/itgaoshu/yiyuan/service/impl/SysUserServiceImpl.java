package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysRole;
import com.itgaoshu.yiyuan.bean.SysRoleUserKey;
import com.itgaoshu.yiyuan.bean.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itgaoshu.yiyuan.service.SysUserService;
import com.itgaoshu.yiyuan.mapper.SysUserMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //修改用户
    @Override
    public int updateSysUser(SysUser sysUser) {
        return sum.updateSysUser(sysUser);
    }
    //重置密码为123456
    @Override
    public int resetpwd(SysUser sysUser) {
        return sum.resetpwd(sysUser);
    }
    //删除用户
    @Override
    public int deleteSysUser(Integer userid) {
        return sum.deleteSysUser(userid);
    }
    //检查用户名是否存在
    @Override
    public int checkloginname(SysUser sysUser) {
        return sum.checkloginname(sysUser);
    }
    //查询角色
    @Override
    public DataGridView selectAllRole(Integer userid) {
        List<SysRole> allrole=sum.selectAllSysRole();
        Integer uid=userid;
        List<SysRoleUserKey> userrole=sum.selectAllSysRoleByUser(uid);
        List<Map<String,Object>> data=new ArrayList<>();
        for (SysRole role:allrole) {
            Boolean LAY_CHECKED=false;
            for (SysRoleUserKey roleuser:userrole) {
                if(role.getRoleid()==roleuser.getRid()){
                    LAY_CHECKED=true;
                }
            }
            Map<String,Object> map=new HashMap<>();
            map.put("roleid",role.getRoleid());
            map.put("rolename",role.getRolename());
            map.put("roledesc",role.getRoledesc());
            map.put("LAY_CHECKED",LAY_CHECKED);
            data.add(map);
        }
        return new DataGridView(data);
    }
    //分配角色
    @Override
    public int insertRoleUser(Integer uid, Integer rid) {
        return sum.insertRoleUser(uid,rid);
    }
    //根据uid和rid查询角色
    @Override
    public int selectUidRid(Integer uid, Integer rid) {
        return sum.selectUidRid(uid,rid);
    }
    //分配角色前根据uid删除已分配角色
    @Override
    public int deleteByUid(Integer uid) {
        return sum.deleteByUid(uid);
    }
    //查询登陆者信息
    @Override
    public List<SysUser> selectLogin(SysUser sysUser) {
        return sum.selectLogin(sysUser);
    }
    //修改用户2(个人资料)
    @Override
    public int updateSysUserIs(SysUser sysUser) {
        return sum.updateSysUserIs(sysUser);
    }
}
