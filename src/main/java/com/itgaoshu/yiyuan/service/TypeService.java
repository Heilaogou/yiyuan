package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Type;

import java.util.List;

public interface TypeService {
    //查询药品类型列表
    List<Type> findAllType(Type type);
    //新增药品类型
    int addType(Type type);
    int count(Type type);
}
