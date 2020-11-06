package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Unit;
import com.itgaoshu.yiyuan.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("unit")
public class UnitController {
    @Autowired
    private UnitService unitService;
    //查询计量单位列表
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object findAllUnit(Unit unit,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Unit> unitList=unitService.findAllUnit(unit);
        PageInfo pageInfo=new PageInfo(unitList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增计量单位
    @RequestMapping("addUnit")
    @ResponseBody
    public Object addUnit(Unit unit){
        int count=unitService.count(unit);
        if(count==0){
            int result=unitService.addUnit(unit);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return unit.getUnitname()+"已存在";
        }
    }
}
