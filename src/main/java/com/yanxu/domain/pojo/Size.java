package com.yanxu.domain.pojo;

import java.io.Serializable;

/**
 * 大小
 */
public class Size implements Serializable {

    private Integer id_bs;
    private String name_bs;
    private Integer now_bs;
    private Integer before_bs;

    @Override
    public String

    toString() {
        return "Size{" +
                "id_bs=" + id_bs +
                ", name_bs='" + name_bs + '\'' +
                ", now_bs=" + now_bs +
                ", before_bs=" + before_bs +
                '}';
    }

    public Integer getId_bs() {
        return id_bs;
    }

    public void setId_bs(Integer id_bs) {
        this.id_bs = id_bs;
    }

    public String getName_bs() {
        return name_bs;
    }

    public void setName_bs(String name_bs) {
        this.name_bs = name_bs;
    }

    public Integer getNow_bs() {
        return now_bs;
    }

    public void setNow_bs(Integer now_bs) {
        this.now_bs = now_bs;
    }

    public Integer getBefore_bs() {
        return before_bs;
    }

    public void setBefore_bs(Integer before_bs) {
        this.before_bs = before_bs;
    }

    public Size() {
    }

    public Size(Integer id_bs, String name_bs, Integer now_bs, Integer before_bs) {
        this.id_bs = id_bs;
        this.name_bs = name_bs;
        this.now_bs = now_bs;
        this.before_bs = before_bs;
    }
}
