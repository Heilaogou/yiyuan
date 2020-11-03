package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("liao")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    //分页查询全部已登记信息
    @RequestMapping("selectAllRegister")
    @ResponseBody
    public Object selectAllRegister(Model model,Integer page,Integer limit,Register register){
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Register> selreg = registerService.selectAllRegister(register);
        //查出的信息存储到分页插件中
        PageInfo pageInfo = new PageInfo(selreg);
        Map<String,Object> tableDate = new HashMap<String, Object>();
        tableDate.put("code",0);
        tableDate.put("msg","");
        tableDate.put("count",pageInfo.getTotal());
        tableDate.put("data",pageInfo.getList());
        //返回layui
        return tableDate;
    }




}
