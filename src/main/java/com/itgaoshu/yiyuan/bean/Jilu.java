package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Jilu {
    private Integer jiluid;

    private String jiluname;

    private Date jilutime;

    private String jilutype;

    private String jilupeople;

    private Integer jilunumber;

    private String jilupihao;

    public Integer getJiluid() {
        return jiluid;
    }

    public void setJiluid(Integer jiluid) {
        this.jiluid = jiluid;
    }

    public String getJiluname() {
        return jiluname;
    }

    public void setJiluname(String jiluname) {
        this.jiluname = jiluname == null ? null : jiluname.trim();
    }

    public Date getJilutime() {
        return jilutime;
    }

    public void setJilutime(Date jilutime) {
        this.jilutime = jilutime;
    }

    public String getJilutype() {
        return jilutype;
    }

    public void setJilutype(String jilutype) {
        this.jilutype = jilutype == null ? null : jilutype.trim();
    }

    public String getJilupeople() {
        return jilupeople;
    }

    public void setJilupeople(String jilupeople) {
        this.jilupeople = jilupeople == null ? null : jilupeople.trim();
    }

    public Integer getJilunumber() {
        return jilunumber;
    }

    public void setJilunumber(Integer jilunumber) {
        this.jilunumber = jilunumber;
    }

    public String getJilupihao() {
        return jilupihao;
    }

    public void setJilupihao(String jilupihao) {
        this.jilupihao = jilupihao == null ? null : jilupihao.trim();
    }
}