package com.yanxu.service;

import com.yanxu.dao.IFour_code_groud;
import com.yanxu.domain.*;
import com.yanxu.service.IFour_code_groud_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class IFour_code_groud_serviceImp implements IFour_code_groud_service {

    @Autowired
    private IFour_code_groud iFour_code_groud;

    /**
     * 填充数据信息
     */
    @Override
    public void add() {
        Four_code_groud fcg = new Four_code_groud();
        int id = 1;
        for (int one = 1; one <= 10; one++) {
            for (int two = one+1; two <= 10; two++) {
                for (int the = two+1; the <= 10; the++) {
                    for(int fou = the +1; fou <= 10; fou++){
                            fcg.setName_one_fcg((one<10 ? "0"+one:"10"));
                            fcg.setName_two_fcg((two<10 ? "0"+two:"10"));
                            fcg.setName_the_fcg((the<10 ? "0"+the:"10"));
                            fcg.setName_fou_fcg((fou<10 ? "0"+fou:"10"));
                            fcg.setNow_fcg(120);
                            fcg.setBefore_fcg(120);
                            fcg.setId_fcg(id);
                            iFour_code_groud.add(fcg);
                            id++;
                    }
                }
            }
        }
    }

    @Override
    public void update(String one, String two, String the) {
        //查询要当前数据信息的ids
        List<Four_code_groud> all = iFour_code_groud.findAll();

        for (Four_code_groud fcg : all) {
            List<String> tmp = new ArrayList<>();
            tmp.add(fcg.getName_one_fcg());
            tmp.add(fcg.getName_two_fcg());
            tmp.add(fcg.getName_the_fcg());
            tmp.add(fcg.getName_fou_fcg());
            if(tmp.contains(one) && tmp.contains(two) && tmp.contains(the)){
                iFour_code_groud.updateNow_fcg(fcg.getId_fcg());
            }else{
                iFour_code_groud.updatebefore_fcg(fcg.getId_fcg());
            }
        }


    }


    /**
     * 查询所有数据信息
     * @return
     */
    @Override
    public List<Four_code_groud> findAll() {
        return iFour_code_groud.findAll();
    }

    /**
     * four关联there查询数据
     * @param id
     * @return
     */
    @Override
    public List<Three_code_groud> find_fourGuanLianThere(Integer id) {
        return iFour_code_groud.find_fourGuanLianThere(id);
    }

    @Override
    public List<Five_code_groud> find_fourGuanLianFive(Integer id) {
        return iFour_code_groud.find_fourGuanLianFive(id);
    }

    @Override
    public List<Six_code_groud> find_fourGuanLianSix(Integer id) {
        return iFour_code_groud.find_fourGuanLianSix(id);
    }

    @Override
    public List<Sev_code_groud> find_fourGuanLianSeven(Integer id) {
        return iFour_code_groud.find_fourGuanLianSeven(id);
    }

    @Override
    public List<Eig_code_groud> find_fourGuanLianEight(Integer id) {
        return iFour_code_groud.find_fourGuanLianEight(id);
    }


}
