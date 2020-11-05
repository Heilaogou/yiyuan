package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Skull;
import com.itgaoshu.yiyuan.mapper.SkullMapper;
import com.itgaoshu.yiyuan.service.SkullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SkullServiceImpl implements SkullService {
    @Autowired
    private SkullMapper skullMapper;
    @Override
    public List<Skull> findAllSkull(Skull skull) {
        return skullMapper.findAllSkull(skull);
    }

    @Override
    public int addSkull(Skull skull) {
        return skullMapper.addSkull(skull);
    }

    @Override
    public int editSkull(Skull skull) {
        return skullMapper.editSkull(skull);
    }

    @Override
    public int deleteSkull(Integer skullid) {
        return skullMapper.deleteSkull(skullid);
    }
}
