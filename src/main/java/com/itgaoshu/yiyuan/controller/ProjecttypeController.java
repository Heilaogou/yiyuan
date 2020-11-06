package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.service.ProjecttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("prjectType")
public class ProjecttypeController {
    @Autowired
    private ProjecttypeService projecttypeService;
}
