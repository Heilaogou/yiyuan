package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.mapper.RegisteredtypeMapper;
import com.itgaoshu.yiyuan.service.RegisteredtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RegisteredtypeServiceImpl implements RegisteredtypeService {
    @Autowired
    private RegisteredtypeMapper registeredtypeMapper;
    @Override
    public List<Registeredtype> registeredTypeList(Registeredtype registeredtype) {
        return registeredtypeMapper.registeredTypeList(registeredtype);
    }

    @Override
    public int addRegisteredType(Registeredtype registeredtype) {
        return registeredtypeMapper.addRegisteredType(registeredtype);
    }

    @Override
    public int count(Registeredtype registeredtype) {
        return registeredtypeMapper.count(registeredtype);
    }

    @Override
    public int editRegisteredType(Registeredtype registeredtype) {
        return registeredtypeMapper.editRegisteredType(registeredtype);
    }
}
