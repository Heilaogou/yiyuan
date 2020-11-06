package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Huishou;
import com.itgaoshu.yiyuan.bean.Pharmacy;
import com.itgaoshu.yiyuan.bean.Report;

import java.util.List;
//药房管理
public interface PharmacyService {
    //查询所有需要取药的病人信息
    List<Report> tselpreson();
    //出库病人处方上的所有药品
    Integer chuku(Integer reportId);
    //查询所有药品
    List<Pharmacy> selectpharmacy(String pharmacyName);
    //报缺药品
    Integer addbaoque(Integer baoqueNum,String baoqueName);
    //药品回收
    Integer delpharymary(Integer pharmacyid, Huishou huishou);
}
