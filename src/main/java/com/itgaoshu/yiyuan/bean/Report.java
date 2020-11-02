package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Report {
    private Integer reportid;

    private String reportname;

    private String sex;

    private Integer age;

    private Integer department;

    private Integer doctor;

    private Integer reporttype;

    private Double price;

    private Date time;

    private String users;

    private Integer state;

    private String phone;

    private String carid;

    private String zhuan;

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname == null ? null : reportname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public Integer getDoctor() {
        return doctor;
    }

    public void setDoctor(Integer doctor) {
        this.doctor = doctor;
    }

    public Integer getReporttype() {
        return reporttype;
    }

    public void setReporttype(Integer reporttype) {
        this.reporttype = reporttype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users == null ? null : users.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan == null ? null : zhuan.trim();
    }
}