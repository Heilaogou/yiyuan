package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Report;

import java.util.List;
//药房管理
public interface PharmacyService {
    //查询所有需要取药的病人信息
    List<Report> tselpreson();
    //出库病人处方上的所有药品
    Integer chuku(Integer reportId);
}
