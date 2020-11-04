package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//挂号管理
@Controller
@RequestMapping("/cao")
public class ReportController {
    @Autowired
    private ReportService reportService;

    //查询所有科室
    @RequestMapping("/seldep")
    @ResponseBody
    public List<Departments> selDep(){
        List<Departments> dep = reportService.selDep();
        return dep;
    }
    //查询所有挂号类型
    @RequestMapping("/selreg")
    @ResponseBody
    public List<Registeredtype> selreg(){
        List<Registeredtype> reg = reportService.selreg();
        return reg;
    }

    //根据挂号类型，科室查询所有医生   (根据挂号类型，科室查询当天值班的所有医生??)
    @RequestMapping("/seldoctor")
    @ResponseBody
    public List<Doctor> seldoctor(int registeredid,int departmentId){
        List<Doctor> doc = reportService.seldoctor(registeredid,departmentId);
        System.out.println("report-seldoctor-doc"+doc.size()+doc.get(0));
        return doc;
    }
    //根据挂号类型查询挂号费
    @RequestMapping("/seltymo")
    @ResponseBody
    public double seltymo(int registeredId){
        System.out.println("report-seltymo-registerId"+registeredId);
        double price = reportService.seltymo(registeredId);
        return price;
    }
    //挂号时对手机号和身份证号进行查重
    @RequestMapping("/phone")
    @ResponseBody
    public int phone(String phone,String carid){
        List<Report> r1=reportService.selByPhone(phone);
        if(r1!=null && r1.size()!=0){
            return 1;
        }
        List<Report> r2 = reportService.selByCard(carid);
        if(r2!=null && r2.size()!=0){
            return 2;
        }
        return 3;
    }
    //查询挂号信息
    //cc:1-查询所有，2-当天挂号,3-预约挂号
    @RequestMapping("/index")
    public String index(String params, Integer cc, Model model){
        if(params==null)
            params="";
        List<Report> report = reportService.selAll(params,cc);
        model.addAttribute("report",report);
        return "cao/report";
    }
    //添加挂号
    @RequestMapping("/addre")
    @ResponseBody
    public String addre(Report r){
        System.out.println("report-addre"+r);
        int res = reportService.addre(r);
        if(res==1){
            return "添加成功";
        }else{
            return "添加失败，请重新尝试";
        }
    }
    //删除前查询处方总价
    @RequestMapping("/selch")
    public int selch(int reportId){
        return 0;
    }
    //删除挂号
    @RequestMapping("/delre")
    @ResponseBody
    public String delre(int id){
        int res = reportService.delre(id);
        if(res==1){
            return "删除成功";
        }else{
            return "删除失败，请稍后重新尝试";
        }
    }

    //===========================================
    //左侧菜单栏点击处方划价跳转页面
    @RequestMapping("/cc")
    public String cc(){
        return "cao/cashier";
    }
    //查询病人
    @RequestMapping("/selpreson")
    @ResponseBody
    public Object selpreson(int page,int limit,Model model){
        PageHelper.startPage(page,limit);
        List<Report> reports = reportService.selAll("",1);
        PageInfo<Report> reportPageInfo = new PageInfo<>(reports);
        //model.addAttribute("code",0);
        //return reportPageInfo;

        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", reportPageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", reportPageInfo.getList());
        return tableData;
    }
    //查询被选中病人的处方
    @RequestMapping("/selcha")
    @ResponseBody
    public Object selcha(Integer perid,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Cashier> cashiers = reportService.selcha(perid);
        PageInfo pageInfo = new PageInfo(cashiers);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询药房中的药品信息
    @RequestMapping("/seldrug")
    @ResponseBody
    public Object seldrug(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Pharmacy> list = reportService.seldrug();
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
}
