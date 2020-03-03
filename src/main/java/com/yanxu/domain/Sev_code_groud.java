package com.yanxu.domain;

import java.io.Serializable;

public class Sev_code_groud implements Serializable{
    private Integer id_Scg;
    private String name_one_Scg;
    private String name_two_Scg;
    private String name_the_Scg;
    private String name_fou_Scg;
    private String name_fiv_Scg;
    private String name_six_Scg;
    private String name_sev_Scg;

    private Integer now_Scg;
    private Integer before_Scg;

    public Sev_code_groud() {
    }

    public Sev_code_groud(Integer id_Scg, String name_one_Scg, String name_two_Scg, String name_the_Scg, String name_fou_Scg, String name_fiv_Scg, String name_six_Scg, String name_sev_Scg, Integer now_Scg, Integer before_Scg) {
        this.id_Scg = id_Scg;
        this.name_one_Scg = name_one_Scg;
        this.name_two_Scg = name_two_Scg;
        this.name_the_Scg = name_the_Scg;
        this.name_fou_Scg = name_fou_Scg;
        this.name_fiv_Scg = name_fiv_Scg;
        this.name_six_Scg = name_six_Scg;
        this.name_sev_Scg = name_sev_Scg;
        this.now_Scg = now_Scg;
        this.before_Scg = before_Scg;
    }

    @Override
    public String toString() {
        return "Sev_code_groud{" +
                "id_Scg=" + id_Scg +
                ", name_one_Scg='" + name_one_Scg + '\'' +
                ", name_two_Scg='" + name_two_Scg + '\'' +
                ", name_the_Scg='" + name_the_Scg + '\'' +
                ", name_fou_Scg='" + name_fou_Scg + '\'' +
                ", name_fiv_Scg='" + name_fiv_Scg + '\'' +
                ", name_six_Scg='" + name_six_Scg + '\'' +
                ", name_sev_Scg='" + name_sev_Scg + '\'' +
                ", now_Scg=" + now_Scg +
                ", before_Scg=" + before_Scg +
                '}';
    }

    public Integer getId_Scg() {
        return id_Scg;
    }

    public void setId_Scg(Integer id_Scg) {
        this.id_Scg = id_Scg;
    }

    public String getName_one_Scg() {
        return name_one_Scg;
    }

    public void setName_one_Scg(String name_one_Scg) {
        this.name_one_Scg = name_one_Scg;
    }

    public String getName_two_Scg() {
        return name_two_Scg;
    }

    public void setName_two_Scg(String name_two_Scg) {
        this.name_two_Scg = name_two_Scg;
    }

    public String getName_the_Scg() {
        return name_the_Scg;
    }

    public void setName_the_Scg(String name_the_Scg) {
        this.name_the_Scg = name_the_Scg;
    }

    public String getName_fou_Scg() {
        return name_fou_Scg;
    }

    public void setName_fou_Scg(String name_fou_Scg) {
        this.name_fou_Scg = name_fou_Scg;
    }

    public String getName_fiv_Scg() {
        return name_fiv_Scg;
    }

    public void setName_fiv_Scg(String name_fiv_Scg) {
        this.name_fiv_Scg = name_fiv_Scg;
    }

    public String getName_six_Scg() {
        return name_six_Scg;
    }

    public void setName_six_Scg(String name_six_Scg) {
        this.name_six_Scg = name_six_Scg;
    }

    public String getName_sev_Scg() {
        return name_sev_Scg;
    }

    public void setName_sev_Scg(String name_sev_Scg) {
        this.name_sev_Scg = name_sev_Scg;
    }

    public Integer getNow_Scg() {
        return now_Scg;
    }

    public void setNow_Scg(Integer now_Scg) {
        this.now_Scg = now_Scg;
    }

    public Integer getBefore_Scg() {
        return before_Scg;
    }

    public void setBefore_Scg(Integer before_Scg) {
        this.before_Scg = before_Scg;
    }
}
