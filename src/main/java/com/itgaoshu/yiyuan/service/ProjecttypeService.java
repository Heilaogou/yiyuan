package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.Projecttype;

import java.util.List;

public interface ProjecttypeService {
    //新增项目大类
    int addProjecttype(Projecttype projecttype);
    int countp(Projecttype projecttype);
    //查询项目大类
    List<Projecttype> findAllProjecttype(Projecttype projecttype);
}
