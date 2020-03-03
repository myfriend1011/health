package com.yanxu.domain.pojo;

/**
 * 封装数据用
 */
public class OneToMoney {
    private Integer id_size;
    private Integer id;

    public OneToMoney() {
    }

    public OneToMoney(Integer id_size, Integer id) {
        this.id_size = id_size;
        this.id = id;
    }

    public Integer getId_size() {
        return id_size;
    }

    public void setId_size(Integer id_size) {
        this.id_size = id_size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
