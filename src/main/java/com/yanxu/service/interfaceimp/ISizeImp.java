package com.yanxu.service.interfaceimp;

import com.yanxu.domain.pojo.Size;
import com.yanxu.service.interfacees.ISize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ISizeImp implements ISize {

    /**
     * 填充数据信息
     * @param sizeList
     */
    @Override
    public void add(List<Size> sizeList) {

    }

    /**
     * 更新当前数据信息
     * @param id_bs
     */
    @Override
    public void update(Integer id_bs) {

    }

    /**
     * 更新其他数据信息
     * @param id_bs
     */
    @Override
    public void updateOther(Integer id_bs) {

    }

    /**
     * 查询数据信息
     * @return
     */
    @Override
    public List<Size> findAll() {
        return null;
    }
}
