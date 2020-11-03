package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.mapper.RegisterMapper;
import com.itgaoshu.yiyuan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RegisterServiceImpl  implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    //查询患者信息
    @Override
    public List<Register> selectAllRegister(Register register) {
        return null;
    }
}
