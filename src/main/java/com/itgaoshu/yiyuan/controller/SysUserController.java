package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.config.UserCredentialsMatcher;
import com.itgaoshu.yiyuan.service.SysMenuService;
import com.itgaoshu.yiyuan.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sus;
    @Autowired
    private SysMenuService sms;
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
        System.out.println(userid);
        Integer uid=userid;
        int i=0;
        sus.deleteByUid(uid);
        for (int n=0;n<ids.length;n++) {
            i=sus.insertRoleUser(uid,ids[n]);
        }
        if(i!=0){
            return "分配成功";
        }else{
            return "分配失败";
        }
    }
    //修改用户2(个人资料)
    @RequestMapping("updateSysUserIs")
    @ResponseBody
    public String updateSysUserIs(SysUser sysUser){
        System.out.println(sysUser);
        sysUser.setType(2);
        sysUser.setAvailable(1);
        int i=sus.updateSysUserIs(sysUser);

        return "更新成功";

    }
    //修改用户密码(个人资料)
    @RequestMapping("updateSysUserIsPwd")
    @ResponseBody
    public String updateSysUserIsPwd(SysUser sysUser,String loginname,String pwd,String pwd1){
        //第一步：建立subject
        Subject subject = SecurityUtils.getSubject();
        //第二步：封装token  凭证
        UsernamePasswordToken token = new UsernamePasswordToken(loginname, pwd);
        try {
            //只要能通过认证就能通过了
            subject.login(token);
            //加盐
            String salt = UserCredentialsMatcher.generateSalt(6);
            //MD5加密迭代两次
            sysUser.setPwd(UserCredentialsMatcher.encryptPassword("md5", pwd1, salt, 2));
            sysUser.setSalt(salt);
            sus.updateSysUserIsPwd(sysUser);
            return "1";//修改成功
        } catch (IncorrectCredentialsException e) {
            return "0";//密码错误
        }
    }
    //退出，重新登陆
    @RequestMapping("tuichu")
    public String tuichu(HttpSession session){
        session.removeAttribute("user");
        return "view/login";
    }
}
