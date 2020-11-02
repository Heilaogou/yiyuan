package com.itgaoshu.yiyuan.bean;

public class Outpatienttype {
    private Integer outpatientid;

    private String projectname;

    private Integer unit;

    private Integer bigprojectid;

    private Double price;

    private Integer ostate;

    public Integer getOutpatientid() {
        return outpatientid;
    }

    public void setOutpatientid(Integer outpatientid) {
        this.outpatientid = outpatientid;
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

    public Integer getBigprojectid() {
        return bigprojectid;
    }

    public void setBigprojectid(Integer bigprojectid) {
        this.bigprojectid = bigprojectid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }
}