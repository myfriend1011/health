package com.yanxu.domain.pojo;

import java.io.Serializable;

public class Kuandu implements Serializable {
    private Integer id_kuandu;
    private String  name_kuandu;
    private Integer now_kuandu;
    private Integer before_kuandu;

    public Kuandu() {
    }

    public Integer getId_kuandu() {
        return id_kuandu;
    }

    public void setId_kuandu(Integer id_kuandu) {
        this.id_kuandu = id_kuandu;
    }

    public String getName_kuandu() {
        return name_kuandu;
    }

    public void setName_kuandu(String name_kuandu) {
        this.name_kuandu = name_kuandu;
    }

    public Integer getNow_kuandu() {
        return now_kuandu;
    }

    public void setNow_kuandu(Integer now_kuandu) {
        this.now_kuandu = now_kuandu;
    }

    public Integer getBefore_kuandu() {
        return before_kuandu;
    }

    public void setBefore_kuandu(Integer before_kuandu) {
        this.before_kuandu = before_kuandu;
    }
}
