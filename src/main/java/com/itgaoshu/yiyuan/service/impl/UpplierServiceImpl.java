package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Upplier;
import com.itgaoshu.yiyuan.mapper.UpplierMapper;
import com.itgaoshu.yiyuan.service.UpplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UpplierServiceImpl implements UpplierService {
    @Autowired
    private UpplierMapper upplierMapper;

    @Override
    public List<Upplier> findAllUpplier(Upplier upplier) {
        return upplierMapper.findAllUpplier(upplier);
    }

    @Override
    public int addUpplier(Upplier upplier) {
        return upplierMapper.addUpplier(upplier);
    }

    @Override
    public int count(Upplier upplier) {
        return upplierMapper.count(upplier);
    }

    @Override
    public int deleteUpplier(Integer upplierid) {
        return upplierMapper.deleteUpplier(upplierid);
    }
}
