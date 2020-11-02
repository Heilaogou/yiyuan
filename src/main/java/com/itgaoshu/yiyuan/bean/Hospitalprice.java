package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Hospitalprice {
    private Integer hospitalpriceid;

    private Integer registerid;

    private String durgname;

    private Integer durgnum;

    private Double repiceprice;

    private Double repicetotal;

    private Date htime;

    private Integer state;

    public Integer getHospitalpriceid() {
        return hospitalpriceid;
    }

    public void setHospitalpriceid(Integer hospitalpriceid) {
        this.hospitalpriceid = hospitalpriceid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
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

    public Date getHtime() {
        return htime;
    }

    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}