package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.SysMenu;
import com.itgaoshu.yiyuan.bean.SysUser;
import com.itgaoshu.yiyuan.bean.TreeNode;
import com.itgaoshu.yiyuan.service.SysMenuService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sel")
public class SysMenuController {
    @Autowired
    private SysMenuService sms;
    //跳转到登陆页面
    @RequestMapping("toLogin")
    public String toLogin() {
        return "view/login";
    }
    //登陆   shiro登陆
    @RequestMapping("login")
    public String login(Model model, HttpServletRequest request, String loginname, String pwd) {


        //第一步：建立subject
        Subject subject = SecurityUtils.getSubject();
        //第二步：封装token  凭证
        UsernamePasswordToken token = new UsernamePasswordToken(loginname, pwd);
        //第三步：登陆
        try {
            //只要能通过认证就能通过了
            subject.login(token);
            SysUser users=sms.loginname(loginname);
            //把user放进session
            request.getSession().setAttribute("user", users);
            model.addAttribute("loginname",users.getRealname());
            model.addAttribute("id",users.getUserid());
            //把yonghu放进session
            request.getSession().setAttribute("yonghu", users.getRealname());
            return "view/index";//跳转首页
        } catch (UnknownAccountException e) {
            //用户为空或不存在
            model.addAttribute("msg", "不存在这样的用户!");
            return "view/login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码输入不对!");
            return "view/login";
        }
    }
    /*
     * 加载首页左边导航栏
     * */
    @RequestMapping("toTreeLoad")
    @ResponseBody
    public List<TreeNode> toTreeLoad(HttpServletRequest request) {
        //获取用户登陆id根据不同的用户有不停菜单
        SysUser user = (SysUser) request.getSession().getAttribute("user");
        ///获取用户登陆id根据不同的用户有不停菜单
        List<SysMenu> list = sms.queryMenuByUid(user.getUserid());
        //创建list集合
        //把list放入nodes
        List<TreeNode> nodes = new ArrayList<>();
        for (SysMenu menus : list) {
            Integer id = menus.getId();
            Integer pid = menus.getPid();
            String title = menus.getTitle();
            String icon = menus.getIcon();
            String href = menus.getHref();
            Boolean spread = menus.getSpread() == true;
            String target = menus.getTarget();
            nodes.add(new TreeNode(id, pid, title, icon, href, spread, target));
        }
        //组装菜单
        List<TreeNode> treeNodes = new ArrayList<>();
        //n1.getPid() == 1 为父级菜单
        for (TreeNode n1 : nodes) {
            if (n1.getPid() == 1) {
                treeNodes.add(n1);
            }
            //将n2放入n1的子级中   id为子级
            for (TreeNode n2 : nodes) {
                if (n2.getPid() == n1.getId()) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return treeNodes;
    }

    //查询菜单管理左侧菜单树
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
    //查询所有菜单  模糊查询
    @RequestMapping("queryMenuAllList")
    @ResponseBody
    public Object queryMenuAllList(SysMenu sysMenu,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<SysMenu> menus=sms.selectAllSysMenus(sysMenu);
        PageInfo pageInfo=new PageInfo(menus);
        Map<String,Object> tableData=new HashMap<>();
        //这是layui要求返回的json数据格式
        tableData.put("code",0);
        tableData.put("msg","");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count",pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data",pageInfo.getList());
        return tableData;
    }
    //添加菜单
    @RequestMapping("addMenu")
    public String addMenu(SysMenu sysMenu){

        int i=sms.addSysMenu(sysMenu);

        System.out.println(i);
        System.out.println(sysMenu);
        if(i!=0){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }
    //删除菜单
    @RequestMapping("deleteMenu")
    public String deleteMenu(Integer id){
        int i=sms.deleteSysMenu(id);
        return "true";
    }
    //修改菜单
    @RequestMapping("updateMenu")
    public Object updateMenu(SysMenu sysMenu){
        int i=sms.updateSysMenu(sysMenu);
        System.out.println(i);
        if(i!=0){
            return "修改成功";
        }else {
            return "修改失败";
        }

    }
    //检查是否存在子级目录
    @RequestMapping("checkMenuHasChildren")
    public String checkMenuHasChildren(Integer id){
        int i=sms.checkSysMenuChildren(id);
        if(i<=0){
            return "1";
        }else{
            return "0";
        }
    }
}
