package com.yanxu.service;

import com.yanxu.dao.IFive_code_groud;
import com.yanxu.dao.IFour_code_groud;
import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class IFive_code_groud_serviceImp implements IFive_code_groud_service {
    @Autowired
    private IFive_code_groud iFive_code_groud;
    @Autowired
    private IFour_code_groud iFour_code_groud;
    /**
     * 填充数据信息
     *
     */
    @Override
    public void add() {
        Five_code_groud Fcg = new Five_code_groud();
        for (int one = 1; one <= 10; one++) {
            for (int two = one+1; two <= 10; two++) {
                for (int the = two+1; the <= 10; the++) {
                    for(int fou = the +1; fou <= 10; fou++){
                        for(int fiv = fou+1; fiv <= 10; fiv++){
                            Fcg.setName_one_Fcg((one<10 ? "0"+one:"10"));
                            Fcg.setName_two_Fcg((two<10 ? "0"+two:"10"));
                            Fcg.setName_the_Fcg((the<10 ? "0"+the:"10"));
                            Fcg.setName_fou_Fcg((fou<10 ? "0"+fou:"10"));
                            Fcg.setName_fiv_Fcg((fiv<10 ? "0"+fiv:"10"));
                            Fcg.setNow_Fcg(120);
                            Fcg.setBefore_Fcg(120);
                            iFive_code_groud.add(Fcg);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void update(String one, String two, String the) {
        //查询更新数据的信息ids
        List<Five_code_groud> all = iFive_code_groud.findAll();
        for (Five_code_groud fcg : all) {
            List<String> tmp = new ArrayList<>();
            tmp.add(fcg.getName_one_Fcg());
            tmp.add(fcg.getName_two_Fcg());
            tmp.add(fcg.getName_the_Fcg());
            tmp.add(fcg.getName_fou_Fcg());
            tmp.add(fcg.getName_fiv_Fcg());
            if(tmp.contains(one) && tmp.contains(two) && tmp.contains(the)){
                iFive_code_groud.updateNow_Fcg(fcg.getId_Fcg());
            }else{
                iFive_code_groud.updateBefore(fcg.getId_Fcg());
            }
        }
    }



    /**
     * 查询数据信息
     * @return
     */
    @Override
    public List<Five_code_groud> findAll() {
        return iFive_code_groud.findAll();
    }

    @Override
    public void addFiveAndfour() {
        List<Five_code_groud> F = iFive_code_groud.findAll();
        List<Four_code_groud> f = iFour_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();
        for (Five_code_groud Fcg : F) {
            List<String> tmp = new ArrayList<>();
            tmp.add(Fcg.getName_one_Fcg());
            tmp.add(Fcg.getName_two_Fcg());
            tmp.add(Fcg.getName_the_Fcg());
            tmp.add(Fcg.getName_fou_Fcg());
            tmp.add(Fcg.getName_fiv_Fcg());
            for (Four_code_groud fcg : f) {
                if (tmp.contains(fcg.getName_one_fcg()) && tmp.contains(fcg.getName_two_fcg()) && tmp.contains(fcg.getName_the_fcg()) && tmp.contains(fcg.getName_fou_fcg())) {
                    oneToMoney.setId_size(Fcg.getId_Fcg());
                    oneToMoney.setId(fcg.getId_fcg());
                    //iFive_code_groud.addFiveAndfour(oneToMoney);
                }
            }
        }
    }

    @Override
    public List<Three_code_groud> find_fiveGuanLianThere(Integer id) {

        return iFive_code_groud.find_fiveGuanLianThere(id);
    }

    @Override
    public List<Four_code_groud> find_fiveGuanLianFour(Integer id) {
        return iFive_code_groud.find_fiveGuanLianFour(id);
    }

    @Override
    public List<Six_code_groud> find_fiveGuanLianSix(Integer id) {
        return iFive_code_groud.find_fiveGuanLianSix(id);
    }

    @Override
    public List<Sev_code_groud> find_fiveGuanLianSeven(Integer id) {
        return iFive_code_groud.find_fiveGuanLianSeven(id);
    }

    @Override
    public List<Eig_code_groud> find_fiveGuanLianEight(Integer id) {
        return iFive_code_groud.find_fiveGuanLianEight(id);
    }
}
