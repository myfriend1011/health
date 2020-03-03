package com.yanxu.domain.pojo;

import java.io.Serializable;

public class Theres implements Serializable {

    private String name_one;
    private String name_two;
    private String name_the;

    public String getName_one() {
        return name_one;
    }

    public void setName_one(String name_one) {
        this.name_one = name_one;
    }

    public String getName_two() {
        return name_two;
    }

    public void setName_two(String name_two) {
        this.name_two = name_two;
    }

    public String getName_the() {
        return name_the;
    }

    public void setName_the(String name_the) {
        this.name_the = name_the;
    }

    public Theres(String name_one, String name_two, String name_the) {
        this.name_one = name_one;
        this.name_two = name_two;
        this.name_the = name_the;
    }

    public Theres() {
    }

    @Override
    public String toString() {
        return "Theres{" +
                "name_one='" + name_one + '\'' +
                ", name_two='" + name_two + '\'' +
                ", name_the='" + name_the + '\'' +
                '}';
    }
}
