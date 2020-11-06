package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.mapper.LeaveMapper;
import com.itgaoshu.yiyuan.service.LeaveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Resource
    private LeaveMapper leaveMapper;


    @Override
    public List<Register> selRegisters(Register register) {
        return leaveMapper.selRegisters(register);
    }

    @Override
    public int updRstate(Register register) {
        return leaveMapper.updRstate(register);
    }

    @Override
    public int updBstate(Register register) {
        return leaveMapper.updBstate(register);
    }

    @Override
    public int selYaos(Register register) {
        return leaveMapper.selYaos(register);
    }
}
