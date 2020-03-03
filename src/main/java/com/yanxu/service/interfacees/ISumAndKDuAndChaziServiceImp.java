package com.yanxu.service.interfacees;

import com.yanxu.dao.types.IChazi;
import com.yanxu.dao.types.IKuanduDao;
import com.yanxu.dao.types.ISumDao;
import com.yanxu.domain.pojo.Chazi;
import com.yanxu.domain.pojo.Kuandu;
import com.yanxu.domain.pojo.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISumAndKDuAndChaziServiceImp implements ISumAndKDuAndChazi {

    @Autowired
    private ISumDao iSumDao;
    @Autowired
    private IChazi iChaziDao;
    @Autowired
    private IKuanduDao iKuanduDao;
    @Override
    public void save() {
        for (int i = 1; i <= 10; i++) {
            for (int i1 = i+1; i1 <= 10; i1++) {
                for(int k = i1 + 1 ;k <= 10 ; k++){
                    int sum = i+i1 + k;
                    Sum sum1 = new Sum();
                    sum1.setNow_sum(20);
                    sum1.setBefore_sum(20);
                    sum1.setName_sum(""+sum);

                    Sum sum2 = iSumDao.selectSumByName(sum1.getName_sum());
                    if(sum2 ==null){
                        //iSumDao.save(sum1);
                    }

                }
            }
        }
        Chazi chazi = new Chazi();
        Kuandu kuandu = new Kuandu();
        for (int i = 2; i <= 9; i++) {
            chazi.setNow_chazi(8);
            chazi.setBefore_zhazi(8);
            chazi.setName_chazi(i+"");
        }

    }

    @Override
    public void update() {

    }

    @Override
    public List find() {
        return null;
    }
}
