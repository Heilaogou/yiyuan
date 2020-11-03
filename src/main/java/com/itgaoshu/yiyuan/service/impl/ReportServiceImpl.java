package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.DepartmentsMapper;
import com.itgaoshu.yiyuan.mapper.RegisteredtypeMapper;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//挂号
@Service
@Transactional
public class ReportServiceImpl implements ReportService {
    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Autowired
    private RegisteredtypeMapper registeredtypeMapper;
    @Override
    public List<Departments> selDep() {
        //查询所有科室
        DepartmentsExample departmentsExample = new DepartmentsExample();
        //return departmentsMapper.selectAll();
        return departmentsMapper.selectByExample(null);
    }

    @Override
    public List<Registeredtype> selreg() {
        //查询所有挂号类型
        return registeredtypeMapper.selectByExample(new RegisteredtypeExample());
    }

    @Override
    public List<Doctor> seldoctor(int registerid, int departmentsid, int day) {
        return null;
    }
}
