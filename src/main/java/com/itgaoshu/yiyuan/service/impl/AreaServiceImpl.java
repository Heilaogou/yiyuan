package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Area;
import com.itgaoshu.yiyuan.mapper.AreaMapper;
import com.itgaoshu.yiyuan.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Area> findAllArea(Area a) {
        return areaMapper.findAllArea(a);
    }

    @Override
    public int addArea(Area a) {
        return areaMapper.addArea(a);
    }

    @Override
    public int count(Area a) {
        return areaMapper.count(a);
    }
}
