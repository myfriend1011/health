package com.yanxu.domain.pojo;

import java.io.Serializable;

public class Sum implements Serializable {
    private Integer id_sum;
    private String  name_sum;
    private Integer now_sum;
    private Integer before_sum;

    public Sum() {
    }

    public Sum(Integer id_sum, String name_sum, Integer now_sum, Integer before_sum) {
        this.id_sum = id_sum;
        this.name_sum = name_sum;
        this.now_sum = now_sum;
        this.before_sum = before_sum;
    }

    public Integer getId_sum() {
        return id_sum;
    }

    public void setId_sum(Integer id_sum) {
        this.id_sum = id_sum;
    }

    public String getName_sum() {
        return name_sum;
    }

    public void setName_sum(String name_sum) {
        this.name_sum = name_sum;
    }

    public Integer getNow_sum() {
        return now_sum;
    }

    public void setNow_sum(Integer now_sum) {
        this.now_sum = now_sum;
    }

    public Integer getBefore_sum() {
        return before_sum;
    }

    public void setBefore_sum(Integer before_sum) {
        this.before_sum = before_sum;
    }
}
