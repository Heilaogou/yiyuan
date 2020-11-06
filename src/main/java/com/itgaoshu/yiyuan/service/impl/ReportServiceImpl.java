package com.itgaoshu.yiyuan.service.impl;

import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.mapper.DepartmentsMapper;
import com.itgaoshu.yiyuan.mapper.RegisteredtypeMapper;
import com.itgaoshu.yiyuan.mapper.ReportMapper;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//挂号
@Service
@Transactional
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;
    @Override
    public List<Departments> selDep() {
        //查询所有科室
        DepartmentsExample departmentsExample = new DepartmentsExample();
        //return departmentsMapper.selectAll();
        return reportMapper.selDep();
    }

    @Override
    public List<Registeredtype> selreg() {
        //查询所有挂号类型
        return reportMapper.selreg();
    }

    @Override
    public List<Doctor> seldoctor(int registerid, int departmentsid) {
        //根据挂号类型，科室查询当天值班的所有医生
        return reportMapper.seldoctor(registerid,departmentsid);
    }

    @Override
    public double seltymo(int registerId) {
        return reportMapper.seltymo(registerId);
    }

    @Override
    public List<Report> selByPhone(String phone) {
        return reportMapper.selByPhone(phone);
    }

    @Override
    public List<Report> selByCard(String carid) {
        return reportMapper.selByCar(carid);
    }

    @Override
    public List<Report> selAll(String name, Integer cc) {
        return reportMapper.selAll(name,cc);
    }

    @Override
    public int addre(Report r) {
        //return reportMapper.insert(r);
        //report中带有price挂号费属性
        /*//根据挂号类型查询挂号费
        //double price = reportMapper.seltymo(r.getReporttype());*/
        //!!!!!!bug:添加挂号时，无法获取到reportid
        //!!!!!!解决：按照原项目，在药品缴费中收费时添加挂号费
        /*//然后在处方表cashier中添加挂号费
        reportMapper.addCashierOfReport(r.getReportid(),r.getPrice());*/
        return reportMapper.addre(r);
    }

    @Override
    public int delre(int id) {
        return reportMapper.delre(id);
    }

    @Override
    public Integer zhuanyuan(Integer id, String zhuan) {
        return reportMapper.zhuanyuan(id,zhuan);
    }

    @Override
    public List<Cashier> selall(Integer perid) {
        return reportMapper.selall(perid);
    }

    @Override
    public List<Pharmacy> seldrug(String drugname) {
        return reportMapper.seldrug(drugname);
    }

    @Override
    public String selbing(Integer reid) {
        return reportMapper.selbing(reid);
    }

    @Override
    public int addbing(Integer reid, String bing) {
        return reportMapper.addbing(reid,bing);
    }

    @Override
    public int selchu(Integer reid, String mename) {
        Integer res =  reportMapper.selchu(reid,mename);
        if(res==null)
            return 0;
        return res;
    }

    @Override
    public int addchu(Integer reid, String durgname, Integer durgnum, Double repiceprice, Double repicetotal, Integer drugstorenum) {
        //return reportMapper.addchu(reid,durgname,durgnum,repiceprice,repicetotal,drugstorenum);
        //先在处方表cashier中添加用药信息
        reportMapper.addchu(reid, durgname, durgnum, repiceprice, repicetotal);
        //更新药房中的药品数量
        return reportMapper.updPharmacyOfnum(durgname,durgnum);
    }

    @Override
    public int updchu(Integer reid, String durgname, Integer durgnum, Double repicetotal, Integer drugstorenum) {
        //更新药房中的药品数量
        reportMapper.updPharmacyOfnum(durgname, durgnum);
        //更新处方中的药品
        return reportMapper.updchu(reid,durgname,durgnum,repicetotal);
    }

    @Override
    public Integer del(Integer cashier, String durnme, Integer durnum) {
        //恢复药房的药品
        reportMapper.backPharmacy(durnme,durnum);
        //删除选中的药品
        return reportMapper.del(cashier);
    }

    @Override
    public List<Outpatienttype> selout(String projectName) {
        return reportMapper.selout(projectName);
    }

    @Override
    public List<Cashier> selximu(Integer perid) {
        return reportMapper.selximu(perid);
    }

    @Override
    public int addchuo(Integer reportId, String durgname, Integer durgnum, Double repiceprice, Double repicetotal, Integer ostate) {
        return reportMapper.addchuo(reportId,durgname,durgnum,repiceprice,repicetotal,ostate);
    }

    @Override
    public int delo(Integer cashier) {
        return reportMapper.delo(cashier);
    }

    @Override
    public List<Cashier> selxiang(Integer perid) {
        return reportMapper.selxiang(perid);
    }

    @Override
    public Double selshoux(Integer perid) {
        return reportMapper.selshoux(perid);
    }

    @Override
    public Integer shoufei(Integer perid) {
        return reportMapper.shoufei(perid);
    }

    @Override
    public List<Cashier> selcha(Integer perid) {
        return reportMapper.selcha(perid);
    }

    @Override
    public Integer addbingc(Integer reid, String bing, Integer cashier) {
        return reportMapper.addbingc(reid, bing, cashier);
    }

    @Override
    public List<Cashier> selpepi(Integer perid) {
        return reportMapper.selpepi(perid);
    }

    @Override
    public Integer seljiao(Integer reid) {
        Integer res = reportMapper.seljiao(reid);
        if(res==null)
            res = 0;
        return res;
    }

    @Override
    public Integer selwei(Integer reid) {
        Integer res = reportMapper.selwei(reid);
        if(res == null)
            res = 0;
        return  res;
    }

    @Override
    public Double selch(Integer reportId) {
        Double res = reportMapper.selch(reportId);
        if(res==0){
            //表示处方中没有需要缴费的药品
            //考虑直接将挂号状态改为3以结束门诊
            reportMapper.end(reportId);
        }
        return res;
    }

    @Override
    public Integer shoufeic(Integer reid, Double price) {
        //根据挂号id缴纳药品费用，并且缴纳挂号费用，并且修改病人状态report.state=2表示该病人看诊结束
        reportMapper.shoufeic(reid);
        reportMapper.addCashierOfReport(reid,price);
        return reportMapper.updState2(reid);
    }

    @Override
    public List<Report> selhuan(String name) {
        return reportMapper.selhuan(name);
    }

    @Override
    public Double zong(Integer reid) {
        //转住院
        return reportMapper.zong(reid);
    }
}
