package com.yanxu.domain;

import java.io.Serializable;

public class Six_code_groud implements Serializable {

    private Integer id_scg;
    private String name_one_scg;
    private String name_two_scg;
    private String name_the_scg;
    private String name_fou_scg;
    private String name_fiv_scg;
    private String name_six_scg;

    private Integer now_scg;
    private Integer before_scg;

    public Six_code_groud() {
    }

    public Six_code_groud(Integer id_scg, String name_one_scg, String name_two_scg, String name_the_scg, String name_fou_scg, String name_fiv_scg, String name_six_scg, Integer now_scg, Integer before_scg) {
        this.id_scg = id_scg;
        this.name_one_scg = name_one_scg;
        this.name_two_scg = name_two_scg;
        this.name_the_scg = name_the_scg;
        this.name_fou_scg = name_fou_scg;
        this.name_fiv_scg = name_fiv_scg;
        this.name_six_scg = name_six_scg;
        this.now_scg = now_scg;
        this.before_scg = before_scg;
    }

    @Override
    public String toString() {
        return "Six_code_groud{" +
                "id_scg=" + id_scg +
                ", name_one_scg='" + name_one_scg + '\'' +
                ", name_two_scg='" + name_two_scg + '\'' +
                ", name_the_scg='" + name_the_scg + '\'' +
                ", name_fou_scg='" + name_fou_scg + '\'' +
                ", name_fiv_scg='" + name_fiv_scg + '\'' +
                ", name_six_scg='" + name_six_scg + '\'' +
                ", now_scg=" + now_scg +
                ", before_scg=" + before_scg +
                '}';
    }

    public Integer getId_scg() {
        return id_scg;
    }

    public void setId_scg(Integer id_scg) {
        this.id_scg = id_scg;
    }

    public String getName_one_scg() {
        return name_one_scg;
    }

    public void setName_one_scg(String name_one_scg) {
        this.name_one_scg = name_one_scg;
    }

    public String getName_two_scg() {
        return name_two_scg;
    }

    public void setName_two_scg(String name_two_scg) {
        this.name_two_scg = name_two_scg;
    }

    public String getName_the_scg() {
        return name_the_scg;
    }

    public void setName_the_scg(String name_the_scg) {
        this.name_the_scg = name_the_scg;
    }

    public String getName_fou_scg() {
        return name_fou_scg;
    }

    public void setName_fou_scg(String name_fou_scg) {
        this.name_fou_scg = name_fou_scg;
    }

    public String getName_fiv_scg() {
        return name_fiv_scg;
    }

    public void setName_fiv_scg(String name_fiv_scg) {
        this.name_fiv_scg = name_fiv_scg;
    }

    public String getName_six_scg() {
        return name_six_scg;
    }

    public void setName_six_scg(String name_six_scg) {
        this.name_six_scg = name_six_scg;
    }

    public Integer getNow_scg() {
        return now_scg;
    }

    public void setNow_scg(Integer now_scg) {
        this.now_scg = now_scg;
    }

    public Integer getBefore_scg() {
        return before_scg;
    }

    public void setBefore_scg(Integer before_scg) {
        this.before_scg = before_scg;
    }
}
