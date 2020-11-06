package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.DoctorDuibi;
import com.itgaoshu.yiyuan.bean.Finance;
import com.itgaoshu.yiyuan.mapper.FinanceMapper;
import com.itgaoshu.yiyuan.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class FinanceServiceImpl implements FinanceService {
    @Autowired
    private FinanceMapper fm;
    //门诊月度统计
    @Override
    public List<Double> selectReportInMonths(String year) {
        return fm.selectReportInMonths(year);
    }
    //住院月度统计
    @Override
    public List<Double> selectRegisterMonths(String year) {
        return fm.selectRegisterMonths(year);
    }
    //门诊年度统计
    @Override
    public List<Finance> selectReportInYears() {
        return fm.selectReportInYears();
    }
    //住院年度统计
    @Override
    public List<Finance> selectRegisterYears() {
        return fm.selectRegisterYears();
    }
    //门诊医生对比
    @Override
    public List<DoctorDuibi> selectReportDoctor(DoctorDuibi doctorDuibi) {
        return fm.selectReportDoctor(doctorDuibi);
    }
    //住院医生对比
    @Override
    public List<DoctorDuibi> selectRegisterDoctor(DoctorDuibi doctorDuibi) {
        return fm.selectRegisterDoctor(doctorDuibi);
    }
    //门诊当天收入
    @Override
    public Double selectReportDay(String time) {
        return fm.selectReportDay(time);
    }
}
