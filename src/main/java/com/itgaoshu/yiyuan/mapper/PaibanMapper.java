package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Ban;
import com.itgaoshu.yiyuan.bean.DataGridView;
import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.bean.PaibanExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.awt.*;
import java.util.List;

public interface PaibanMapper {
    int countByExample(PaibanExample example);

    int deleteByExample(PaibanExample example);

    int deleteByPrimaryKey(Integer paiid);

    int insert(Paiban record);

    int insertSelective(Paiban record);

    List<Paiban> selectByExample(PaibanExample example);

    Paiban selectByPrimaryKey(Integer paiid);

    int updateByExampleSelective(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByExample(@Param("record") Paiban record, @Param("example") PaibanExample example);

    int updateByPrimaryKeySelective(Paiban record);

    int updateByPrimaryKey(Paiban record);
    //查询所有排班
    List<Paiban> selectAllPaiban(Paiban paiban);
    //查询班位
    @Select("select * from ban")
    List<Ban> selectAllBan();
    //查询指定医生的班位
    @Select("select * from paiban where doctorid=#{doctorid}")
    List<Paiban> selectPaibanById(Integer doctorid);
    //显示班位
    DataGridView selectAllBans(Integer doctorid);
    //查询该医生是否安排了班位
    @Select("select count(*) from paiban where doctorid=#{doctorid}")
    int selectBanByDid(Integer doctorid);
    //若该医生未安排班位，修改前先添加
    @Insert("insert into paiban values(null,#{one},#{two},#{three},#{four},#{five},#{six},#{seven},#{doctorid})")
    int insertPaiBan(Paiban paiban);
    //修改排班
    @Update("update paiban set one=#{one},two=#{two},three=#{three},four=#{four},five=#{five},six=#{six},seven=#{seven} where doctorid=#{doctorid}")
    int updatePaiban(Paiban paiban);
}