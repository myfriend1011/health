package com.yanxu.service;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.Theres;

import java.util.List;

public interface IFour_code_groud_service {
    /**
     * 填充数据信息
     */
    public void add();

    /**
     * 更新当前数据信息ids
     */
    public void update(String one,String two,String the);

    /**
     * 查询所有的数据信息
     * @return
     */
    public List<Four_code_groud> findAll();

    List<Three_code_groud> find_fourGuanLianThere(Integer id);

    List<Five_code_groud> find_fourGuanLianFive(Integer id);

    List<Six_code_groud> find_fourGuanLianSix(Integer id);
    List<Sev_code_groud> find_fourGuanLianSeven(Integer id);
    List<Eig_code_groud> find_fourGuanLianEight(Integer id);

}
