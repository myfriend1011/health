package com.yanxu.service.interfacees;

import com.yanxu.domain.pojo.Size;

import java.util.List;

public interface ISize {

    /**
     * 添加数据信息
     * @param sizeList
     */
    public void add(List<Size> sizeList);

    /**
     * 更新当前数据信息
     */
    public void update(Integer id_bs);

    /**
     * 更新其他数据信息
     */
    public void updateOther(Integer id_bs);

    /**
     * 查询所有数据信息
     * @return
     */
    public List<Size> findAll();
}
