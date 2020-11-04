package com.itgaoshu.yiyuan.service;


import com.itgaoshu.yiyuan.bean.Departments;

import java.util.List;

public interface DepartmentsService {
    List<Departments> selectAll(Departments dm);
}
