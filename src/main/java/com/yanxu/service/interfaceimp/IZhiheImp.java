package com.yanxu.service.interfaceimp;

import com.yanxu.dao.types.IZhiheDao;
import com.yanxu.domain.pojo.Zhihe;
import com.yanxu.service.interfacees.IZhihe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IZhiheImp implements IZhihe {
    @Autowired
    private IZhiheDao iZhiheDao;
    /**
     * 添加数据
     *
     */
    @Override
    public void insertZhihe() throws IllegalAccessException, InstantiationException {
        Class<Zhihe> zhiheClass = Zhihe.class;
        Zhihe zhihe = zhiheClass.newInstance();

        zhihe.setId_zh(1);
        zhihe.setName_zh("质质合");
        zhihe.setNow_zh(80);
        zhihe.setBefore_zh(80);

        iZhiheDao.insertZhihe(zhihe);

        zhihe.setId_zh(2);
        zhihe.setName_zh("合合质");
        iZhiheDao.insertZhihe(zhihe);
        zhihe.setId_zh(3);
        zhihe.setName_zh("合合合");
        iZhiheDao.insertZhihe(zhihe);
        zhihe.setId_zh(4);
        zhihe.setName_zh("质质质");
        iZhiheDao.insertZhihe(zhihe);

    }
}
