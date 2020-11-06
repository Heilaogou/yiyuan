package com.itgaoshu.yiyuan.bean;

public class Outpatienttype {
    private Integer outpatientid;
    private String projectname;
    private String pprojectname;
    private Integer unit;
    private String unitname;
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
    public String getPprojectname() {
        return pprojectname;
    }

    public void setPprojectname(String pprojectname) {
        this.pprojectname = pprojectname;
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
    public String getUnitname(){
        return unitname;
    }
    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }
}