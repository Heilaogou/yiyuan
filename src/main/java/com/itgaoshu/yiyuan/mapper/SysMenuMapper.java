package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.SysMenu;
import com.itgaoshu.yiyuan.bean.SysMenuExample;
import com.itgaoshu.yiyuan.bean.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SysMenuMapper {
    int countByExample(SysMenuExample example);

    int deleteByExample(SysMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuExample example);

    SysMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
    //认证
    @Select("select * from sys_user where loginname=#{loginname} and available=1")
    SysUser loginname(String loginname);
    //查询所有菜单
    List<SysMenu> queryMenuByUid(Integer userid);
    List<SysMenu> loadAvailableMenu();
    List<SysMenu> selAllMenuByUser(Integer userId);
    //查询菜单管理左侧菜单树
    @Select("select * from sys_menu")
    List<SysMenu> selectByMenu();
    //查询所有菜单  模糊查询
    List<SysMenu> selectAllSysMenus(SysMenu sysMenu);
    //添加菜单
    int addSysMenu(SysMenu sysMenu);
    //删除菜单
    @Delete("delete from sys_menu where id=#{id}")
    int deleteSysMenu(Integer id);
    //修改菜单
    int updateSysMenu(SysMenu sysMenu);
    //检查是否存在子级目录
    @Select("select count(*) from sys_menu s1 inner join sys_menu s2 on s1.id=s2.pid where s1.id=#{id}")
    int checkSysMenuChildren(Integer id);
}