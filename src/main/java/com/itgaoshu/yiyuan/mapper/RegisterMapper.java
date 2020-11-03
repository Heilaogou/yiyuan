package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.bean.RegisterExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RegisterMapper {
    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(Integer registerid);

    int insert(Register record);

    int insertSelective(Register record);

    //查询患者信息
    List<Register> selectAllRegister(Register register);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer registerid);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}