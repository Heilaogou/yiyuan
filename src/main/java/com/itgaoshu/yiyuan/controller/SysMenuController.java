package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysMenu;
import com.itgaoshu.yiyuan.bean.TreeNode;
import com.itgaoshu.yiyuan.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sel")
public class SysMenuController {
    @Autowired
    private SysMenuService sms;
    //跳转到菜单
    @RequestMapping("tiaozhuan")
    public String tiaozhuan(){
        return "templates/view/menu/menuManager.html";
    }
    //查询所有菜单
    @RequestMapping("loadMenuMangerLeftTreeJson")
    @ResponseBody
    public DataGridView loadMenuMangerLeftTreeJson(){
        List<SysMenu> menus=sms.selectByMenu();
        List<TreeNode> nodes=new ArrayList<>();
        for (SysMenu menu:menus) {
            int id=menu.getId();
            int pid=menu.getPid();
            String title=menu.getTitle();
            String icon=menu.getIcon();
            String href=menu.getHref();
            Boolean spread=menu.getSpread() == true;
            String target=menu.getTarget();
            nodes.add(new TreeNode(id,pid,title,icon,href,spread,target));
        }
        return new DataGridView(nodes);
    }
}
