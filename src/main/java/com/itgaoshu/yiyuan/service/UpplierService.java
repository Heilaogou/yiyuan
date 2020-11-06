package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Upplier;

import java.util.List;

public interface UpplierService {
    //查询供货商列表
    List<Upplier> findAllUpplier(Upplier upplier);
    //新增供货商
    int addUpplier(Upplier upplier);
    int count(Upplier upplier);
    //删除供货商
    int deleteUpplier(Integer upplierid);
}
