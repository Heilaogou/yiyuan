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
    private DepartmentsMapper departmentsMapper;
    @Autowired
    private RegisteredtypeMapper registeredtypeMapper;
    @Autowired
    private ReportMapper reportMapper;
    @Override
    public List<Departments> selDep() {
        //查询所有科室
        DepartmentsExample departmentsExample = new DepartmentsExample();
        //return departmentsMapper.selectAll();
        return departmentsMapper.selectByExample(null);
    }

    @Override
    public List<Registeredtype> selreg() {
        //查询所有挂号类型
        return registeredtypeMapper.selectByExample(new RegisteredtypeExample());
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
        //根据挂号类型查询挂号费
        double price = reportMapper.seltymo(r.getReporttype());
        //然后在处方表cashier中添加挂号费
        reportMapper.addCashierOfReport(r.getReportid(),price);
        return reportMapper.addre(r);
    }

    @Override
    public int delre(int id) {
        return reportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Cashier> selcha(Integer perid) {
        return reportMapper.selcha(perid);
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

}
