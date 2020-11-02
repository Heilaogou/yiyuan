package com.itgaoshu.yiyuan.bean;

public class Inhospitaltype {
    private Integer inhospitalid;

    private String projectname;

    private Integer unit;

    private Double price;

    private Integer bigprojectid;

    public Integer getInhospitalid() {
        return inhospitalid;
    }

    public void setInhospitalid(Integer inhospitalid) {
        this.inhospitalid = inhospitalid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBigprojectid() {
        return bigprojectid;
    }

    public void setBigprojectid(Integer bigprojectid) {
        this.bigprojectid = bigprojectid;
    }
}