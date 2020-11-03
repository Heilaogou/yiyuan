package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Warehuose;
import com.itgaoshu.yiyuan.service.warehuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class warehuoseController {
    @Autowired
    private warehuoseService warehuoseservice;
    @RequestMapping("addWarehuose")
    @ResponseBody
    public String addWarehuose(Warehuose wh){
       int result=warehuoseservice.addWarehuose(wh);
       if(result==1){
           return "新增成功";
       }else{
           return "新增失败，请重新新增";
       }
    }
    @RequestMapping("deleteWarehuose")
    @ResponseBody
    public String deleteWarehuose(Integer warehuoseId){
        int result=warehuoseservice.deletewarehuose(warehuoseId);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    @RequestMapping("findAllWarehuose")
    @ResponseBody
    public Object findAllWarehuose(Warehuose wh,Integer page,Integer size){
        PageHelper.startPage(page,size);
        List<Warehuose> whlist=warehuoseservice.findAllWarehuose(wh);
        PageInfo pageInfo=new PageInfo(whlist);
        Map<String,Object> map=new HashMap();
        //总记录数
        map.put("count",pageInfo.getTotal());
        //结果集
        map.put("data",pageInfo.getList());
        return map;
    }
}
