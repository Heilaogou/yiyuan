package com.itgaoshu.yiyuan.bean;

public class Inoutpatienttype {
    private Integer inoutpatientid;
    private String projectname;
    private String pprojectname;
    private String unitname;
    private Integer unit;
    private Integer bigprojectid;

    private Double price;

    public Integer getInoutpatientid() {
        return inoutpatientid;
    }

    public void setInoutpatientid(Integer inoutpatientid) {
        this.inoutpatientid = inoutpatientid;
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
    public String getPprojectname() {
        return pprojectname;
    }

    public void setPprojectname(String pprojectname) {
        this.pprojectname = pprojectname;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

}