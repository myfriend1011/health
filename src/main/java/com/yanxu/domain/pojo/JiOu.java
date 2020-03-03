package com.yanxu.domain.pojo;

import java.io.Serializable;

/**
 * jiou类
 */
public class JiOu implements Serializable {
    private Integer id_jo;
    private String name_jo;
    private Integer now_jo;
    private Integer before_jo;

    public JiOu() {
    }

    public JiOu(Integer id_jo, String name_jo, Integer now_jo, Integer before_jo) {
        this.id_jo = id_jo;
        this.name_jo = name_jo;
        this.now_jo = now_jo;
        this.before_jo = before_jo;
    }

    @Override
    public String toString() {
        return "JiOu{" +
                "id_jo=" + id_jo +
                ", name_jo='" + name_jo + '\'' +
                ", now_jo=" + now_jo +
                ", before_jo=" + before_jo +
                '}';
    }

    public Integer getId_jo() {
        return id_jo;
    }

    public void setId_jo(Integer id_jo) {
        this.id_jo = id_jo;
    }

    public String getName_jo() {
        return name_jo;
    }

    public void setName_jo(String name_jo) {
        this.name_jo = name_jo;
    }

    public Integer getNow_jo() {
        return now_jo;
    }

    public void setNow_jo(Integer now_jo) {
        this.now_jo = now_jo;
    }

    public Integer getBefore_jo() {
        return before_jo;
    }

    public void setBefore_jo(Integer before_jo) {
        this.before_jo = before_jo;
    }
}
