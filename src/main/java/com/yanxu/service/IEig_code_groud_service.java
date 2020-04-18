package com.yanxu.service;

import com.yanxu.domain.*;

import java.util.List;

public interface IEig_code_groud_service {
    /**
     * 填充数据信息
     */
    void add();

    /**
     * 更新当前数据信息
     * @param
     */
    void update(String one,String two,String the);

    /**
     * 更新其他数据信息系
     * @param ids
     */
    void updateOther(List<Integer> ids);
    void update(List<Integer> id_eig);

    /**
     * 查询所有数据信息
     */
    List<Eig_code_groud> findAll();

    /**
     * 添加第三表
     */
    void addEightAndfour();
    void addEightAndfive();
    void addEightAndsixe();
    void addEightAndseven();

    List<Three_code_groud> find_eightGuanLianThere(Integer id);
    List<Four_code_groud> find_eightGuanLianFour(Integer id);
    List<Five_code_groud> find_eightGuanLianFive(Integer id);
    List<Six_code_groud> find_eightGuanLianSix(Integer id);
    List<Sev_code_groud> find_eightGuanLianSeven(Integer id);

    List<Eig_code_groud> yuCeDataFun(String radio4);
}
