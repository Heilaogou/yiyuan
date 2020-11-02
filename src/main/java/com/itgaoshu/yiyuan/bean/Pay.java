package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Pay {
    private Integer payid;

    private Integer registerid;

    private Double money;

    private Date paydate;

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }
}