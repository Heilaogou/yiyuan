package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Drugstore {
    private Integer rugstoreid;

    private String drugstorename;

    private Integer supplierid;

    private Integer skullid;

    private Integer warehouseid;

    private Integer unit;

    private Double tradeprice;

    private Double sellingprice;

    private Integer area;

    private Integer type;

    private Date producedate;

    private Date validdate;

    private Integer drugstorenum;

    private String batch;

    public Integer getRugstoreid() {
        return rugstoreid;
    }

    public void setRugstoreid(Integer rugstoreid) {
        this.rugstoreid = rugstoreid;
    }

    public String getDrugstorename() {
        return drugstorename;
    }

    public void setDrugstorename(String drugstorename) {
        this.drugstorename = drugstorename == null ? null : drugstorename.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getTradeprice() {
        return tradeprice;
    }

    public void setTradeprice(Double tradeprice) {
        this.tradeprice = tradeprice;
    }

    public Double getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Double sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }
}