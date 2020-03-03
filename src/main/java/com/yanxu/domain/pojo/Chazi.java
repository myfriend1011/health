package com.yanxu.domain.pojo;

import java.io.Serializable;

public class Chazi  implements Serializable {
    private Integer id_chazi;
    private String  name_chazi;
    private Integer now_chazi;
    private Integer before_zhazi;

    public Integer getId_chazi() {
        return id_chazi;
    }

    public void setId_chazi(Integer id_chazi) {
        this.id_chazi = id_chazi;
    }

    public String getName_chazi() {
        return name_chazi;
    }

    public void setName_chazi(String name_chazi) {
        this.name_chazi = name_chazi;
    }

    public Integer getNow_chazi() {
        return now_chazi;
    }

    public void setNow_chazi(Integer now_chazi) {
        this.now_chazi = now_chazi;
    }

    public Integer getBefore_zhazi() {
        return before_zhazi;
    }

    public void setBefore_zhazi(Integer before_zhazi) {
        this.before_zhazi = before_zhazi;
    }
}
