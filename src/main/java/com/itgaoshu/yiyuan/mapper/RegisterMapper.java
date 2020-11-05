package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RegisterMapper {
    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(Integer registerid);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer registerid);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);



    //自添 查询全部患者信息
    List<Map<String,Object>> selectAllRegister(Register register);

    //查询科室信息
    List<Departments> selectAllDepartment(Departments departments);

    //查询科室内的医生信息
    List<Doctor> selectAllDoctor(Doctor doctor);

    //查询空床位
    List<Bed> selBed(Bed bed);

    //修改床位
    int updBed(Register register);

    //添加住院患者信息
    int addRegister(Register register);

    //查询折扣
    List<Moneytype> selDis();

    //查询门诊过来的患者
    List<Register> selDoor();

    //逻辑删除转院人员
    int updZ(Register register);

    //转科室
    int updKe(Register register);

    //把用户的曾经床位改成空床
    int updBstate(Register register);


}