package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.DoctorDuibi;
import com.itgaoshu.yiyuan.bean.Finance;

import java.util.List;

public interface FinanceService {
    //门诊月度统计
    List<Double> selectReportInMonths(String year);
    //住院月度统计
    List<Double> selectRegisterMonths(String year);
    //门诊年度统计
    List<Finance> selectReportInYears();
    //住院年度统计
    List<Finance> selectRegisterYears();
    //门诊医生对比
    List<DoctorDuibi> selectReportDoctor(DoctorDuibi doctorDuibi);
    //住院医生对比
    List<DoctorDuibi> selectRegisterDoctor(DoctorDuibi doctorDuibi);
    //门诊当天收入
    Double selectReportDay(String time);
}
