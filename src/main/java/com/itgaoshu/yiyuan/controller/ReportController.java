package com.itgaoshu.yiyuan.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.MysqlForeignKey;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//挂号管理
@Controller
@RequestMapping("/cao")
public class ReportController {
    @Autowired
    private ReportService reportService;

    //==============================用户挂号========================================
    //左侧菜单栏点击处方划价跳转页面
    //查询挂号信息
    //cc:1-查询所有，2-当天挂号,3-预约挂号
    @RequestMapping("/index")
    public String index(String params, Integer cc, Model model){
        if(params==null)
            params="";
        List<Report> report = reportService.selAll(params,cc);
        model.addAttribute("report",report);
        return "cao/report";
    }

    //查询所有科室
    @RequestMapping("/seldep")
    @ResponseBody
    public List<Departments> selDep(){
        List<Departments> dep = reportService.selDep();
        return dep;
    }
    //查询所有挂号类型
    @RequestMapping("/selreg")
    @ResponseBody
    public List<Registeredtype> selreg(){
        List<Registeredtype> reg = reportService.selreg();
        return reg;
    }

    //根据挂号类型，科室查询所有医生   (根据挂号类型，科室查询当天值班的所有医生??)
    @RequestMapping("/seldoctor")
    @ResponseBody
    public List<Doctor> seldoctor(int registeredid,int departmentId){
        List<Doctor> doc = reportService.seldoctor(registeredid,departmentId);
        //System.out.println("report-seldoctor-doc"+doc.size()+doc.get(0));
        return doc;
    }
    //根据挂号类型查询挂号费
    @RequestMapping("/seltymo")
    @ResponseBody
    public double seltymo(int registeredId){
        System.out.println("report-seltymo-registerId"+registeredId);
        double price = reportService.seltymo(registeredId);
        return price;
    }
    //挂号时对手机号和身份证号进行查重
    @RequestMapping("/phone")
    @ResponseBody
    public int phone(String phone,String carid){
        List<Report> r1=reportService.selByPhone(phone);
        if(r1!=null && r1.size()!=0){
            return 1;
        }
        List<Report> r2 = reportService.selByCard(carid);
        if(r2!=null && r2.size()!=0){
            return 2;
        }
        return 3;
    }

    //添加挂号
    @RequestMapping("/addre")
    @ResponseBody
    public String addre(Report r){
        System.out.println("report-addre"+r);
        int res = reportService.addre(r);
        if(res==1){
            return "添加成功";
        }else{
            return "添加失败，请重新尝试";
        }
    }
    //(!!!!!!!!!未实现)删除前查询处方总价
    /*@RequestMapping("/selch")
    public int selch(int reportId){
        return 0;
    }*/
    //删除挂号
    @RequestMapping("/delre")
    @ResponseBody
    public String delre(int id){
        int res = reportService.delre(id);
        if(res==1){
            return "删除成功";
        }else{
            return "删除失败，请稍后重新尝试";
        }
    }
    //转住院
    @RequestMapping("/zhuanyuan")
    @ResponseBody
    public Integer zhuanyuan(Integer id,String zhuan){
        Integer res = reportService.zhuanyuan(id,zhuan);
        return res;
    }

