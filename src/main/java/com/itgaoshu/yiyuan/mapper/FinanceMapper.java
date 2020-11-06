package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.DoctorDuibi;
import com.itgaoshu.yiyuan.bean.Finance;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FinanceMapper {
    //门诊月度统计
    List<Double> selectReportInMonths(String year);
    //住院月度统计
    List<Double> selectRegisterMonths(String year);
    //门诊年度统计
    @Select("SELECT SUM(repicetotal) VALUE,DATE_FORMAT(ctime,'%Y') NAME FROM cashier c,report r WHERE c.reportId=r.reportId AND r.state=3 GROUP BY DATE_FORMAT(ctime,'%Y')")
    List<Finance> selectReportInYears();
    //住院年度统计
    @Select("SELECT SUM(price) VALUE,DATE_FORMAT(endDate,'%Y') NAME FROM register WHERE state=1 GROUP BY DATE_FORMAT(endDate,'%Y')")
    List<Finance> selectRegisterYears();
    //门诊医生对比
    List<DoctorDuibi> selectReportDoctor(DoctorDuibi doctorDuibi);
    //住院医生对比
    List<DoctorDuibi> selectRegisterDoctor(DoctorDuibi doctorDuibi);
    //门诊当天收入
    @Select("SELECT SUM(repicetotal) FROM cashier c,report r WHERE DATE_FORMAT(ctime,'%Y-%m-%d')=CONCAT(#{time}) AND c.reportId=r.reportId AND r.state=3")
    Double selectReportDay(String time);
}
