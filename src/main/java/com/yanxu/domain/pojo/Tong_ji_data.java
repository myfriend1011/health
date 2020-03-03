package com.yanxu.domain.pojo;

import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;


public class Tong_ji_data implements Serializable {

    private Integer id;
    private String qimashuju;
    private Integer qimayilou;
    private String sanmashuju;
    private Integer sanmayilou;
    private Integer zongjing;

    public Tong_ji_data() {
    }

    public Tong_ji_data(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQimashuju() {
        return qimashuju;
    }

    public void setQimashuju(String qimashuju) {
        this.qimashuju = qimashuju;
    }

    public Integer getQimayilou() {
        return qimayilou;
    }

    public void setQimayilou(Integer qimayilou) {
        this.qimayilou = qimayilou;
    }

    public String getSanmashuju() {
        return sanmashuju;
    }

    public void setSanmashuju(String sanmashuju) {
        this.sanmashuju = sanmashuju;
    }

    public Integer getSanmayilou() {
        return sanmayilou;
    }

    public void setSanmayilou(Integer sanmayilou) {
        this.sanmayilou = sanmayilou;
    }

    public Integer getZongjing() {
        return zongjing;
    }

    public void setZongjing(Integer zongjing) {
        this.zongjing = zongjing;
    }

    public Tong_ji_data(Integer id, String qimashuju, Integer qimayilou, String sanmashuju, Integer sanmayilou, Integer zongjing) {
        this.id = id;
        this.qimashuju = qimashuju;
        this.qimayilou = qimayilou;
        this.sanmashuju = sanmashuju;
        this.sanmayilou = sanmayilou;
        this.zongjing = zongjing;
    }
}