    //======================================处方划价=========================================
    //左侧菜单栏点击处方划价跳转页面
    @RequestMapping("/cc")
    public String cc(){
        return "cao/cashier";
    }
    //查询病人
    @RequestMapping("/selpreson")
    @ResponseBody
    public Object selpreson(int page,int limit,Model model){
        PageHelper.startPage(page,limit);
        List<Report> reports = reportService.selAll("",1);
        PageInfo<Report> reportPageInfo = new PageInfo<>(reports);
        //model.addAttribute("code",0);
        //return reportPageInfo;

        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", reportPageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", reportPageInfo.getList());
        return tableData;
    }
    //查询被选中病人的处方
    @RequestMapping("/selall")
    @ResponseBody
    public Object selall(Integer perid,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Cashier> cashiers = reportService.selall(perid);
        PageInfo pageInfo = new PageInfo(cashiers);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //(模糊)查询药房中的药品信息
    @RequestMapping("/seldrug")
    @ResponseBody
    public Object seldrug(String durgname,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        if(durgname==null) durgname="";
        System.out.println("report-seldrug"+durgname);
        List<Pharmacy> list = reportService.seldrug(durgname);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //根据挂号id查询病人的病因
    @RequestMapping("/selbing")
    @ResponseBody
    public String selbing(Integer reid){
        String bing = reportService.selbing(reid);
        return bing;
    }
    //根据挂号id更新病人病因
    @RequestMapping("/addbing")
    @ResponseBody
    public int addbing(Integer reid,String bing){
        int res = reportService.addbing(reid,bing);
        return res;
    }

    //根据挂号id查询病人处方中当前药品的数量
    @RequestMapping("/selchu")
    @ResponseBody
    public int selchu(Integer reid,String mename){
        int num = reportService.selchu(reid,mename);
        return num;
    }
    //如果selchu=0则添加处方并修改药房
    @RequestMapping("/addchu")
    @ResponseBody
    //前端bug:durgnum与drugstorenum是一个数，遂弃用drugstorenum，然后在mapper中自行计算
    public int addchu(Integer reportId,String durgname,Integer durgnum,Double repiceprice,Double repicetotal,Integer drugstorenum){
        int res = reportService.addchu(reportId,durgname,durgnum,repiceprice,repicetotal,drugstorenum);
        return res;
    }
    //如果selchu!=0则修改处方并修改药房
    @RequestMapping("/updchu")
    @ResponseBody
    public int updchu(Integer reportId,String durgname,Integer durgnum,Double repicetotal,Integer drugstorenum){
        int res = reportService.updchu(reportId, durgname, durgnum, repicetotal, drugstorenum);
        return  res;
    }

    //删除选中的药品
    @RequestMapping("/del")
    @ResponseBody
    public Integer del(Integer cashier,String durnme,Integer durnum){
        Integer res = reportService.del(cashier,durnme,durnum);
        return res;
    }

    //=========================================项目划价=====================================
    //左侧菜单栏点击项目划价跳转页面
    @RequestMapping("/xiang")
    public String xiang(){
        return "cao/Cxiangmu";
    }
    //查询所有的项目信息
    @RequestMapping("/selout")
    @ResponseBody
    public Object selout(String projectName,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        if(projectName==null) projectName="";
        List<Outpatienttype> list = reportService.selout(projectName);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        //注意!!!!!map中的四个键不可变，是layui规定好的
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //根据挂号id查询病人处方中的项目
    @RequestMapping("/selximu")
    @ResponseBody
    public Object selximu(Integer perid,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Cashier> list = reportService.selximu(perid);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //给选中的病人添加项目
    @RequestMapping("/addchuo")
    @ResponseBody
    public int addchuo(Integer reportId,String durgname,Integer durgnum,Double repiceprice,Double repicetotal,Integer ostate){
        int res = reportService.addchuo(reportId,durgname,durgnum,repiceprice,repicetotal,ostate);
        return res;
    }
    //根据处方id删除选中的项目
    @RequestMapping("/delo")
    @ResponseBody
    public String delo(Integer cashier){
        int res = reportService.delo(cashier);
        if(res==1){
            return "删除成功";
        }else{
            return "删除失败，请稍后重新尝试";
        }
    }
    //=========================================项目缴费(项目划价后进行缴费)=====================================
    //左侧菜单栏点击项目缴费跳转页面
    @RequestMapping("/xiangpay")
    public String xiangpay(){
        return "cao/xaingmupay";
    }
    //根据挂号id查询当前病人需要缴费的项目
    @RequestMapping("/selxiang")
    @ResponseBody
    public Object selxiang(Integer perid,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Cashier> list = reportService.selxiang(perid);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //根据挂号id查询病人需要缴纳的费用
    @RequestMapping("/selshoux")
    @ResponseBody
    public Double selshoux(Integer perid){
        Double sum = reportService.selshoux(perid);
        return sum;
    }
    //根据挂号id缴费
    @RequestMapping("/shoufei")
    @ResponseBody
    public int shoufei(Integer perid){
        int res = reportService.shoufei(perid);
        return res;
    }
    //=========================================项目检查(项目缴费后才能检查)=====================================
    //左侧菜单栏点击项目检查跳转页面
    @RequestMapping("/seljian")
    public String seljian(){
        return "cao/jiancha";
    }
    //根据挂号id查询当前病人需要检查的项目(ostate=1)
    @RequestMapping("/selcha")
    @ResponseBody
    public Object selcha(Integer perid,Integer limit,Integer page){
        PageHelper.startPage(page,limit);
        List<Cashier> list = reportService.selcha(perid);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //病人做完要检查的项目后添加检查到的病因
    @RequestMapping("/addbingc")
    @ResponseBody
    public Integer addbingc(Integer reid,String bing,Integer cashier){
        Integer res = reportService.addbingc(reid,bing,cashier);
        return  res;
    }

    //=========================================药品缴费(项目都已缴费且都已检查完后才可缴纳药品费;药品缴费后到药房取(门诊)药)=====================================
    //左侧菜单栏点击药品缴费跳转页面
    @RequestMapping("/out")
    public String out(){
        return "cao/Ctoll";
    }
    //根据挂号id查询当前病人处方中的所有药品信息
    @RequestMapping("/selpepi")
    @ResponseBody
    public Object selpepi(Integer perid,Integer limit,Integer page){
        PageHelper.startPage(page,limit);
        List<Cashier> list = reportService.selpepi(perid);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //根据挂号id查询是否有未缴费的项目
    @RequestMapping("/seljiao")
    @ResponseBody
    public Integer seljiao(Integer reid){
        Integer res = reportService.seljiao(reid);
        return  res;
    }
    //根据挂号id查询已缴费但未检查的项目
    @RequestMapping("/selwei")
    @ResponseBody
    public Integer selwei(Integer reid){
        Integer res = reportService.selwei(reid);
       if(res==0){
           //不存在未检查的项目，可以进行缴费
           return 1;
       }else {
           return 0;
       }
    }
    //根据挂号id查询处方中药品总价
    @RequestMapping("/selch")
    @ResponseBody
    public Double selch(Integer reportId){
        Double res = reportService.selch(reportId);
        return res;
    }
    //根据挂号id缴纳药品费用，并且缴纳挂号费用，并且修改病人状态report.state=2表示该病人看诊结束
    @RequestMapping("/shoufeic")
    @ResponseBody
    public Integer shoufeic(Integer reportId,Double price){
        Integer res = reportService.shoufeic(reportId,price);
        return  res;
    }

    //=========================================门诊患者库(病人就诊结束(直到完成取药)后自动加入门诊患者库)=====================================
    //左侧菜单栏点击门诊患者库跳转页面
    @RequestMapping("/haun")
    public  String haun(){
        return "cao/chuanzhe";
    }
    //查询所有门诊患者
    @RequestMapping("/selhuan")
    @ResponseBody
    public Object selhuan(String name,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        if(name==null) name="";
        List<Report> list = reportService.selhuan(name);
        PageInfo pageInfo = new PageInfo(list);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式，如果后台没有加上这句话的话需要在前台页面手动设置
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //根据挂号id查询病人就诊的所有费用
    @RequestMapping("/zong")
    @ResponseBody
    public Double zong(Integer reid){
        Double res = reportService.zong(reid);
        return res;
    }
}
