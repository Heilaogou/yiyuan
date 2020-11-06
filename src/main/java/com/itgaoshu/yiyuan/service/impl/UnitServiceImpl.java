package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Unit;
import com.itgaoshu.yiyuan.mapper.UnitMapper;
import com.itgaoshu.yiyuan.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UnitServiceImpl implements UnitService {
    @Autowired
    private UnitMapper unitMapper;
    @Override
    public int addUnit(Unit unit) {
        return unitMapper.addUnit(unit);
    }

    @Override
    public int count(Unit unit) {
        return unitMapper.count(unit);
    }

    @Override
    public List<Unit> findAllUnit(Unit unit) {
        return unitMapper.findAllUnit(unit);
    }
}
