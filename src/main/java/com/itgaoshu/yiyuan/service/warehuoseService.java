package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Warehuose;

import java.util.List;

public interface warehuoseService {
    //新增仓库
    int addWarehuose(Warehuose wh);
    //删除仓库
    int deleteWarehuose(Integer warehuoseId);
    //模糊查询所有仓库
    List<Warehuose> findAllWarehuose(Warehuose wh);
    int count(Warehuose wh);
}
