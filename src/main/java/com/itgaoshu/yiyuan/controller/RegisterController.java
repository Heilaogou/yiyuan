package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class RegisterController {

    @Autowired
    private RegisterService registerService;

    //分页查询全部已登记信息
    @RequestMapping("selectAllRegister")
    public String selectAllRegister(Model model,Integer page,Integer limit,Register register){

        return "";
    }




}
