package com.itgaoshu.yiyuan.controller;

import com.itgaoshu.yiyuan.bean.Paiban;
import com.itgaoshu.yiyuan.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("main")
public class MainController {
    @Autowired
    private MainService ms;
    //查询排班
    @RequestMapping("selectOne")
    @ResponseBody
    public Object selectOne(){
        List<Paiban> one=ms.selectOne();
        return one;
    }
    @RequestMapping("selectTwo")
    @ResponseBody
    public Object selectTwo(){
        List<Paiban> one=ms.selectTwo();
        return one;
    }
    @RequestMapping("selectThree")
    @ResponseBody
    public Object selectThree(){
        List<Paiban> one=ms.selectThree();
        return one;
    }
    @RequestMapping("selectFour")
    @ResponseBody
    public Object selectFour(){
        List<Paiban> one=ms.selectFour();
        return one;
    }
    @RequestMapping("selectFive")
    @ResponseBody
    public Object selectFive(){
        List<Paiban> one=ms.selectFive();
        return one;
    }
    @RequestMapping("selectSix")
    @ResponseBody
    public Object selectSix(){
        List<Paiban> one=ms.selectSix();
        return one;
    }
    @RequestMapping("selectSeven")
    @ResponseBody
    public Object selectSeven(){
        List<Paiban> one=ms.selectSeven();
        return one;
    }
    //门诊总人数
    @RequestMapping("selectAllReports")
    @ResponseBody
    public int selectAllReports(){
        int count=ms.selectAllReports();
        return count;
    }
    //今日门诊人数
    @RequestMapping("selectReportToday")
    @ResponseBody
    public int selectReportToday(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String time=sdf.format(date);
        System.out.println(time);
        int count=ms.selectReportToday(time);
        return count;
    }
    //住院总人数
    @RequestMapping("selectAllRegister")
    @ResponseBody
    public int selectAllRegister(){
        int count=ms.selectAllRegister();
        return count;
    }
    //今日住院人数
    @RequestMapping("selectRegisterToday")
    @ResponseBody
    public int selectRegisterToday(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String registerdate=sdf.format(date);
        int count=ms.selectRegisterToday(registerdate);
        return count;
    }
}
