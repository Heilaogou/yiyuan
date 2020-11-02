package com.itgaoshu.yiyuan.bean;

public class Paiban {
    private Integer paiid;

    private String one;

    private String two;

    private String three;

    private String four;

    private String five;

    private String six;

    private String seven;

    private Integer doctorid;

    public Integer getPaiid() {
        return paiid;
    }

    public void setPaiid(Integer paiid) {
        this.paiid = paiid;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one == null ? null : one.trim();
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two == null ? null : two.trim();
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three == null ? null : three.trim();
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four == null ? null : four.trim();
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five == null ? null : five.trim();
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six == null ? null : six.trim();
    }

    public String getSeven() {
        return seven;
    }

    public void setSeven(String seven) {
        this.seven = seven == null ? null : seven.trim();
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }
}