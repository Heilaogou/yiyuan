package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Doctor;

import java.util.List;

public interface DoctorService {
    //查询医生列表
    List<Doctor> doctorList(Doctor dt);
}
