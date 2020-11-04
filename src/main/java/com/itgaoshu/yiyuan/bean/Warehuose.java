package com.itgaoshu.yiyuan.bean;

public class Warehuose {
    //仓库id
    private Integer warehouseId;
    //仓库名
    private String supplierName;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }
}