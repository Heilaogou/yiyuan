package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Register;

import java.util.List;

public interface LeaveService {

    List<Register> selRegisters(Register register);
    int updRstate(Register register);
    int updBstate(Register register);
    int selYaos(Register register);
}
