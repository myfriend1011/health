package com.yanxu.domain;

import org.springframework.context.annotation.Bean;

import java.io.Serializable;

/**
 * 组四选
 */

public class Four_code_groud implements Serializable {

    private Integer id_fcg;
    private String name_one_fcg;
    private String name_two_fcg;
    private String name_the_fcg;
    private String name_fou_fcg;
    private Integer now_fcg;
    private Integer before_fcg;

    public Four_code_groud() {
    }


    public Integer getNow_fcg() {
        return now_fcg;
    }

    public void setNow_fcg(Integer now_fcg) {
        this.now_fcg = now_fcg;
    }

    public Integer getBefore_fcg() {
        return before_fcg;
    }

    public void setBefore_fcg(Integer before_fcg) {
        this.before_fcg = before_fcg;
    }

    public Integer getId_fcg() {
        return id_fcg;
    }

    public void setId_fcg(Integer id_fcg) {
        this.id_fcg = id_fcg;
    }

    public String getName_one_fcg() {
        return name_one_fcg;
    }

    public void setName_one_fcg(String name_one_fcg) {
        this.name_one_fcg = name_one_fcg;
    }

    public String getName_two_fcg() {
        return name_two_fcg;
    }

    public void setName_two_fcg(String name_two_fcg) {
        this.name_two_fcg = name_two_fcg;
    }

    public String getName_the_fcg() {
        return name_the_fcg;
    }

    public void setName_the_fcg(String name_the_fcg) {
        this.name_the_fcg = name_the_fcg;
    }

    public String getName_fou_fcg() {
        return name_fou_fcg;
    }

    public void setName_fou_fcg(String name_fou_fcg) {
        this.name_fou_fcg = name_fou_fcg;
    }

}
