package com.itgaoshu.yiyuan.bean;

/*
药品清单
drugId	int	Not null auto_increment	Primary key, -- 序号
drugName	Varchar(50) Not null,		         -- 药品名称
unitId	Int		Not null,                        -- 计量单位
sellingPrice	Double	Not null,		         -- 售价
areaId	int	Not null,	                         -- 产地
typeId	int	Not null,	                         -- 类型
exprationDate	int	Not null		             -- 保质期
*/
public class Drugdictionary {
    private Integer drugid;

    private String drugname;

    private Integer unitid;
    private String unitname;
    private String areaname;
    private String typename;

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    private Double sellingprice;

    private Integer areaid;

    private Integer typeid;

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}