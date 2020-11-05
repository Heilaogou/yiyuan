package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.RegisterMapper;
import com.itgaoshu.yiyuan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class RegisterServiceImpl  implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    //查询患者信息
    @Override
    public List<Map<String,Object>> selectAllRegister(Register register) {
        return registerMapper.selectAllRegister(register);
    }
    //查询科室
    public List<Departments> selectAllDepartment(Departments departments){
        return registerMapper.selectAllDepartment(departments);
    }

    @Override
    public List<Doctor> selectAllDoctor(Doctor doctor) {
        System.out.println(doctor);
        return registerMapper.selectAllDoctor(doctor);
    }

    @Override
    public List<Bed> selBed(Bed bed) {
        return registerMapper.selBed(bed);
    }

    @Override
    public int addRegister(Register register) {
        return registerMapper.addRegister(register);
    }

    //修改床位
    @Override
    public int updBed(Register register) {
        return registerMapper.updBed(register);
    }

    @Override
    public List<Moneytype> selDis() {
        return registerMapper.selDis();
    }

    @Override
    public List<Register> selDoor() {
        return registerMapper.selDoor();
    }

    @Override
    public int updZ(Register register) {
        return registerMapper.updZ(register);
    }

    @Override
    public int updKe(Register register) {
        return registerMapper.updKe(register);
    }


    public int updBstate(Register register) {
        return registerMapper.updBstate(register);
    }
}
