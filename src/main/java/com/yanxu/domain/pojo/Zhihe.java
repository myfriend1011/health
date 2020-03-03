package com.yanxu.domain.pojo;

import java.io.Serializable;

public class Zhihe implements Serializable {
    private Integer id_zh;
    private String name_zh;
    private Integer now_zh;
    private Integer before_zh;

    @Override
    public String toString() {
        return "Zhihe{" +
                "id_zh=" + id_zh +
                ", name_zh='" + name_zh + '\'' +
                ", now_zh=" + now_zh +
                ", before_zh=" + before_zh +
                '}';
    }

    public Zhihe() {
    }

    public Integer getId_zh() {
        return id_zh;
    }

    public void setId_zh(Integer id_zh) {
        this.id_zh = id_zh;
    }

    public String getName_zh() {
        return name_zh;
    }

    public void setName_zh(String name_zh) {
        this.name_zh = name_zh;
    }

    public Integer getNow_zh() {
        return now_zh;
    }

    public void setNow_zh(Integer now_zh) {
        this.now_zh = now_zh;
    }

    public Integer getBefore_zh() {
        return before_zh;
    }

    public void setBefore_zh(Integer before_zh) {
        this.before_zh = before_zh;
    }

    public Zhihe(Integer id_zh, String name_zh, Integer now_zh, Integer before_zh) {
        this.id_zh = id_zh;
        this.name_zh = name_zh;
        this.now_zh = now_zh;
        this.before_zh = before_zh;
    }
}
