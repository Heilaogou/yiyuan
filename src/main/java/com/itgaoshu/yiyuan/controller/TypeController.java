package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Type;
import com.itgaoshu.yiyuan.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("type")
public class TypeController {
    @Autowired
    private TypeService typeService;
    //查询药品分类列表
    @RequestMapping("findAllType")
    @ResponseBody
    private Object findAllType(Type type,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Type> typeList=typeService.findAllType(type);
        PageInfo pageInfo=new PageInfo(typeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增药品类型
    @RequestMapping("addType")
    @ResponseBody
    public Object addType(Type type){
        int count=typeService.count(type);
        if(count==0){
            int result=typeService.addType(type);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else {
            return type.getTypename()+"已存在";
        }
    }
}
