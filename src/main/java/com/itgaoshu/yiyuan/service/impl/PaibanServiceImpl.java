package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Ban;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.mapper.PaibanMapper;
import com.itgaoshu.yiyuan.service.PaibanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PaibanServiceImpl implements PaibanService {
    @Autowired
    private PaibanMapper pm;
    //查询所有排班
    @Override
    public List<Paiban> selectAllPaiban(Paiban paiban) {
        return pm.selectAllPaiban(paiban);
    }
    //查询班位
    @Override
    public List<Ban> selectAllBan() {
        return pm.selectAllBan();
    }

    //显示班位
    @Override
    public DataGridView selectAllBans(Integer doctorid) {
        List<Ban> bans=pm.selectAllBan();
        List<Paiban> paibans=pm.selectPaibanById(doctorid);
        for (Ban ban:bans) {

        }
        return null;
    }
    //查询该医生是否安排了班位
    @Override
    public int selectBanByDid(Integer doctorid) {
        return pm.selectBanByDid(doctorid);
    }
    //若该医生未安排班位，修改前先添加
    @Override
    public int insertPaiBan(Paiban paiban) {
        return pm.insertPaiBan(paiban);
    }
    //修改排班
    @Override
    public int updatePaiban(Paiban paiban) {
        return pm.updatePaiban(paiban);
    }
}
