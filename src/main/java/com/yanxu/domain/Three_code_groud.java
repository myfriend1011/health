package com.yanxu.domain;

import com.yanxu.domain.pojo.Size;

import java.io.Serializable;
import java.util.List;

public class Three_code_groud implements Serializable {
    private Integer id_tcg;
    private String name_one_tcg;
    private String name_two_tcg;
    private String name_the_tcg;
    private Integer now_tcg;
    private Integer before_tcg;
    private Integer id_size;
    private Integer id_zhihe;
    private Integer id_jiou;

    private List<Four_code_groud> four_code_grouds;

    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Integer getId_size() {
        return id_size;
    }

    public void setId_size(Integer id_size) {
        this.id_size = id_size;
    }

    public Integer getId_zhihe() {
        return id_zhihe;
    }

    public void setId_zhihe(Integer id_zhihe) {
        this.id_zhihe = id_zhihe;
    }

    public List<Four_code_groud> getFour_code_grouds() {
        return four_code_grouds;
    }

    public void setFour_code_grouds(List<Four_code_groud> four_code_grouds) {
        this.four_code_grouds = four_code_grouds;
    }

    public Integer getId_jiou() {
        return id_jiou;
    }

    public void setId_jiou(Integer id_jiou) {
        this.id_jiou = id_jiou;
    }

    public Three_code_groud() {
    }



    public Integer getId_tcg() {
        return id_tcg;
    }

    public void setId_tcg(Integer id_tcg) {
        this.id_tcg = id_tcg;
    }

    public String getName_one_tcg() {
        return name_one_tcg;
    }

    public void setName_one_tcg(String name_one_tcg) {
        this.name_one_tcg = name_one_tcg;
    }

    public String getName_two_tcg() {
        return name_two_tcg;
    }

    public void setName_two_tcg(String name_two_tcg) {
        this.name_two_tcg = name_two_tcg;
    }

    public String getName_the_tcg() {
        return name_the_tcg;
    }

    public void setName_the_tcg(String name_the_tcg) {
        this.name_the_tcg = name_the_tcg;
    }

    public Integer getNow_tcg() {
        return now_tcg;
    }

    public void setNow_tcg(Integer now_tcg) {
        this.now_tcg = now_tcg;
    }

    public Integer getBefore_tcg() {
        return before_tcg;
    }

    public void setBefore_tcg(Integer before_tcg) {
        this.before_tcg = before_tcg;
    }

    @Override
    public String toString() {
        return "Three_code_groud{" +
                "id_tcg=" + id_tcg +
                ", name_one_tcg='" + name_one_tcg + '\'' +
                ", name_two_tcg='" + name_two_tcg + '\'' +
                ", name_the_tcg='" + name_the_tcg + '\'' +
                ", now_tcg=" + now_tcg +
                ", before_tcg=" + before_tcg +
                ", id_size=" + id_size +
                ", id_zhihe=" + id_zhihe +
                ", id_jiou=" + id_jiou +
                '}';
    }
}
