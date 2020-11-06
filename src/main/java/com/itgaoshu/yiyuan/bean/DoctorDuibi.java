package com.itgaoshu.yiyuan.bean;

public class DoctorDuibi {
    private String total;
    private String num;
    private String doctorName;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "DoctorDuibi{" +
                "total='" + total + '\'' +
                ", num=" + num +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
