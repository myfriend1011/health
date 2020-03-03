package com.yanxu.domain;

import java.io.Serializable;

public class Eig_code_groud  implements Serializable {

    private Integer id_eig;
    private String name_one_eig;
    private String name_two_eig;
    private String name_the_eig;
    private String name_fou_eig;
    private String name_fiv_eig;
    private String name_six_eig;
    private String name_sev_eig;
    private String name_eig_eig;

    private Integer now_eig;
    private Integer before_eig;

    public Eig_code_groud() {
    }

    public Eig_code_groud(Integer id_eig, String name_one_eig, String name_two_eig, String name_the_eig, String name_fou_eig, String name_fiv_eig, String name_six_eig, String name_sev_eig, String name_eig_eig, Integer now_eig, Integer before_eig) {
        this.id_eig = id_eig;
        this.name_one_eig = name_one_eig;
        this.name_two_eig = name_two_eig;
        this.name_the_eig = name_the_eig;
        this.name_fou_eig = name_fou_eig;
        this.name_fiv_eig = name_fiv_eig;
        this.name_six_eig = name_six_eig;
        this.name_sev_eig = name_sev_eig;
        this.name_eig_eig = name_eig_eig;
        this.now_eig = now_eig;
        this.before_eig = before_eig;
    }

    @Override
    public String toString() {
        return "Eig_code_groud{" +
                "id_eig=" + id_eig +
                ", name_one_eig='" + name_one_eig + '\'' +
                ", name_two_eig='" + name_two_eig + '\'' +
                ", name_the_eig='" + name_the_eig + '\'' +
                ", name_fou_eig='" + name_fou_eig + '\'' +
                ", name_fiv_eig='" + name_fiv_eig + '\'' +
                ", name_six_eig='" + name_six_eig + '\'' +
                ", name_sev_eig='" + name_sev_eig + '\'' +
                ", name_eig_eig='" + name_eig_eig + '\'' +
                ", now_eig=" + now_eig +
                ", before_eig=" + before_eig +
                '}';
    }

    public Integer getId_eig() {
        return id_eig;
    }

    public void setId_eig(Integer id_eig) {
        this.id_eig = id_eig;
    }

    public String getName_one_eig() {
        return name_one_eig;
    }

    public void setName_one_eig(String name_one_eig) {
        this.name_one_eig = name_one_eig;
    }

    public String getName_two_eig() {
        return name_two_eig;
    }

    public void setName_two_eig(String name_two_eig) {
        this.name_two_eig = name_two_eig;
    }

    public String getName_the_eig() {
        return name_the_eig;
    }

    public void setName_the_eig(String name_the_eig) {
        this.name_the_eig = name_the_eig;
    }

    public String getName_fou_eig() {
        return name_fou_eig;
    }

    public void setName_fou_eig(String name_fou_eig) {
        this.name_fou_eig = name_fou_eig;
    }

    public String getName_fiv_eig() {
        return name_fiv_eig;
    }

    public void setName_fiv_eig(String name_fiv_eig) {
        this.name_fiv_eig = name_fiv_eig;
    }

    public String getName_six_eig() {
        return name_six_eig;
    }

    public void setName_six_eig(String name_six_eig) {
        this.name_six_eig = name_six_eig;
    }

    public String getName_sev_eig() {
        return name_sev_eig;
    }

    public void setName_sev_eig(String name_sev_eig) {
        this.name_sev_eig = name_sev_eig;
    }

    public String getName_eig_eig() {
        return name_eig_eig;
    }

    public void setName_eig_eig(String name_eig_eig) {
        this.name_eig_eig = name_eig_eig;
    }

    public Integer getNow_eig() {
        return now_eig;
    }

    public void setNow_eig(Integer now_eig) {
        this.now_eig = now_eig;
    }

    public Integer getBefore_eig() {
        return before_eig;
    }

    public void setBefore_eig(Integer before_eig) {
        this.before_eig = before_eig;
    }
}
