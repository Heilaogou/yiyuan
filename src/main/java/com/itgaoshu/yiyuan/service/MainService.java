package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Paiban;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainService {
    //查询排班（首页）
    List<Paiban> selectOne();
    List<Paiban> selectTwo();
    List<Paiban> selectThree();
    List<Paiban> selectFour();
    List<Paiban> selectFive();
    List<Paiban> selectSix();
    List<Paiban> selectSeven();
    //门诊总人数
    int selectAllReports();
    //今日门诊人数
    int selectReportToday(String time);
    //住院总人数
    int selectAllRegister();
    //今日门诊人数
    int selectRegisterToday(String registerdate);
}
