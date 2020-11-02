package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.bean.Warehuose;
import com.itgaoshu.yiyuan.service.warehuoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
