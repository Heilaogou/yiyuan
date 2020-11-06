package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.*;

import java.util.List;

//药品清单
public interface DrugdictionaryService {
    //数据中心↓
    //直接查询药品字典
    List<Drugdictionary> findAllSdrugdictionary(Drugdictionary drugdictionary);
    //在药品字典里面新增药品
    int addSdrugdictionary(Drugdictionary drugdictionary);
    int count(Drugdictionary drugdictionary);
    //查询生产地址
    List<Area> findAllArea();
    //查询单位名称
    List<Unit> findAllUnit();
    //查询类型
    List<Type> findAllType();
    //修改药品字典
    int editSdrugdictionary(Drugdictionary drugdictionary);
    //删除药品字典
    int deleteSdrugdictionary(Drugdictionary drugdictionary);
    List<Pharmacy> selDrug(Pharmacy pharmacy);
    List<Lrecord> selDrugs(Lrecord lrecord);
    int addDrug(Lrecord lrecord);
    int updDrug(Lrecord lrecord);
    int delDrug(Lrecord lrecord);
    int updDrugs(Lrecord lrecord);
    int updNum(Lrecord lrecord);
    int upd(Lrecord lrecord);
}
