package com.fivehalf.model;


public class SchoolEntity {
    private String name;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
