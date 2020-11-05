package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Lrecord;
import com.itgaoshu.yiyuan.bean.Pay;
import com.itgaoshu.yiyuan.bean.PayExample;
import com.itgaoshu.yiyuan.bean.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PayMapper {
    int countByExample(PayExample example);

    int deleteByExample(PayExample example);

    int deleteByPrimaryKey(Integer payid);

    int insert(Pay record);

    int insertSelective(Pay record);

    List<Pay> selectByExample(PayExample example);

    Pay selectByPrimaryKey(Integer payid);

    int updateByExampleSelective(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByExample(@Param("record") Pay record, @Param("example") PayExample example);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);


    //自添

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);










}