package com.itgaoshu.yiyuan.mapper;

import com.itgaoshu.yiyuan.bean.Paiban;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainMapper {
    //查询排班（首页）
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.one='有班'")
    List<Paiban> selectOne();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.two='有班'")
    List<Paiban> selectTwo();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.three='有班'")
    List<Paiban> selectThree();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.four='有班'")
    List<Paiban> selectFour();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.five='有班'")
    List<Paiban> selectFive();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.six='有班'")
    List<Paiban> selectSix();
    @Select("SELECT p.*,d.doctorName,d.doctorid did FROM paiban p right JOIN doctor d ON p.doctorId=d.doctorId where p.seven='有班'")
    List<Paiban> selectSeven();
    //门诊总人数
    @Select("select count(*) from report where state !=0")
    int selectAllReports();
    //今日门诊人数
    @Select("select count(*) from report where time like concat(concat(#{time}),'%') and state!=0")
    int selectReportToday(String time);
    //住院总人数
    @Select("select count(*) from register where state !=0")
    int selectAllRegister();
    //今日门诊人数
    @Select("select count(*) from register where registerdate like concat(concat(#{registerdate}),'%') and state!=0")
    int selectRegisterToday(String registerdate);

}
