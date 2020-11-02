package com.itgaoshu.yiyuan.bean;

import java.util.Date;

public class Checkup {
    private Integer cid;

    private Integer registerid;

    private String content;

    private Date ctime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRegisterid() {
        return registerid;
    }

    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}