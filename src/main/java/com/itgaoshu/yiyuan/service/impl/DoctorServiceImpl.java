package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.mapper.DoctorMapper;
import com.itgaoshu.yiyuan.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public List<Doctor> doctorList(Doctor dt) {
        return doctorMapper.doctorList(dt);
    }

    @Override
    public int addDoctor(Doctor dt) {
        return doctorMapper.addDoctor(dt);
    }

    @Override
    public int count(Doctor dt) {
        return doctorMapper.count(dt);
    }

    @Override
    public int editDoctor(Doctor dt) {
        return doctorMapper.editDoctor(dt);
    }

    @Override
    public List<Departments> findAllDepartments() {
        return doctorMapper.findAllDepartments();
    }

    @Override
    public List<Registeredtype> findAllRegisteredtype() {
        return doctorMapper.findAllRegisteredtype();
    }
}
