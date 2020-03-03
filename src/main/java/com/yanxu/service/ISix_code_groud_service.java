package com.yanxu.service;

import com.yanxu.domain.Six_code_groud;

import java.util.List;

public interface ISix_code_groud_service {

    /**
     * 填充数据信息
     *
     */
    public void add();

    /**
     * 更新当前数据信息
     * @param
     */
    public void update(String one,String two,String the);

    /**
     * 更新其他数据信息
     *
     */
    public void update(List<Integer> id_scg);
    public void updateOther(List<Integer> ids);

    /**
     * 查询所有数据信息
     */
    public List<Six_code_groud> findAll();

    void addSixAndfour();
    void addSixAndFive();
}
