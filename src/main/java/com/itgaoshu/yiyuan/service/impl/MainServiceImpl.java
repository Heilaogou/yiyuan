package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.mapper.MainMapper;
import com.itgaoshu.yiyuan.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MainServiceImpl implements MainService {
    @Autowired
    private MainMapper mm;
    //查询排班
    @Override
    public List<Paiban> selectOne() {
        return mm.selectOne();
    }

    @Override
    public List<Paiban> selectTwo() {
        return mm.selectTwo();
    }

    @Override
    public List<Paiban> selectThree() {
        return mm.selectThree();
    }

    @Override
    public List<Paiban> selectFour() {
        return mm.selectFour();
    }

    @Override
    public List<Paiban> selectFive() {
        return mm.selectFive();
    }

    @Override
    public List<Paiban> selectSix() {
        return mm.selectSix();
    }

    @Override
    public List<Paiban> selectSeven() {
        return mm.selectSeven();
    }
    //门诊总人数
    @Override
    public int selectAllReports() {
        return mm.selectAllReports();
    }
    //今日门诊人数
    @Override
    public int selectReportToday(String time) {
        return mm.selectReportToday(time);
    }

    //住院总人数
    @Override
    public int selectAllRegister() {
        return mm.selectAllRegister();
    }
    //今日住院人数
    @Override
    public int selectRegisterToday(String registerdate) {
        return mm.selectRegisterToday(registerdate);
    }
}
