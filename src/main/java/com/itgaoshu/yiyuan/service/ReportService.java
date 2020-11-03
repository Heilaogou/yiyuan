package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;
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
    List<Doctor> seldoctor(int registerid,int departmentsid,int day);
}
