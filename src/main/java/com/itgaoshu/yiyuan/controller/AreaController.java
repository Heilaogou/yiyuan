package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Area;
import com.itgaoshu.yiyuan.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("area")
public class AreaController {
    @Autowired
    private AreaService areaService;
    //查询所有药品产地
    @RequestMapping("findAllArea")
    @ResponseBody
    public Object findAllArea(Area a,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Area> areaList=areaService.findAllArea(a);
        PageInfo pageInfo=new PageInfo(areaList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增药品产地
    @RequestMapping("addArea")
    @ResponseBody
    public Object addArea(Area a){
        int count=areaService.count(a);
        if(count==0){
            int result=areaService.addArea(a);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return a.getAreaname()+"已存在";
        }
    }
}
