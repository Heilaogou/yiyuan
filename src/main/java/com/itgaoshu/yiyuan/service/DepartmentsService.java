package com.itgaoshu.yiyuan.service;


import com.itgaoshu.yiyuan.bean.Departments;

import java.util.List;

public interface DepartmentsService {
    //模糊查询
    List<Departments> selectAll(Departments dm);
    //新增科室
    int addDepartment(Departments dm);
    //页
    int count(Departments dm);
}
