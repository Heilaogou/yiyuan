package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.mapper.DepartmentsMapper;
import com.itgaoshu.yiyuan.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentsServiceImpl implements DepartmentsService {
    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Override
    public List<Departments> selectAll(Departments dm) {
        return departmentsMapper.selectAll(dm);
    }

    @Override
    public int addDepartment(Departments dm) {
        return departmentsMapper.addDepartment(dm);
    }

    @Override
    public int count(Departments dm) {
        return departmentsMapper.count(dm);
    }
}
