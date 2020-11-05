package com.itgaoshu.yiyuan.service;

import com.itgaoshu.yiyuan.bean.*;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//科室

public interface ReportService {
    //==============================用户挂号========================================
    //查询所有科室
    List<Departments> selDep();
    //查询所有挂号类型
    List<Registeredtype> selreg();
    //根据挂号类型、科室查询当前值班的所有医生
    List<Doctor> seldoctor(int registerid,int departmentsid);
    //根据挂号类型查询挂号费用
    double seltymo(int registerId);
    //查重手机号
    List<Report> selByPhone(String phone);
    //查重身份证号
    List<Report> selByCard(String carid);
    //查询所有挂号
    List<Report> selAll(String name,Integer cc);
    //挂号+处方中添加挂号费
    int addre(Report r);
    //删除挂号
    int delre(int id);
    //转住院
    Integer zhuanyuan(Integer id,String zhuan);
    //======================================处方划价=========================================
    //根据挂号id查询病人的处方信息
    List<Cashier> selall(Integer perid);
    //查询药房中的所有药品
    List<Pharmacy> seldrug(String drugname);
    //根据挂号id查询病人病因
    String selbing(Integer reid);
    //根据挂号id更新病因
    int addbing(Integer reid,String bing);
    //根据挂号id查询处方中当前药品的数量
    int selchu(Integer reid,String mename);
    //根据挂号id添加处方+更新药房
    int addchu(Integer reid,String durgname,Integer durgnum,Double repiceprice,Double repicetotal,Integer drugstorenum);
    //根据挂号id更新处方+更新药房
    int updchu(Integer reid,String durgname,Integer durgnum,Double repicetotal,Integer drugstorenum);
    //=========================================项目划价=====================================
    //模糊查询所有的项目信息
    List<Outpatienttype> selout(String projectName);
    //根据挂号id查询病人处方中的项目
    List<Cashier> selximu(Integer perid);
    //给选中的病人添加项目
    int addchuo(Integer reportId,String durgname,Integer durgnum,Double repiceprice,Double repicetotal,Integer ostate);
    //根据处方id删除项目
    int delo(Integer cashier);

    //=========================================项目缴费=====================================
    //根据挂号id查询当前病人所有未缴费的项目
    List<Cashier> selxiang(Integer perid);
    //根据挂号id查询当前病人要缴纳的总费用
    Double selshoux(Integer perid);
    //根据挂号id缴费
    Integer shoufei(Integer perid);

    //=========================================项目检查=====================================
    //根据挂号id查询需要检查的项目
    List<Cashier> selcha(Integer perid);
    //病人做完需要检查的项目后填写检查到的病因
    Integer addbingc(Integer reid,String bing,Integer cashier);

    //=========================================药品缴费=====================================
    //根据挂号id查询当前病人处方中的所有药品信息
    List<Cashier> selpepi(Integer perid);
    //根据挂号id查询是否有未缴费的项目
    Integer seljiao(Integer reid);
    //根据挂号id查询已缴费但未检查的项目
    Integer selwei(Integer reid);
    //根据挂号id查询处方中药品总价
    Double selch(Integer reportId);
    //根据挂号id缴纳药品费用，并且缴纳挂号费用，并且修改病人状态report.state=2表示该病人看诊结束
    Integer shoufeic(Integer reid,Double price);

    //=========================================门诊患者库(病人就诊结束(直到完成取药)后自动加入门诊患者库)=====================================
    //模糊查询所有患者
    List<Report> selhuan(String name);
    //根据挂号id查询病人挂号的总费用
    Double zong(Integer reid);

}
