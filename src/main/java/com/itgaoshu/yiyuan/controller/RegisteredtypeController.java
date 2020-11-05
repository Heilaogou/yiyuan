package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Registeredtype;
import com.itgaoshu.yiyuan.service.RegisteredtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("registeredType")
public class RegisteredtypeController {
    @Autowired
    private RegisteredtypeService registeredtypeService;
    //查询挂号类型列表
    @RequestMapping("registeredTypeList")
    @ResponseBody
    public Object registetredTypeList(Registeredtype registeredtype,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Registeredtype> registeredtypeList=registeredtypeService.registeredTypeList(registeredtype);
        PageInfo pageInfo=new PageInfo(registeredtypeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增挂号类型
    @RequestMapping("addRegisteredType")
    @ResponseBody
    public Object addRegisteredType(Registeredtype registeredtype){
        int count=registeredtypeService.count(registeredtype);
        if(count==0){
            int result=registeredtypeService.addRegisteredType(registeredtype);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else {
            return registeredtype.getType()+"已存在";
        }
    }
    //修改挂号类型
    @RequestMapping("editRegisteredType")
    @ResponseBody
    public Object editRegisteredType(Registeredtype registeredtype){
        int result=registeredtypeService.editRegisteredType(registeredtype);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
}
