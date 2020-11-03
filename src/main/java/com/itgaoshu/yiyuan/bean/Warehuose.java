package com.itgaoshu.yiyuan.bean;

public class Warehuose {
    //仓库id
    private Integer warehouseid;
    //仓库名
    private String suppliername;

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }
}