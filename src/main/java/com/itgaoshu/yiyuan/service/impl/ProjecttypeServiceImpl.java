package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
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

    @Override
    public List<Bed> findAllBed(Bed bed) {
        return projecttypeMapper.findAllBed(bed);
    }

    @Override
    public int addBed(Bed bed) {
        return projecttypeMapper.addBed(bed);
    }

    @Override
    public int countb(Bed bed) {
        return projecttypeMapper.countb(bed);
    }

    @Override
    public List<Departments> departmentList() {
        return projecttypeMapper.departmentList();
    }

    @Override
    public int editBed(Bed bed) {
        return projecttypeMapper.editBed(bed);
    }

    @Override
    public int deleteBed(Bed bed) {
        return projecttypeMapper.deleteBed(bed);
    }

    @Override
    public List<Moneytype> findAllMoneytype(Moneytype moneytype) {
        return projecttypeMapper.findAllMoneytype(moneytype);
    }

    @Override
    public int countm(Moneytype moneytype) {
        return projecttypeMapper.countm(moneytype);
    }

    @Override
    public int addMoneytype(Moneytype moneytype) {
        return projecttypeMapper.addMoneytype(moneytype);
    }

    @Override
    public int editMoneytype(Moneytype moneytype) {
        return projecttypeMapper.editMoneytype(moneytype);
    }

    @Override
    public int deleteMoneytype(Integer moneyid) {
        return projecttypeMapper.deleteMoneytype(moneyid);
    }

    @Override
    public List<Outpatienttype> findAllOutpatienttype(Outpatienttype outpatienttype) {
        return projecttypeMapper.findAllOutpatienttype(outpatienttype);
    }

    @Override
    public int counto(Outpatienttype outpatienttype) {
        return projecttypeMapper.counto(outpatienttype);
    }

    @Override
    public int addOutpatienttype(Outpatienttype outpatienttype) {
        return projecttypeMapper.addOutpatienttype(outpatienttype);
    }

    @Override
    public int editOutpatienttype(Outpatienttype outpatienttype) {
        return projecttypeMapper.editOutpatienttype(outpatienttype);
    }

    @Override
    public int deleteOutpatienttype(Integer outpatientid) {
        return projecttypeMapper.deleteOutpatienttype(outpatientid);
    }

    @Override
    public List<Projecttype> findAllProjecttype1() {
        return projecttypeMapper.findAllProjecttype1();
    }

    @Override
    public List<Unit> findAllUnit() {
        return projecttypeMapper.findAllUnit();
    }

    @Override
    public List<Inoutpatienttype> findAllInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projecttypeMapper.findAllInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int counti(Inoutpatienttype inoutpatienttype) {
        return projecttypeMapper.counti(inoutpatienttype);
    }

    @Override
    public int addInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projecttypeMapper.addInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int editInoutpatienttype(Inoutpatienttype inoutpatienttype) {
        return projecttypeMapper.editInoutpatienttype(inoutpatienttype);
    }

    @Override
    public int deleteInoutpatienttype(Integer inoutpatientid) {
        return projecttypeMapper.deleteInoutpatienttype(inoutpatientid);
    }

    @Override
    public List<Projecttype> findAllProjecttype2() {
        return projecttypeMapper.findAllProjecttype2();
    }

    @Override
    public List<Unit> findAllUnit1() {
        return projecttypeMapper.findAllUnit1();
    }
}
