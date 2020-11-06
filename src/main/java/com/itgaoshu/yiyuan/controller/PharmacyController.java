package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Report;
import com.itgaoshu.yiyuan.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//药房管理
@Controller
@RequestMapping("/zmm")
public class PharmacyController {
    @Autowired
    private PharmacyService pharmacyService;
    //========================门诊取药==========================
    //左侧菜单栏点击门诊取药跳转页面
    @RequestMapping("/seltake")
    public String seltake(){
        return "cao/Cquyao";
    }
    //查询所有需要取药的病人信息
    @RequestMapping("/tselpreson")
    @ResponseBody
    public Object tselpreson(Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Report> list = pharmacyService.tselpreson();
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
    //根据挂号id出库病人处方上的药品
    @RequestMapping("/chuku")
    @ResponseBody
    public Integer chuku(Integer reportId){
        Integer res = pharmacyService.chuku(reportId);
        return res;
    }
    //=====================药房详情==============
    @RequestMapping("/pharymacyhtml")
    public String turn(){
        return "drugstore/c_pharmacy";
    }
}
