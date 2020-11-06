package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Type;
import com.itgaoshu.yiyuan.mapper.TypeMapper;
import com.itgaoshu.yiyuan.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> findAllType(Type type) {
        return typeMapper.findAllType(type);
    }

    @Override
    public int addType(Type type) {
        return typeMapper.addType(type);
    }

    @Override
    public int count(Type type) {
        return typeMapper.count(type);
    }
}
