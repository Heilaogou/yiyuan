package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Unit;

import java.util.List;

public interface UnitService {
    //新增计量单位
    int addUnit(Unit unit);
    int count(Unit unit);
    //查询计量单位列表
    List<Unit> findAllUnit(Unit unit);
}
