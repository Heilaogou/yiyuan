package com.itgaoshu.yiyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itgaoshu.yiyuan.bean.Bed;
import com.itgaoshu.yiyuan.bean.Departments;
import com.itgaoshu.yiyuan.bean.Doctor;
import com.itgaoshu.yiyuan.bean.Register;
import com.itgaoshu.yiyuan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("liao")
public class RegisterController {

    @Autowired
    //对患者的操作
    private RegisterService registerService;

    //跳转入院登记页面
    @RequestMapping("/admin")
    public String admin(){
        return "liao/admin";
    }

    //分页查询患者信息
    @RequestMapping("selRegister")
    @ResponseBody
    public Object selRegister(Model model,Integer page,Integer limit,Register register){
        //分页查询
        PageHelper.startPage(page,limit);
        //查询未出院的患者信息
        List<Map<String,Object>> selreg = registerService.selectAllRegister(register);
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

    /**
     *页面请求查询科室信息
     */
    @RequestMapping("/selDepartment")
    @ResponseBody
    public Object selDepartment(){
        Departments department=new Departments();
        //查询科室
        List<Departments> departments= registerService.selectAllDepartment(department);
        //把查到的科室返回前台下拉框中
        return departments;
    }

    /**
     * 查询医生信息
     */
    @RequestMapping("/selDoctor")
    @ResponseBody
    public Object selDoctor(Integer departmentId){
        Doctor doctor = new Doctor();
        doctor.setDepartmentid(departmentId);
        System.out.println(doctor.getDepartmentid());
        List<Doctor> doctors = registerService.selectAllDoctor(doctor);
        return doctors;
    }

    /**
     * 查询空床位
     */
    @RequestMapping("/selBed")
    @ResponseBody
    public Object selBed(Integer departmentid){
        Bed bed = new Bed();
        bed.setDepartmentid(departmentid);
        //床位状态为0
        bed.setState(0);
        List<Bed> beds = registerService.selBed(bed);
        return beds;
    }

    /**
     * 添加患者
     */
    /*@RequestMapping("/addRegister")
    @ResponseBody
    public Object addRegister(Register register, HttpServletRequest request){
        Register register1=new Register();
        register1.setIdcard(register.getIdcard());
        //把患者的身份证号查询一下看看是否已经办理入住
        List<Register> registers = ladminService.selRegister(register1);
        if(registers.size()==0){
            //如果是门诊转过来的用户删除门诊患者信息
            if(register.getReportid()!=0){
                ladminService.updZ(register);
            }
            //获取管理人员姓名
            String yonghu = (String)request.getSession().getAttribute("yonghu");
            register.setOperator(yonghu);
            //添加患者信息
            int i = ladminService.addRegister(register);
            if(i==1){
                //修改床位状态
                int j = ladminService.updBed(register);
                if(j==1){
                    return "添加成功";
                }else{
                    return "添加失败";
                }
            }else{
                return "添加失败";
            }
        }else{
            return "该患者已存在，请不要重复添加！";
        }
    }*/

}
