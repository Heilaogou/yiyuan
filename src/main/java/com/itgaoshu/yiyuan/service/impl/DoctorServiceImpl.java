package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Doctor;
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
}
