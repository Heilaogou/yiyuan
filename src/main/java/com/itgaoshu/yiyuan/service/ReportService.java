package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//科室

public interface ReportService {
    //查询所有科室
    List<Departments> selDep();
    //查询所有挂号类型
    List<Registeredtype> selreg();
    //根据挂号类型、科室查询当前值班的所有医生
    List<Doctor> seldoctor(int registerid,int departmentsid);
    //根据挂号类型查询挂号费用
    double seltymo(int registerId);
    //查重手机号
    List<Report> selByPhone(String phone);
    //查重身份证号
    List<Report> selByCard(String carid);
    //查询所有挂号
    List<Report> selAll(String name,Integer cc);
    //挂号
    int addre(Report r);
    //删除挂号
    int delre(int id);
    //根据挂号id查询病人的处方信息
    List<Cashier> selcha(Integer perid);
    //查询药房中的所有药品
    List<Pharmacy> seldrug();
}
