package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.DepartmentsMapper;
import com.itgaoshu.yiyuan.mapper.RegisteredtypeMapper;
import com.itgaoshu.yiyuan.mapper.ReportMapper;
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
    @Autowired
    private ReportMapper reportMapper;
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
    public List<Doctor> seldoctor(int registerid, int departmentsid) {
        //根据挂号类型，科室查询当天值班的所有医生
        return reportMapper.seldoctor(registerid,departmentsid);
    }

    @Override
    public double seltymo(int registerId) {
        return reportMapper.seltymo(registerId);
    }

    @Override
    public List<Report> selByPhone(String phone) {
        return reportMapper.selByPhone(phone);
    }

    @Override
    public List<Report> selByCard(String carid) {
        return reportMapper.selByCar(carid);
    }

    @Override
    public List<Report> selAll(String name, Integer cc) {
        return reportMapper.selAll(name,cc);
    }

    @Override
    public int addre(Report r) {
        //return reportMapper.insert(r);
        return reportMapper.addre(r);
    }

    @Override
    public int delre(int id) {
        return reportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Cashier> selcha(Integer perid) {
        return reportMapper.selcha(perid);
    }

    @Override
    public List<Pharmacy> seldrug() {
        return reportMapper.seldrug();
    }

}
