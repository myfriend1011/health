package com.yanxu.service;

import com.yanxu.dao.IFive_code_groud;
import com.yanxu.dao.IFour_code_groud;
import com.yanxu.dao.ISev_code_groud;
import com.yanxu.dao.ISix_code_groud;
import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ISev_code_groud_serviceImp implements ISev_code_groud_service {

    @Autowired
    private ISev_code_groud iSev_code_groud;
    @Autowired
    private IFour_code_groud iFour_code_groud;
    @Autowired
    private IFive_code_groud iFive_code_groud;
    @Autowired
    private ISix_code_groud iSix_code_groud;

    /**
     * 填充数据信息
     */
    @Override
    public void add() {
        Sev_code_groud Scg = new Sev_code_groud();
        for (int one = 1; one <= 10; one++) {
            for (int two = one + 1; two <= 10; two++) {
                for (int the = two + 1; the <= 10; the++) {
                    for (int fou = the + 1; fou <= 10; fou++) {
                        for (int fiv = fou + 1; fiv <= 10; fiv++) {
                            for (int six = fiv + 1; six <= 10; six++) {
                                for (int sev = six + 1; sev <= 10; sev++) {
                                    Scg.setName_one_Scg((one < 10 ? "0" + one : "10"));
                                    Scg.setName_two_Scg((two < 10 ? "0" + two : "10"));
                                    Scg.setName_the_Scg((the < 10 ? "0" + the : "10"));
                                    Scg.setName_fou_Scg((fou < 10 ? "0" + fou : "10"));
                                    Scg.setName_fiv_Scg((fiv < 10 ? "0" + fiv : "10"));
                                    Scg.setName_six_Scg((six < 10 ? "0" + six : "10"));
                                    Scg.setName_sev_Scg((sev < 10 ? "0" + sev : "10"));
                                    Scg.setNow_Scg(120);
                                    Scg.setBefore_Scg(120);
                                    iSev_code_groud.add(Scg);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void update(String one, String two, String the) {
        List<Sev_code_groud> all = iSev_code_groud.findAll();

        for (Sev_code_groud scg : all) {
            List<String> tmp = new ArrayList<>();
            tmp.add(scg.getName_one_Scg());
            tmp.add(scg.getName_two_Scg());
            tmp.add(scg.getName_the_Scg());
            tmp.add(scg.getName_fou_Scg());
            tmp.add(scg.getName_fiv_Scg());
            tmp.add(scg.getName_six_Scg());
            tmp.add(scg.getName_sev_Scg());
            if(tmp.contains(one) && tmp.contains(two) && tmp.contains(the)){
               iSev_code_groud.updateNow_scg(scg.getId_Scg());
            }else
            {
                iSev_code_groud.updateBefore(scg.getId_Scg());
            }
        }
    }


    @Override
    public List<Sev_code_groud> findAdll() {
        return iSev_code_groud.findAll();
    }

    //添加第三张表
    @Override
    public void addSevenAndfour() {
        List<Sev_code_groud> s = iSev_code_groud.findAll();
        List<Four_code_groud> f = iFour_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Sev_code_groud scg : s) {
            List<String> tmp = new ArrayList<>();
            tmp.add(scg.getName_one_Scg());
            tmp.add(scg.getName_two_Scg());
            tmp.add(scg.getName_the_Scg());
            tmp.add(scg.getName_fou_Scg());
            tmp.add(scg.getName_fiv_Scg());
            tmp.add(scg.getName_six_Scg());
            tmp.add(scg.getName_sev_Scg());
            for (Four_code_groud fcg : f) {
                if (tmp.contains(fcg.getName_one_fcg()) && tmp.contains(fcg.getName_two_fcg()) &&
                        tmp.contains(fcg.getName_the_fcg()) && tmp.contains(fcg.getName_fou_fcg())) {
                    oneToMoney.setId_size(scg.getId_Scg());
                    oneToMoney.setId(fcg.getId_fcg());
                    //iSev_code_groud.addSevenAndfour(oneToMoney);
                }
            }
        }

    }

    @Override
    public void addSevenAndfive() {
        List<Sev_code_groud> s = iSev_code_groud.findAll();
        List<Five_code_groud> f = iFive_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();
        for (Sev_code_groud scg : s) {
            List<String> tmp = new ArrayList<>();
            tmp.add(scg.getName_one_Scg());
            tmp.add(scg.getName_two_Scg());
            tmp.add(scg.getName_the_Scg());
            tmp.add(scg.getName_fou_Scg());
            tmp.add(scg.getName_fiv_Scg());
            tmp.add(scg.getName_six_Scg());
            tmp.add(scg.getName_sev_Scg());
            for (Five_code_groud fcg : f) {
                if (tmp.contains(fcg.getName_one_Fcg()) && tmp.contains(fcg.getName_two_Fcg()) && tmp.contains(fcg.getName_the_Fcg()) &&
                        tmp.contains(fcg.getName_fou_Fcg()) && tmp.contains(fcg.getName_fiv_Fcg())) {
                    oneToMoney.setId_size(scg.getId_Scg());
                    oneToMoney.setId(fcg.getId_Fcg());
                    //iSev_code_groud.addSevenAndfive(oneToMoney);
                }
            }
        }

    }

    @Override
    public void addSevenAndsixe() {
        List<Sev_code_groud> s = iSev_code_groud.findAll();
        List<Six_code_groud> six = iSix_code_groud.findAll();
        OneToMoney oneToMoney = new OneToMoney();

        for (Sev_code_groud scg : s) {
            List<String> tmp = new ArrayList<>();
            tmp.add(scg.getName_one_Scg());
            tmp.add(scg.getName_two_Scg());
            tmp.add(scg.getName_the_Scg());
            tmp.add(scg.getName_fou_Scg());
            tmp.add(scg.getName_fiv_Scg());
            tmp.add(scg.getName_six_Scg());
            tmp.add(scg.getName_sev_Scg());
            for (Six_code_groud ssg : six) {
                if(tmp.contains(ssg.getName_one_scg()) && tmp.contains(ssg.getName_two_scg()) && tmp.contains(ssg.getName_the_scg()) &&
                        tmp.contains(ssg.getName_fou_scg()) && tmp.contains(ssg.getName_fiv_scg()) && tmp.contains(ssg.getName_six_scg())){
                        oneToMoney.setId_size(scg.getId_Scg());
                        oneToMoney.setId(ssg.getId_scg());
                        //iSev_code_groud.addSevenAndsixe(oneToMoney);
                }
            }
        }
    }

    @Override
    public List<Three_code_groud> find_sevenGuanLianThere(Integer id) {
        return iSev_code_groud.find_sevenGuanLianThere(id);
    }

    @Override
    public List<Four_code_groud> find_sevenGuanLianFour(Integer id) {
        return iSev_code_groud.find_sevenGuanLianFour(id);
    }

    @Override
    public List<Five_code_groud> find_sevenGuanLianFive(Integer id) {
        return iSev_code_groud.find_sevenGuanLianFive(id);
    }

    @Override
    public List<Six_code_groud> find_sevenGuanLianSix(Integer id) {
        return iSev_code_groud.find_sevenGuanLianSix(id);
    }

    @Override
    public List<Eig_code_groud> find_sevenGuanLianEight(Integer id) {
        return iSev_code_groud.find_sevenGuanLianEight(id);
    }
}
