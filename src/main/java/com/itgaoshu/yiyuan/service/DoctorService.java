package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;

import java.util.List;

public interface DoctorService {
    //查询医生列表
    List<Doctor> doctorList(Doctor dt);
    //新增医生
    int addDoctor(Doctor dt);
    int count(Doctor dt);
    //修改医生信息
    int editDoctor(Doctor dt);
    //查询科室
    List<Departments> findAllDepartments();
    //查询挂号类型
    List<Registeredtype>findAllRegisteredtype();
}
