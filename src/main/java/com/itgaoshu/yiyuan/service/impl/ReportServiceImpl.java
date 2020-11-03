package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.mapper.DepartmentsMapper;
import com.itgaoshu.yiyuan.mapper.RegisteredtypeMapper;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//科室
public class ReportServiceImpl implements ReportService {
    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Autowired
    private RegisteredtypeMapper registeredtypeMapper;
    @Override
    public List<Departments> selDep() {
        //查询所有科室
        return departmentsMapper.selectByExample(null);
    }

    @Override
    public List<Registeredtype> selreg() {
        //查询所有挂号类型
        return registeredtypeMapper.selectByExample(null);
    }

    @Override
    public List<Doctor> seldoctor(int registerid, int departmentsid, int day) {
        return null;
    }
}
