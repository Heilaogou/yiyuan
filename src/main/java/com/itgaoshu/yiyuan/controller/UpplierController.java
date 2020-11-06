package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Upplier;
import com.itgaoshu.yiyuan.service.UpplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("upplier")
public class UpplierController {
    @Autowired
    private UpplierService upplierService;
    //查询供货商列表
    @RequestMapping("findAllUpplier")
    @ResponseBody
    public Object findAllUpplier(Upplier upplier,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Upplier> upplierList=upplierService.findAllUpplier(upplier);
        PageInfo pageInfo=new PageInfo(upplierList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增供货商
    @RequestMapping("addUpplier")
    @ResponseBody
    public Object addUpplier(Upplier upplier){
        int count=upplierService.count(upplier);
        if(count==0){
            int result=upplierService.addUpplier(upplier);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return upplier.getSuppliername()+"已存在";
        }
    }
    //删除供货商
    @RequestMapping("deleteUpplier")
    @ResponseBody
    public Object deleteUpplier(Integer supplierid){
        int result=upplierService.deleteUpplier(supplierid);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}
