package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Bed;
import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Register;

import java.util.List;
import java.util.Map;

public interface RegisterService {

    public List<Map<String,Object>> selectAllRegister(Register register);

    public List<Departments> selectAllDepartment(Departments departments);

    public List<Doctor> selectAllDoctor(Doctor doctor);

    public List<Bed> selBed(Bed bed);

    public int addRegister(Register register);



}
