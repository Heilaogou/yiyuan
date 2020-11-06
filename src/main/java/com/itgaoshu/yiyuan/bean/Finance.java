package com.itgaoshu.yiyuan.bean;

public class Finance {
    private Double value;
    private String name;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Finance{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
