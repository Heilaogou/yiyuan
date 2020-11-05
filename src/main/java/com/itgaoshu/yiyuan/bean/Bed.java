package com.itgaoshu.yiyuan.bean;

public class Bed {
    /**
     * 床位
     * bedId	int	Not null auto_increment	Primary key,	-- 序号
     * bedname	Varchar(300)	Not null,		-- 名称
     * departmentId	Int	Not null,	-- 科室
     * state	Int,			-- 状态
     * Price	Double			-- 价钱
     */
    private Integer bedid;

    private String bedname;

    private Integer departmentid;

    private Integer state;

    private Double price;

    public Integer getBedid() {
        return bedid;
    }

    public void setBedid(Integer bedid) {
        this.bedid = bedid;
    }

    public String getBedname() {
        return bedname;
    }

    public void setBedname(String bedname) {
        this.bedname = bedname == null ? null : bedname.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}