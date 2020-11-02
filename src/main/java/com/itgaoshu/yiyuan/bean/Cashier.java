package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Cashier {
    private Integer cashier;

    private Integer reportid;

    private String durgname;

    private Integer durgnum;

    private Double repiceprice;

    private Double repicetotal;

    private Integer state;

    private Date ctime;

    private Integer ostate;

    private String jie;

    private Integer mstate;

    public Integer getCashier() {
        return cashier;
    }

    public void setCashier(Integer cashier) {
        this.cashier = cashier;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getDurgname() {
        return durgname;
    }

    public void setDurgname(String durgname) {
        this.durgname = durgname == null ? null : durgname.trim();
    }

    public Integer getDurgnum() {
        return durgnum;
    }

    public void setDurgnum(Integer durgnum) {
        this.durgnum = durgnum;
    }

    public Double getRepiceprice() {
        return repiceprice;
    }

    public void setRepiceprice(Double repiceprice) {
        this.repiceprice = repiceprice;
    }

    public Double getRepicetotal() {
        return repicetotal;
    }

    public void setRepicetotal(Double repicetotal) {
        this.repicetotal = repicetotal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getJie() {
        return jie;
    }

    public void setJie(String jie) {
        this.jie = jie == null ? null : jie.trim();
    }

    public Integer getMstate() {
        return mstate;
    }

    public void setMstate(Integer mstate) {
        this.mstate = mstate;
    }
}