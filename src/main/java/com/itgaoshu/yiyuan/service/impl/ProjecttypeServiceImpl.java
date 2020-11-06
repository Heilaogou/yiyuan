package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.Projecttype;
import com.itgaoshu.yiyuan.mapper.ProjecttypeMapper;
import com.itgaoshu.yiyuan.service.ProjecttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProjecttypeServiceImpl implements ProjecttypeService {
    @Autowired
    private ProjecttypeMapper projecttypeMapper;
    @Override
    public int addProjecttype(Projecttype projecttype) {
        return projecttypeMapper.addProjecttype(projecttype);
    }

    @Override
    public int countp(Projecttype projecttype) {
        return projecttypeMapper.countp(projecttype);
    }

    @Override
    public List<Projecttype> findAllProjecttype(Projecttype projecttype) {
        return projecttypeMapper.findAllProjecttype(projecttype);
    }
}
