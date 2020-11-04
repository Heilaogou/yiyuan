package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Pharmacy {
    private Integer pharmacyid;

    private String pharmacyname;

    private Integer drugstoreid;

    private Integer skullid;

    private Integer warehouseid;

    private Integer unit;

    private Unit u;
    public String getUnitname(){
        return u.getUnitname();
    }

    private Double sellingprice;

    private Integer area;

    private Integer type;

    private Date producedate;

    private Date validdate;

    private Integer drugstorenum;

    private String skullbatch;

    public Integer getPharmacyid() {
        return pharmacyid;
    }

    public void setPharmacyid(Integer pharmacyid) {
        this.pharmacyid = pharmacyid;
    }

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname == null ? null : pharmacyname.trim();
    }

    public Integer getDrugstoreid() {
        return drugstoreid;
    }

    public void setDrugstoreid(Integer drugstoreid) {
        this.drugstoreid = drugstoreid;
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

    public String getSkullbatch() {
        return skullbatch;
    }

    public void setSkullbatch(String skullbatch) {
        this.skullbatch = skullbatch == null ? null : skullbatch.trim();
    }
}