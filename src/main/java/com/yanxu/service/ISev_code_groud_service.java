package com.yanxu.service;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;

import java.util.List;

public interface ISev_code_groud_service {
    /**
     * 填充数据信息
     *
     */
    public void add();

    /**
     * 更新当前数据信息
     *
     */
    public void update(String one,String two,String the);



    public List<Sev_code_groud> findAdll();

    void addSevenAndfour();
    void addSevenAndfive();
    void addSevenAndsixe();

    List<Three_code_groud> find_sevenGuanLianThere(Integer id);

    List<Four_code_groud> find_sevenGuanLianFour(Integer id);

    List<Five_code_groud> find_sevenGuanLianFive(Integer id);

    List<Six_code_groud> find_sevenGuanLianSix(Integer id);

    List<Eig_code_groud> find_sevenGuanLianEight(Integer id);

}
