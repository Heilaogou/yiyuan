package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Registeredtype;

import java.util.List;

public interface RegisteredtypeService {
    //模糊查询挂号类型
    List<Registeredtype> registeredTypeList(Registeredtype registeredtype);
    //新增挂号类型
    int addRegisteredType(Registeredtype registeredtype);
    int count(Registeredtype registeredtype);
    //修改挂号类型
    int editRegisteredType(Registeredtype registeredtype);
}
