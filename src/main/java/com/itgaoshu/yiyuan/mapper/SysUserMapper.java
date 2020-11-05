package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    //查询全部用户  模糊查询
    List<SysUser> selectAllSysUser(SysUser sysUser);
    //添加用户
    @Insert("insert into sys_user values(null,#{loginname},#{identity},#{realname},#{sex},#{address},#{phone},#{pwd},#{position},#{type},#{available},#{salt})")
    int insertSysUser(SysUser sysUser);
    //修改用户
    @Update("update sys_user set realname=#{realname},loginname=#{loginname},identity=#{identity},address=#{address},phone=#{phone},position=#{position},sex=#{sex},available=#{available} where userid=#{userid}")
    int updateSysUser(SysUser sysUser);
    //重置密码为123456
    @Update("update sys_user set pwd=#{pwd} where userid=#{userid}")
    int resetpwd(SysUser sysUser);
    //删除用户
    @Delete("delete from sys_user where userid=#{userid}")
    int deleteSysUser(Integer userid);
    //检查用户名是否存在
    @Select("select count(*) from sys_user where loginname=#{loginname}")
    int checkloginname(SysUser sysUser);
    //查询所有角色
    @Select("select * from sys_role")
    List<SysRole> selectAllSysRole();
    //查询指定用户的所有角色
    @Select("select * from sys_role_user where uid=#{uid}")
    List<SysRoleUserKey> selectAllSysRoleByUser(Integer uid);
    DataGridView selectAllRole(Integer userid);
    //分配角色
    @Insert("insert into sys_role_user values(null,#{uid},#{rid})")
    int insertRoleUser(@Param("uid") Integer uid,@Param("rid") Integer rid);
    //根据uid和rid查询角色
    @Select("select count(*) from sys_role_user where uid=#{uid} and rid=#{rid}")
    int selectUidRid(@Param("uid") Integer uid,@Param("rid") Integer rid);
    //分配角色前根据uid删除已分配角色
    @Delete("delete from sys_role_user where uid=#{uid}")
    int deleteByUid(Integer uid);
    //查询登陆者信息
    @Select("select * from sys_user where userid=#{userid}")
    List<SysUser> selectLogin(SysUser sysUser);
    //修改用户2(个人资料)
    @Update("update sys_user set realname=#{realname},identity=#{identity},address=#{address},phone=#{phone},sex=#{sex} where userid=#{userid}")
    int updateSysUserIs(SysUser sysUser);
    //修改用户密码(个人资料)
    @Update("update sys_user set pwd=#{pwd},salt=#{salt} where loginname=#{loginname}")
    int updateSysUserIsPwd(SysUser sysUser);
}