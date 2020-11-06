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
@RequestMapping("warehouse")
public class warehuoseController {
    @Autowired
    private warehuoseService warehuoseservice;
    //新增仓库
    @RequestMapping("addWarehuose")
    @ResponseBody
    public String addWarehuose(Warehuose wh){
       int count=warehuoseservice.count(wh);
       if(count==0){
           int result=warehuoseservice.addWarehuose(wh);
           if(result==1){
               return "新增成功";
           }else{
               return "新增失败，请重新新增";
           }
       }else {
            return wh.getSupplierName()+"已存在，请重新输入!";
       }
    }
    //删除仓库
    @RequestMapping("deleteWarehuose")
    @ResponseBody
    public String deleteWarehuose(Integer warehuoseId){
        int result=warehuoseservice.deleteWarehuose(warehuoseId);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //模糊查询仓库
    @RequestMapping("findAllWarehuose")
    @ResponseBody
    public Object findAllWarehuose(Warehuose wh, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Warehuose> whlist=warehuoseservice.findAllWarehuose(wh);
        PageInfo pageInfo=new PageInfo(whlist);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        //总记录数
        map.put("count",pageInfo.getTotal());
        //结果集
        map.put("data",pageInfo.getList());
        return map;
    }
}
