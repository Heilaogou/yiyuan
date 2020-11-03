package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Warehuose;
import com.itgaoshu.yiyuan.mapper.WarehuoseMapper;
import com.itgaoshu.yiyuan.service.warehuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class warehuoseServiceImpl implements warehuoseService {
    @Autowired
    private WarehuoseMapper warehuosemapper;
    @Override
    public int addWarehuose(Warehuose wh) {
        return warehuosemapper.insert(wh);
    }
}
