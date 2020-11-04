package com.itgaoshu.yiyuan.bean;

public class Doctor {
    private Integer doctorid;

    private String doctorname;

    private String department;

    private String type;

    private Integer departmentid;

    private Integer registeredid;

    private Integer dstate;

    private String amstarttime="8:00";

    private String amendtime="12:00";

    private String pmstarttime="14:00";

    private String pmendtime="18:00";

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

    public String getDepartment() { return department; }

    public void setDepartment(String department) { this.department = department; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getRegisteredid() {
        return registeredid;
    }

    public void setRegisteredid(Integer registeredid) { this.registeredid = registeredid; }

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

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorid=" + doctorid +
                ", doctorname='" + doctorname + '\'' +
                ", department='" + department + '\'' +
                ", type='" + type + '\'' +
                ", departmentid=" + departmentid +
                ", registeredid=" + registeredid +
                ", dstate=" + dstate +
                ", amstarttime='" + amstarttime + '\'' +
                ", amendtime='" + amendtime + '\'' +
                ", pmstarttime='" + pmstarttime + '\'' +
                ", pmendtime='" + pmendtime + '\'' +
                '}';
    }
}