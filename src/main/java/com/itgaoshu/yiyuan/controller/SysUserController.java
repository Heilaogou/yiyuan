package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.config.UserCredentialsMatcher;
import com.itgaoshu.yiyuan.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sus;
    //查询全部用户  模糊查询
    @RequestMapping("selectAllUser")
    @ResponseBody
    public Object selectAllUser(SysUser sysUser,Integer page,Integer limit){
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
    //添加用户
    @RequestMapping("addUser")
    @ResponseBody
    public String addUser(SysUser sysUser){
        int a=sus.checkloginname(sysUser);
        if(a!=0){
            return "用户名已存在";
        }else{
            String salt= UserCredentialsMatcher.generateSalt(6);
            sysUser.setPwd(UserCredentialsMatcher.encryptPassword("md5","123456",salt,2));
            sysUser.setType(2);
            sysUser.setSalt(salt);
            int i=sus.insertSysUser(sysUser);
            if(i!=0){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }
    }
    //修改用户
    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(SysUser sysUser){
        int i=sus.updateSysUser(sysUser);
        if(i!=0){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //重置密码为123456
    @RequestMapping("resetUserPwd")
    @ResponseBody
    public String resetUserPwd(SysUser sysUser,Integer userid){
        System.out.println(sysUser);
        sysUser.setUserid(userid);
        String salt=UserCredentialsMatcher.generateSalt(6);
        sysUser.setPwd(UserCredentialsMatcher.encryptPassword("md5","123456",salt,2));
        sysUser.setType(2);
        sysUser.setSalt(salt);
        int i=sus.resetpwd(sysUser);
        if(i!=0){
            return "重置成功，重置密码为123456";
        }else{
            return "重置失败";
        }
    }
    //删除用户
    @RequestMapping("deleteSysUser")
    @ResponseBody
    public String deleteSysUser(Integer userid){
        int i=sus.deleteSysUser(userid);
        if(i!=0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //显示角色
    @RequestMapping("selectAllRole")
    @ResponseBody
    public DataGridView selectAllRole(Integer userid){
        return sus.selectAllRole(userid);
    }
    //分配角色
    @RequestMapping("insertRoleUser")
    @ResponseBody
    public String insertRoleUser(Integer userid,Integer[] ids){
        Integer uid=userid;
        int i=0;
        for (Integer rid:ids) {
            i=sus.insertRoleUser(uid,rid);
        }
        if(i!=0){
            return "分配成功";
        }else{
            return "分配失败";
        }
    }
}
