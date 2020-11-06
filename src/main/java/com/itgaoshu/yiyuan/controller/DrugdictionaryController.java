package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Lrecord;
import com.itgaoshu.yiyuan.bean.Pharmacy;
import com.itgaoshu.yiyuan.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//药品清单
@Controller
@RequestMapping("liao")
public class DrugdictionaryController {

    @Autowired
    private DrugdictionaryService drugService;

    //跳转药品登记页面
    @RequestMapping("/drug")
    public String admin(){
        return "liao/drug";
    }
    //跳转取药页面
    @RequestMapping("/pharmacy")
    public String pharmacy(){
        return "liao/pharmacy";
    }

    //查询药品信息
    @RequestMapping("/selDrug")
    @ResponseBody
    public Object selDrug(Integer page, Integer limit, Pharmacy pharmacy){
        PageHelper.startPage(page, limit);
        List<Pharmacy> listAll =drugService.selDrug(pharmacy);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    //查询用户的药品信息
    @RequestMapping("/selDrugs")
    @ResponseBody
    public Object selDrugs(Integer page, Integer limit, Lrecord lrecord){
        lrecord.setState(0);
        PageHelper.startPage(page, limit);
        List<Lrecord> listAll =drugService.selDrugs(lrecord);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询用户取过的药品信息
    @RequestMapping("/selPhar")
    @ResponseBody
    public Object selPhar(Integer page, Integer limit, Lrecord lrecord){
        lrecord.setState(2);
        PageHelper.startPage(page, limit);
        List<Lrecord> listAll =drugService.selDrugs(lrecord);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    //查询药品库存数量
    @RequestMapping("/selNum")
    @ResponseBody
    public Object selNum(Integer pharmacyId){
        Pharmacy pharmacy=new Pharmacy();
        pharmacy.setPharmacyid(pharmacyId);
        List<Pharmacy> listAll =drugService.selDrug(pharmacy);
        return listAll;
    }

    //添加药品清单
    @RequestMapping("/addDrug")
    @ResponseBody
    @Transactional
    public Object addDrug(Lrecord lrecord) {
        //查询是否添加过该药品
        lrecord.setState(0);
        int rel = 0;
        //查询是否添加过但未取出该药品
        List<Lrecord> lrecords = drugService.selDrugs(lrecord);
        System.out.println(lrecord);
        for (int i = 0; i < lrecords.size(); i++) {
            if (lrecords.get(i).getDurgname().equals(lrecord.getDurgname())) {
                rel = 1;
                break;
            }
        }
        if (rel == 1) {
            //修改患者药品数量
            int j = drugService.updDrug(lrecord);
            if (j == 1) {
                //减少药品数量
                int o = drugService.updNum(lrecord);
                if (o == 1) {
                    return "添加成功";
                } else {
                    return "添加失败";
                }
            } else {
                return "添加失败";
            }
        } else {
            //计算总价
            Double qian = lrecord.getRepiceprice();
            Integer shu = lrecord.getDurgnum();
            Double sum = qian * shu;
            lrecord.setRepicetotal(sum);
            lrecord.setState(0);
            //添加药品
            int i = drugService.addDrug(lrecord);
            if (i == 1) {
                //减少药品数量
                int j = drugService.updNum(lrecord);
                if (j == 1) {
                    return "添加成功";
                } else {
                    return "添加失败";
                }
            } else {
                return "添加失败";
            }
        }
    }

    //移除患者的药品信息
    @RequestMapping("/delDrug")
    @ResponseBody
    public Object delDrug(Integer hospitalpriceid,String durgname,Integer durgnum){
        Lrecord lrecord=new Lrecord();
        lrecord.setHospitalpriceid(hospitalpriceid);
        int i = drugService.delDrug(lrecord);
        if (i == 1) {
            lrecord.setDurgname(durgname);
            lrecord.setDurgnum(durgnum);
            int j = drugService.updDrugs(lrecord);
            if (j == 1) {
                return "移除成功";
            } else {
                return "移除失败";
            }
        } else {
            return "移除失败";
        }
    }

    //改变患者的药品状态
    @RequestMapping("/updDrug")
    @ResponseBody
    public Object updItem(Lrecord lrecord){
        int upd = drugService.upd(lrecord);
        System.out.println(upd);
        return "取药成功";
    }

}
