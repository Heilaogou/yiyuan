package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Ban;
import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.service.PaibanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("paiban")
public class PaibanController {
    @Autowired
    private PaibanService ps;
    //查询所有排班
    @RequestMapping("selectAllPaiban")
    @ResponseBody
    public Object selectAllPaiban(Paiban paiban,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Paiban> paibans=ps.selectAllPaiban(paiban);
        PageInfo pageInfo=new PageInfo(paibans);
        Map<String,Object> dataTable=new HashMap<>();
        dataTable.put("code","0");
        dataTable.put("msg","");
        dataTable.put("count",pageInfo.getTotal());
        dataTable.put("data",pageInfo.getList());
        return dataTable;
    }
    //查询所有班位
    @RequestMapping("selectAllBan")
    @ResponseBody
    public Object selectAllBan(){
        List<Ban> bans=ps.selectAllBan();
        return bans;
    }
    //修改排班
    @RequestMapping("updatePaiban")
    @ResponseBody
    public String updatePaiban(Paiban paiban){
        int count=ps.selectBanByDid(paiban.getDid());
        paiban.setDoctorid(paiban.getDid());
        if(count!=0){
            ps.updatePaiban(paiban);
        }else{
            ps.insertPaiBan(paiban);
            ps.updatePaiban(paiban);
        }
        return "修改成功";
    }
}
