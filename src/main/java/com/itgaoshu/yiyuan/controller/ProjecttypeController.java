package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.*;
import com.itgaoshu.yiyuan.service.ProjecttypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("prjectType")
public class ProjecttypeController {
    @Autowired
    private ProjecttypeService projecttypeService;
<<<<<<< Updated upstream
=======
    //查询项目大类
    @RequestMapping("findAllProjecttype")
    @ResponseBody
    public Object findAllProjecttype(Projecttype projecttype,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Projecttype> projecttypeList=projecttypeService.findAllProjecttype(projecttype);
        PageInfo pageInfo=new PageInfo(projecttypeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增项目大类
    @RequestMapping("addProjecttype")
    @ResponseBody
    public Object addProjecttype(Projecttype projecttype){
        int countp=projecttypeService.countp(projecttype);
        if(countp==0){
            int result=projecttypeService.addProjecttype(projecttype);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return projecttype.getProjectname()+"已存在";
        }
    }
    //查询床位
    @RequestMapping("findAllBed")
    @ResponseBody
    public Object findAllBed(Bed bed,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<Bed> bedList=projecttypeService.findAllBed(bed);
        PageInfo pageInfo=new PageInfo(bedList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增床位
    @RequestMapping("addBed")
    @ResponseBody
    public Object addBed(Bed bed){
        int countb=projecttypeService.countb(bed);
        if(countb==0){
            int result=projecttypeService.addBed(bed);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return bed.getBedname()+"已存在";
        }
    }
    //下拉框
    @RequestMapping("departmentList")
    @ResponseBody
    public Object departmentList(){
        List<Departments> departmentsList=projecttypeService.departmentList();
        return departmentsList;
    }
    //修改床位信息
    @RequestMapping("editBed")
    @ResponseBody
    public Object editBed(Bed bed){
        int result=projecttypeService.editBed(bed);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除床位
    @RequestMapping("deleteBed")
    @ResponseBody
    public Object deleteBed(Bed bed){
        int result=projecttypeService.deleteBed(bed);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //查询收费类型
    @RequestMapping("findAllMoneytype")
    @ResponseBody
    public Object findAllMoneytype(Moneytype moneytype, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Moneytype> moneytypeList=projecttypeService.findAllMoneytype(moneytype);
        PageInfo pageInfo=new PageInfo(moneytypeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增收费类型
    @RequestMapping("addMoneytype")
    @ResponseBody
    public Object addBed(Moneytype moneytype){
        int countm=projecttypeService.countm(moneytype);
        if(countm==0){
            int result=projecttypeService.addMoneytype(moneytype);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return moneytype.getMoneytype()+"已存在";
        }
    }
    //修改收费类型
    @RequestMapping("editMoneytype")
    @ResponseBody
    public Object editMoneytype(Moneytype moneytype){
        int result=projecttypeService.editMoneytype(moneytype);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除收费类型
    @RequestMapping("deleteMoneytype")
    @ResponseBody
    public Object deleteMoneytype(Integer moneyid){
        int result=projecttypeService.deleteMoneytype(moneyid);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //查询门诊收费项目
    @RequestMapping("findAllOutpatienttype")
    @ResponseBody
    public Object findAllOutpatienttype(Outpatienttype outpatienttype, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Outpatienttype> outpatienttypeList=projecttypeService.findAllOutpatienttype(outpatienttype);
        PageInfo pageInfo=new PageInfo(outpatienttypeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增门诊收费项目
    @RequestMapping("addOutpatienttype")
    @ResponseBody
    public Object addOutpatienttype(Outpatienttype outpatienttype){
        int counto=projecttypeService.counto(outpatienttype);
        if(counto==0){
            int result=projecttypeService.addOutpatienttype(outpatienttype);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return outpatienttype.getProjectname()+"已存在";
        }
    }
    //修改门诊收费项目
    @RequestMapping("editOutpatienttype")
    @ResponseBody
    public Object editOutpatienttype(Outpatienttype outpatienttype){
        int result=projecttypeService.editOutpatienttype(outpatienttype);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除门诊收费项目
    @RequestMapping("deleteOutpatienttype")
    @ResponseBody
    public Object deleteOutpatienttype(Integer outpatientid){
        int result=projecttypeService.deleteOutpatienttype(outpatientid);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //下拉框
    @RequestMapping("findAllProjecttype1")
    @ResponseBody
    public Object findAllProjecttype1(){
        List<Projecttype> projecttypeList=projecttypeService.findAllProjecttype1();
        return projecttypeList;
    }
    @RequestMapping("findAllUnit")
    @ResponseBody
    public Object findAllUnit(){
        List<Unit> unitList=projecttypeService.findAllUnit();
        return unitList;
    }
    //查询住院收费项目
    @RequestMapping("findAllInoutpatienttype")
    @ResponseBody
    public Object findAllInoutpatienttype(Inoutpatienttype inoutpatienttype, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<Inoutpatienttype> inoutpatienttypeList=projecttypeService.findAllInoutpatienttype(inoutpatienttype);
        PageInfo pageInfo=new PageInfo(inoutpatienttypeList);
        Map<String,Object> map=new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    //新增住院收费项目
    @RequestMapping("addInoutpatienttype")
    @ResponseBody
    public Object addInoutpatienttype(Inoutpatienttype inoutpatienttype){
        int counti=projecttypeService.counti(inoutpatienttype);
        if(counti==0){
            int result=projecttypeService.addInoutpatienttype(inoutpatienttype);
            if(result==1){
                return "新增成功";
            }else{
                return "新增失败";
            }
        }else{
            return inoutpatienttype.getProjectname()+"已存在";
        }
    }
    //修改住院收费项目
    @RequestMapping("editInoutpatienttype")
    @ResponseBody
    public Object editInoutpatienttype(Inoutpatienttype inoutpatienttype){
        int result=projecttypeService.editInoutpatienttype(inoutpatienttype);
        if(result==1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }
    //删除住院收费项目
    @RequestMapping("deleteInoutpatienttype")
    @ResponseBody
    public Object deleteInoutpatienttype(Integer inoutpatientid){
        int result=projecttypeService.deleteInoutpatienttype(inoutpatientid);
        if(result==1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    //下拉框
    @RequestMapping("findAllProjecttype2")
    @ResponseBody
    public Object findAllProjecttype2(){
        List<Projecttype> projecttypeList=projecttypeService.findAllProjecttype2();
        return projecttypeList;
    }
    @RequestMapping("findAllUnit1")
    @ResponseBody
    public Object findAllUnit1(){
        List<Unit> unitList=projecttypeService.findAllUnit1();
        return unitList;
    }
>>>>>>> Stashed changes
}
