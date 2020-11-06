package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Drugdictionary;
import com.itgaoshu.yiyuan.bean.DrugdictionaryExample;
import com.itgaoshu.yiyuan.bean.Lrecord;
import com.itgaoshu.yiyuan.bean.Pharmacy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface DrugdictionaryMapper {
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