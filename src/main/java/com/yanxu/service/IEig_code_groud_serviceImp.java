package com.yanxu.service;

import com.yanxu.dao.*;
import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import com.yanxu.domain.pojo.Tong_ji_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class IEig_code_groud_serviceImp implements IEig_code_groud_service{

    @Autowired
    private IEig_code_grouds iEig_code_groud;
    @Autowired
    private IFour_code_groud iFour_code_groud;
    @Autowired
    private IFive_code_groud iFive_code_groud;
    @Autowired
    private ISix_code_groud iSix_code_groud;
    @Autowired
    private ISev_code_groud iSev_code_groud;

    @Autowired
    private ITong_ji_Data iTong_code_data;

    @Autowired
    private IThree_code_groud iThree_code_groud;
    @Override
    public void add() {
        Eig_code_groud eigs = new Eig_code_groud();
        for (int one = 1; one <= 10; one++) {
            for (int two = one+1; two <= 10; two++) {
                for (int the = two+1; the <= 10; the++) {
                    for(int fou = the +1; fou <= 10; fou++){
                        for(int fiv = fou+1; fiv <= 10; fiv++){
                            for(int six = fiv+1; six <= 10; six++){
                                for(int sev = six + 1; sev <= 10; sev ++){
                                    for(int eig = sev+1; eig <= 10; eig++){
                                        eigs.setName_one_eig((one<10 ? "0"+one:"10"));
                                        eigs.setName_two_eig((two<10 ? "0"+two:"10"));
                                        eigs.setName_the_eig((the<10 ? "0"+the:"10"));
                                        eigs.setName_fou_eig((fou<10 ? "0"+fou:"10"));
                                        eigs.setName_fiv_eig((fiv<10 ? "0"+fiv:"10"));
                                        eigs.setName_six_eig((six<10 ? "0"+six:"10"));
                                        eigs.setName_sev_eig((sev<10 ? "0"+sev:"10"));
                                        eigs.setName_eig_eig((eig<10 ? "0"+eig:"10"));
                                        eigs.setNow_eig(45);
                                        eigs.setBefore_eig(45);
                                        iEig_code_groud.add(eigs);
                                    }
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
        List<Eig_code_groud> all = iEig_code_groud.findAll();
        int tmps = 0 ;
        for (Eig_code_groud eig : all) {
            List<String> tmp = new ArrayList<>();
            tmp.add(eig.getName_one_eig());
            tmp.add(eig.getName_two_eig());
            tmp.add(eig.getName_the_eig());
            tmp.add(eig.getName_fou_eig());
            tmp.add(eig.getName_fiv_eig());
            tmp.add(eig.getName_six_eig());
            tmp.add(eig.getName_sev_eig());
            tmp.add(eig.getName_eig_eig());

            if(tmp.contains(one) && tmp.contains(two) && tmp.contains(the)){

                if(eig.getNow_eig()== 6){
                    if(tmps == 0) {
                        Tong_ji_data tong_ji_data = new Tong_ji_data();
                        tong_ji_data.setQimashuju(eig.getName_one_eig() + eig.getName_two_eig() +
                                eig.getName_the_eig() + eig.getName_fou_eig() +
                                eig.getName_fiv_eig() + eig.getName_six_eig() +
                                eig.getName_sev_eig() + eig.getName_eig_eig());
                        tong_ji_data.setQimayilou(eig.getNow_eig());
                        Three_code_groud three_code_groud = iThree_code_groud.find_There(one, two, the);
                        tong_ji_data.setSanmashuju(three_code_groud.getName_one_tcg() + three_code_groud.getName_two_tcg() + three_code_groud.getName_the_tcg());
                        tong_ji_data.setSanmayilou(three_code_groud.getNow_tcg());
                        tong_ji_data.setZongjing(1);

                        iTong_code_data.add(tong_ji_data);
                        tmps++;
                    }
                }
                iEig_code_groud.updateNow_scg(eig.getId_eig());
            }else{
                if(eig.getNow_eig()== 6){
                    if(tmps == 0) {
                        Tong_ji_data tong_ji_data = new Tong_ji_data();
                        tong_ji_data.setQimashuju(eig.getName_one_eig() + eig.getName_two_eig() +
                                eig.getName_the_eig() + eig.getName_fou_eig() +
                                eig.getName_fiv_eig() + eig.getName_six_eig() +
                                eig.getName_sev_eig() + eig.getName_eig_eig());
                        tong_ji_data.setQimayilou(eig.getNow_eig());
                        Three_code_groud three_code_groud = iThree_code_groud.find_There(one, two, the);
                        tong_ji_data.setSanmashuju(three_code_groud.getName_one_tcg() + three_code_groud.getName_two_tcg() + three_code_groud.getName_the_tcg());
                        tong_ji_data.setSanmayilou(three_code_groud.getNow_tcg());
                        tong_ji_data.setZongjing(2);
                        iTong_code_data.add(tong_ji_data);
                        tmps++;
                    }
                }
                iEig_code_groud.updateBefore_scg(eig.getId_eig());
            }
        }

    }

    @Override
    public void update(List<Integer> ids) {
        iEig_code_groud.update(ids);
    }

    @Override
    public void updateOther(List<Integer> ids) {
        iEig_code_groud.updateOther(ids);
    }

    @Override
    public List<Eig_code_groud> findAll() {
        return iEig_code_groud.findAll();
    }

    /**
     * 添加第三表
     */
    @Override
    public void addEightAndfour() {
        List<Eig_code_groud> e = iEig_code_groud.findAll();
        List<Four_code_groud> f = iFour_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Eig_code_groud ecg : e) {
            List<String> tmp = new ArrayList<>();
            tmp.add(ecg.getName_one_eig());
            tmp.add(ecg.getName_two_eig());
            tmp.add(ecg.getName_the_eig());
            tmp.add(ecg.getName_fou_eig());
            tmp.add(ecg.getName_fiv_eig());
            tmp.add(ecg.getName_six_eig());
            tmp.add(ecg.getName_sev_eig());
            tmp.add(ecg.getName_eig_eig());
            for (Four_code_groud fcg : f) {
                if(tmp.contains(fcg.getName_one_fcg()) && tmp.contains(fcg.getName_two_fcg()) &&
                   tmp.contains(fcg.getName_the_fcg()) && tmp.contains(fcg.getName_fou_fcg())){
                    oneToMoney.setId_size(ecg.getId_eig());
                    oneToMoney.setId(fcg.getId_fcg());
                    iEig_code_groud.addEigthAndfour(oneToMoney);
                }
            }
        }
    }

    @Override
    public void addEightAndfive() {
        List<Eig_code_groud> e = iEig_code_groud.findAll();
        List<Five_code_groud> f = iFive_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Eig_code_groud ecg : e) {
            List<String> tmp = new ArrayList<>();
            tmp.add(ecg.getName_one_eig());
            tmp.add(ecg.getName_two_eig());
            tmp.add(ecg.getName_the_eig());
            tmp.add(ecg.getName_fou_eig());
            tmp.add(ecg.getName_fiv_eig());
            tmp.add(ecg.getName_six_eig());
            tmp.add(ecg.getName_sev_eig());
            tmp.add(ecg.getName_eig_eig());
            for (Five_code_groud fcg : f) {
                if(tmp.contains(fcg.getName_one_Fcg()) && tmp.contains(fcg.getName_two_Fcg()) &&
                        tmp.contains(fcg.getName_the_Fcg()) && tmp.contains(fcg.getName_fou_Fcg()) && tmp.contains(fcg.getName_fiv_Fcg())){
                    oneToMoney.setId_size(ecg.getId_eig());
                    oneToMoney.setId(fcg.getId_Fcg());
                    iEig_code_groud.addEigthAndfive(oneToMoney);
                }
            }
        }
    }

    @Override
    public void addEightAndsixe() {
        List<Eig_code_groud> e = iEig_code_groud.findAll();
        List<Six_code_groud> f = iSix_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Eig_code_groud ecg : e) {
            List<String> tmp = new ArrayList<>();
            tmp.add(ecg.getName_one_eig());
            tmp.add(ecg.getName_two_eig());
            tmp.add(ecg.getName_the_eig());
            tmp.add(ecg.getName_fou_eig());
            tmp.add(ecg.getName_fiv_eig());
            tmp.add(ecg.getName_six_eig());
            tmp.add(ecg.getName_sev_eig());
            tmp.add(ecg.getName_eig_eig());
            for (Six_code_groud fcg : f) {
                if(tmp.contains(fcg.getName_one_scg()) && tmp.contains(fcg.getName_two_scg()) &&
                        tmp.contains(fcg.getName_the_scg()) && tmp.contains(fcg.getName_fou_scg()) &&
                        tmp.contains(fcg.getName_fiv_scg()) && tmp.contains(fcg.getName_six_scg())){
                    oneToMoney.setId_size(ecg.getId_eig());
                    oneToMoney.setId(fcg.getId_scg());
                    iEig_code_groud.addEightAndsixe(oneToMoney);
                }
            }
        }
    }

    @Override
    public void addEightAndseven() {
        List<Eig_code_groud> e = iEig_code_groud.findAll();
        List<Sev_code_groud> f = iSev_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Eig_code_groud ecg : e) {
            List<String> tmp = new ArrayList<>();
            tmp.add(ecg.getName_one_eig());
            tmp.add(ecg.getName_two_eig());
            tmp.add(ecg.getName_the_eig());
            tmp.add(ecg.getName_fou_eig());
            tmp.add(ecg.getName_fiv_eig());
            tmp.add(ecg.getName_six_eig());
            tmp.add(ecg.getName_sev_eig());
            tmp.add(ecg.getName_eig_eig());
            for (Sev_code_groud fcg : f) {
                if(tmp.contains(fcg.getName_one_Scg()) && tmp.contains(fcg.getName_two_Scg()) && tmp.contains(fcg.getName_the_Scg()) && tmp.contains(fcg.getName_fou_Scg()) &&
                    tmp.contains(fcg.getName_fiv_Scg()) && tmp.contains(fcg.getName_six_Scg()) && tmp.contains(fcg.getName_sev_Scg())){
                    oneToMoney.setId_size(ecg.getId_eig());
                    oneToMoney.setId(fcg.getId_Scg());
                    iEig_code_groud.addEightAndseve(oneToMoney);
                }
            }
        }
    }

    @Override
    public List<Three_code_groud> find_eightGuanLianThere(Integer id) {
        return iEig_code_groud.find_eightGuanLianThere(id);
    }

    @Override
    public List<Four_code_groud> find_eightGuanLianFour(Integer id) {
        return iEig_code_groud.find_eightGuanLianFour(id);
    }

    @Override
    public List<Five_code_groud> find_eightGuanLianFive(Integer id) {
        return iEig_code_groud.find_eightGuanLianFive(id);
    }

    @Override
    public List<Six_code_groud> find_eightGuanLianSix(Integer id) {
        return iEig_code_groud.find_eightGuanLianSix(id);
    }

    @Override
    public List<Sev_code_groud> find_eightGuanLianSeven(Integer id) {
        return iEig_code_groud.find_eightGuanLianSeven(id);
    }


}
