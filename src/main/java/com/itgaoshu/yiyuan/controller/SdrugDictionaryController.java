package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Area;
import com.itgaoshu.yiyuan.bean.Drugdictionary;
import com.itgaoshu.yiyuan.bean.Type;
import com.itgaoshu.yiyuan.bean.Unit;
import com.itgaoshu.yiyuan.service.DrugdictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("drugdictionary")
public class SdrugDictionaryController {
    @Autowired
    private DrugdictionaryService drugdictionaryService;
    //查询药品字典
    @RequestMapping("findAllSdrugdictionary")
    @ResponseBody
    public Object findAllSdrugdictionary(Drugdictionary drugdictionary,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Drugdictionary> drugdictionaryList=drugdictionaryService.findAllSdrugdictionary(drugdictionary);
        PageInfo pageInfo=new PageInfo(drugdictionaryList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //在药品字典里新增药品
    @RequestMapping("addSdrugdictionary")
    @ResponseBody
    public Object addSdrugdictionary(Drugdictionary drugdictionary){
        int count=drugdictionaryService.count(drugdictionary);
        if(count==0){
            int result=drugdictionaryService.addSdrugdictionary(drugdictionary);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return drugdictionary.getDrugname()+"已存在";
        }
    }
    //查询单位名称
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object findAllUnit(){
        List<Unit> unitList=drugdictionaryService.findAllUnit();
        return  unitList;
    }
    //查询生产地址
    @RequestMapping("findAllArea")
    @ResponseBody
    public Object findAllArea(){
        List<Area> areaList=drugdictionaryService.findAllArea();
        return  areaList;
    }
    //查询类型
    @RequestMapping("findAllType")
    @ResponseBody
    public Object findAllType(){
        List<Type> typeList=drugdictionaryService.findAllType();
        return  typeList;
    }
    //修改药品字典
    @RequestMapping("editSdrugdictionary")
    @ResponseBody
    public Object editSdrugdictionary(Drugdictionary drugdictionary){
        int result=drugdictionaryService.editSdrugdictionary(drugdictionary);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除药品字典
    @RequestMapping("deleteSdrugdictionary")
    @ResponseBody
    public Object deleteSdrugdictionary(Drugdictionary drugdictionary){
        int result=drugdictionaryService.deleteSdrugdictionary(drugdictionary);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
