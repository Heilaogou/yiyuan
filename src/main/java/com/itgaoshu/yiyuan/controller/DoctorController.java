package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Registeredtype;
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
    //查询医生列表
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
    //新增医生
    @RequestMapping("addDoctor")
    @ResponseBody
    public Object addDoctor(Doctor dt){
        int count=doctorService.count(dt);
        if(count==0){
            int result=doctorService.addDoctor(dt);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return dt.getDoctorname()+"已存在";
        }
    }
    //修改医生信息
    @RequestMapping("editDoctor")
    @ResponseBody
    public Object editDoctor(Doctor dt){
        int result=doctorService.editDoctor(dt);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //在修改，新增和查询界面有科室和挂号类型的数据跟下拉框，所以要写查询方法
    //查询科室信息
    @RequestMapping("findAllDepartments")
    @ResponseBody
    public Object findAllDepartments(){
        List<Departments> departmentsList=doctorService.findAllDepartments();
        return departmentsList;
    }
    //查询挂号类型
    @RequestMapping("findAllRegisteredtype")
    @ResponseBody
    public Object findAllRegisteredtype(){
        List<Registeredtype> registeredtypeList=doctorService.findAllRegisteredtype();
        return registeredtypeList;
    }
}
