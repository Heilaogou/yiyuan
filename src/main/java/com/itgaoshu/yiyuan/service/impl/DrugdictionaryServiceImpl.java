package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.DrugdictionaryMapper;
import com.itgaoshu.yiyuan.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DrugdictionaryServiceImpl implements DrugdictionaryService {

    @Resource
    private DrugdictionaryMapper drugMapper;

    @Override
    public List<Drugdictionary> findAllSdrugdictionary(Drugdictionary drugdictionary) {
        return drugMapper.findAllSdrugdictionary(drugdictionary);
    }

    @Override
    public int addSdrugdictionary(Drugdictionary drugdictionary) {
        return drugMapper.addSdrugdictionary(drugdictionary);
    }

    @Override
    public int count(Drugdictionary drugdictionary) {
        return drugMapper.count(drugdictionary);
    }

    @Override
    public List<Area> findAllArea() {
        return drugMapper.findAllArea();
    }

    @Override
    public List<Unit> findAllUnit() {
        return drugMapper.findAllUnit();
    }

    @Override
    public List<Type> findAllType() {
        return drugMapper.findAllType();
    }

    @Override
    public int editSdrugdictionary(Drugdictionary drugdictionary) {
        return drugMapper.editSdrugdictionary(drugdictionary);
    }

    @Override
    public int deleteSdrugdictionary(Drugdictionary drugdictionary) {
        return drugMapper.deleteSdrugdictionary(drugdictionary);
    }

    @Override
    public List<Pharmacy> selDrug(Pharmacy pharmacy) {
        return drugMapper.selDrug(pharmacy);
    }

    @Override
    public List<Lrecord> selDrugs(Lrecord lrecord) {
        return drugMapper.selDrugs(lrecord);
    }

    @Override
    public int addDrug(Lrecord lrecord) {
        return drugMapper.addDrug(lrecord);
    }

    @Override
    public int updDrug(Lrecord lrecord) {
        return drugMapper.updDrug(lrecord);
    }

    @Override
    public int delDrug(Lrecord lrecord) {
        return drugMapper.delDrug(lrecord);
    }

    @Override
    public int updDrugs(Lrecord lrecord) {
        return drugMapper.updDrugs(lrecord);
    }

    @Override
    public int updNum(Lrecord lrecord) {
        return drugMapper.updNum(lrecord);
    }

    @Override
    public int upd(Lrecord lrecord) {
        return drugMapper.upd(lrecord);
    }
}
