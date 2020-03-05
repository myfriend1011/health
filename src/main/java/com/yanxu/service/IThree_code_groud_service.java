package com.yanxu.service;

import com.yanxu.domain.Three_code_groud;
import com.yanxu.domain.pojo.OneToMoney;

import java.util.List;

/**
 * service层的接口
 */
public interface IThree_code_groud_service {
    /**
     * 查询所有数据
     */
    List<Three_code_groud> findAll();

    /**
     * 添加数据
     */
    void saveDate();

    /**
     * 删除所有数据
     * @return
     */
    boolean deleteDate();


    /**
     * 获取当前的数据信息id
     */
    void getById_tcg(String one,String two, String the);

    /**
     * 更新数据信息
     * @param name_one
     * @param name_two
     * @param name_the
     */
    void update(String name_one, String name_two, String name_the);

    /**
     * there_code关联four_code
     */
    void associationTable();

    /**
     * 添加类型数据
     *
     */
    public void UpdateSizeById();
    public void updateHeZhiById();
    public void updateJiOuById();

    //关联和数
    void updateSumAndthere();
    //关联差查
    void updatechaziAndthere();

    List<Three_code_groud> yuCeDataFun(String redio);

}
