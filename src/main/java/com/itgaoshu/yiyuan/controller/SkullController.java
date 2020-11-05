package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Skull;
import com.itgaoshu.yiyuan.service.SkullService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("skull")
public class SkullController {
    @Autowired
    private SkullService skullService;
    //查询经办人列表
    @RequestMapping("findAllSkull")
    @ResponseBody
    public Object findAllSkull(Skull skull,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Skull> skullList=skullService.findAllSkull(skull);
        PageInfo pageInfo=new PageInfo(skullList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增经办人
    @RequestMapping("addSkull")
    @ResponseBody
    public Object addSkull(Skull skull){
        int result=skullService.addSkull(skull);
        if(result==1){
            return "新增成功";
        }else{
            return "新增失败";
        }
    }
    //修改经办人
    @RequestMapping("editSkull")
    @ResponseBody
    public Object editSkull(Skull skull){
        int result=skullService.editSkull(skull);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除经办人
    @RequestMapping("deleteSkull")
    @ResponseBody
    public Object deleteSkull(Integer skullid){
        int result=skullService.deleteSkull(skullid);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
