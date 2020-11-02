package com.itgaoshu.yiyuan.bean;

public class Skull {
    private Integer skullid;

    private String skullname;

    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public String getSkullname() {
        return skullname;
    }

    public void setSkullname(String skullname) {
        this.skullname = skullname == null ? null : skullname.trim();
    }
}