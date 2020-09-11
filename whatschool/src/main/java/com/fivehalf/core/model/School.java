package com.fivehalf.core.model;

public class School {
    public String name;
    public String info;

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
