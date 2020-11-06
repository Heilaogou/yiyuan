package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DrugdictionaryMapper {
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
    int countByExample(DrugdictionaryExample example);

    int deleteByExample(DrugdictionaryExample example);

    int deleteByPrimaryKey(Integer drugid);

    int insert(Drugdictionary record);

    int insertSelective(Drugdictionary record);

    List<Drugdictionary> selectByExample(DrugdictionaryExample example);

    Drugdictionary selectByPrimaryKey(Integer drugid);

    int updateByExampleSelective(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByExample(@Param("record") Drugdictionary record, @Param("example") DrugdictionaryExample example);

    int updateByPrimaryKeySelective(Drugdictionary record);

    int updateByPrimaryKey(Drugdictionary record);



    //自添

    List<Pharmacy> selDrug(Pharmacy pharmacy);
    List<Lrecord> selDrugs(Lrecord lrecord);
    int addDrug(Lrecord lrecord);
    int updDrug(Lrecord lrecord);
    int delDrug(Lrecord lrecord);
    int updDrugs(Lrecord lrecord);
    int updNum(Lrecord lrecord);
    int upd(Lrecord lrecord);

















}