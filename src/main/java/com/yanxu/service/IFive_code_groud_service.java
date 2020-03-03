package com.yanxu.service;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

public interface IFive_code_groud_service {



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
     * 查询所有的数据信息
     * @return
     */
    public List<Five_code_groud> findAll();

    /**
     * 添加第三表
     *
     */
    void addFiveAndfour();


    List<Three_code_groud> find_fiveGuanLianThere(Integer id);

    List<Four_code_groud> find_fiveGuanLianFour(Integer id);

    List<Six_code_groud> find_fiveGuanLianSix(Integer id);


    List<Sev_code_groud> find_fiveGuanLianSeven(Integer id);

    List<Eig_code_groud> find_fiveGuanLianEight(Integer id);

}
