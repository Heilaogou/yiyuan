package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//挂号管理
public class ReportController {
    @Autowired
    private ReportService reportService;

    //查询所有科室
    @RequestMapping("/zmm/selDep")
    @ResponseBody
    public List<Departments> selDep(){
        List<Departments> dep = reportService.selDep();
        return dep;
    }
    //查询所有挂号类型
    @RequestMapping("/zmm/selreg")
    public List<Registeredtype> selreg(){
        List<Registeredtype> reg = reportService.selreg();
        return reg;
    }
    //根据挂号类型，科室查询当天值班的所有医生
    @RequestMapping("/zmm/seldoctor")
    public List<Doctor> seldoctor(int registeredid,int departmentId){
        return null;
    }
}
