package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @RequestMapping("doctorList")
    @ResponseBody
    public Object doctorList(Doctor dt,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Doctor> dtlist=doctorService.doctorList(dt);
        PageInfo pageInfo=new PageInfo(dtlist);
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
