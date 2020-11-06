package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.DoctorDuibi;
import com.itgaoshu.yiyuan.bean.Finance;
import com.itgaoshu.yiyuan.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("finance")
public class FinanceController {
    @Autowired
    private FinanceService fs;
    //门诊月度统计
    @RequestMapping("selectReportInMonths")
    @ResponseBody
    public Object selectReportInMonths(String year){
        List<Double> doubles=fs.selectReportInMonths(year);
        for(int i=0;i<doubles.size();i++){
            if(doubles.get(i)==null){
                doubles.set(i,0.0);
            }
            System.out.println(doubles.get(i));
        }
        return doubles;
    }
    //住院月度统计
    @RequestMapping("selectRegisterMonths")
    @ResponseBody
    public Object selectRegisterMonths(String year){
        List<Double> doubles=fs.selectRegisterMonths(year);
        for(int i=0;i<doubles.size();i++){
            if(doubles.get(i)==null){
                doubles.set(i,0.0);
            }
        }
        return doubles;
    }
    //门诊年度统计
    @RequestMapping("selectReportInYears")
    @ResponseBody
    public Object selectReportInYears(){
        List<Finance> finances=fs.selectReportInYears();
        return finances;
    }
    //住院年度统计
    @RequestMapping("selectRegisterYears")
    @ResponseBody
    public Object selectRegisterYears(){
        List<Finance> finances=fs.selectRegisterYears();
        return finances;
    }
    //门诊医生对比
    @RequestMapping("selectReportDoctor")
    @ResponseBody
    public Object selectReportDoctor(DoctorDuibi doctorDuibi,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<DoctorDuibi> dd=fs.selectReportDoctor(doctorDuibi);
        for (DoctorDuibi d:dd) {
            System.out.println(d);
        }
        PageInfo pageInfo=new PageInfo(dd);
        Map<String,Object> dataTable=new HashMap<>();
        dataTable.put("code","0");
        dataTable.put("msg","");
        dataTable.put("count",pageInfo.getTotal());
        dataTable.put("data",pageInfo.getList());
        return dataTable;
    }
    //住院医生对比
    @RequestMapping("selectRegisterDoctor")
    @ResponseBody
    public Object selectRegisterDoctor(DoctorDuibi doctorDuibi,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<DoctorDuibi> dd=fs.selectRegisterDoctor(doctorDuibi);
        for (DoctorDuibi d:dd) {
            System.out.println(d);
        }
        PageInfo pageInfo=new PageInfo(dd);
        Map<String,Object> dataTable=new HashMap<>();
        dataTable.put("code","0");
        dataTable.put("msg","");
        dataTable.put("count",pageInfo.getTotal());
        dataTable.put("data",pageInfo.getList());
        return dataTable;
    }
    //门诊当天收入
    @RequestMapping("selectReportDay")
    @ResponseBody
    public Double selectReportDay(String current){
        System.out.println(current);
        Double d=fs.selectReportDay(current);
        if(d==null){
            d=0.0;
        }
        return d;
    }
}
