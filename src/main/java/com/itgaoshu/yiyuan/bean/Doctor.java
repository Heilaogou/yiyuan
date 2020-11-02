package com.itgaoshu.yiyuan.bean;

public class Doctor {
    private Integer doctorid;

    private String doctorname;

    private Integer departmentid;

    private Integer registeredid;

    private Integer dstate;

    private String amstarttime;

    private String amendtime;

    private String pmstarttime;

    private String pmendtime;

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRegisteredid() {
        return registeredid;
    }

    public void setRegisteredid(Integer registeredid) {
        this.registeredid = registeredid;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }

    public String getAmstarttime() {
        return amstarttime;
    }

    public void setAmstarttime(String amstarttime) {
        this.amstarttime = amstarttime == null ? null : amstarttime.trim();
    }

    public String getAmendtime() {
        return amendtime;
    }

    public void setAmendtime(String amendtime) {
        this.amendtime = amendtime == null ? null : amendtime.trim();
    }

    public String getPmstarttime() {
        return pmstarttime;
    }

    public void setPmstarttime(String pmstarttime) {
        this.pmstarttime = pmstarttime == null ? null : pmstarttime.trim();
    }

    public String getPmendtime() {
        return pmendtime;
    }

    public void setPmendtime(String pmendtime) {
        this.pmendtime = pmendtime == null ? null : pmendtime.trim();
    }
}