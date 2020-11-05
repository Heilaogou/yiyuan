package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.*;

import java.util.List;
import java.util.Map;

public interface RegisterService {

    public List<Map<String,Object>> selectAllRegister(Register register);

    public List<Departments> selectAllDepartment(Departments departments);

    public List<Doctor> selectAllDoctor(Doctor doctor);

    public List<Bed> selBed(Bed bed);

    public int addRegister(Register register);

    public int updBed(Register register);

    List<Moneytype> selDis();

    List<Register> selDoor();

    int updZ(Register register);

    int updKe(Register register);

    int updBstate(Register register);



}
