package com.itgaoshu.yiyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layui")
public class TestController {
    @RequestMapping("/report")
    public String report(){
        return "cao/report";
    }
}
