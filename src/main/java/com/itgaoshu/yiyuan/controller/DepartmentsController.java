package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.service.DepartmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("department")
public class DepartmentsController {
    @Autowired
    private DepartmentsService departmentsService;
    //查询所有科室
    @RequestMapping("departmentList")
    @ResponseBody
    public Object departmentList(Departments dm,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Departments> dmlist=departmentsService.selectAll(dm);
        PageInfo pageInfo=new PageInfo(dmlist);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }
    //新增科室
    @RequestMapping("addDepartment")
    @ResponseBody
    public String addDepartment(Departments dm){
        int count=departmentsService.count(dm);
        if(count==0){
            int result=departmentsService.addDepartment(dm);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败，请重新新增";
            }
        }else {
            return dm.getDepartment()+"已存在，请重新输入!";
        }
    }
}
