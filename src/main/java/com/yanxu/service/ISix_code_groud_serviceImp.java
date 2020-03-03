package com.yanxu.service;

import com.yanxu.dao.IFive_code_groud;
import com.yanxu.dao.IFour_code_groud;
import com.yanxu.dao.ISix_code_groud;
import com.yanxu.domain.Five_code_groud;
import com.yanxu.domain.Four_code_groud;
import com.yanxu.domain.Six_code_groud;
import com.yanxu.domain.pojo.OneToMoney;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ISix_code_groud_serviceImp implements ISix_code_groud_service{

    @Autowired
    private ISix_code_groud iSix_code_groud;
    @Autowired
    private IFour_code_groud iFour_code_groud;

    @Autowired
    private IFive_code_groud iFive_code_groud;

    /**
     * 填充数据信息
     */
    @Override
    public void add() {
        Six_code_groud scg = new Six_code_groud();
        for (int one = 1; one <= 10; one++) {
            for (int two = one+1; two <= 10; two++) {
                for (int the = two+1; the <= 10; the++) {
                    for(int fou = the +1; fou <= 10; fou++){
                        for(int fiv = fou+1; fiv <= 10; fiv++){
                            for(int six = fiv+1; six <= 10; six++){
                                scg.setName_one_scg((one<10 ? "0"+one:"10"));
                                scg.setName_two_scg((two<10 ? "0"+two:"10"));
                                scg.setName_the_scg((the<10 ? "0"+the:"10"));
                                scg.setName_fou_scg((fou<10 ? "0"+fou:"10"));
                                scg.setName_fiv_scg((fiv<10 ? "0"+fiv:"10"));
                                scg.setName_six_scg((six<10 ? "0"+six:"10"));
                                scg.setNow_scg(120);
                                scg.setBefore_scg(120);
                                iSix_code_groud.add(scg);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void update(String one, String two, String the) {
        //查询更新数据信息的ids
        List<Six_code_groud> all = iSix_code_groud.findAll();
        for (Six_code_groud scg : all) {
            List<String> tmp = new ArrayList<>();
            tmp.add(scg.getName_one_scg());
            tmp.add(scg.getName_two_scg());
            tmp.add(scg.getName_the_scg());
            tmp.add(scg.getName_fou_scg());
            tmp.add(scg.getName_fiv_scg());
            tmp.add(scg.getName_six_scg());
            if(tmp.contains(one) && tmp.contains(two) && tmp.contains(the)){
                iSix_code_groud.updateNow_scg(scg.getId_scg());
            }else{
                iSix_code_groud.updateBefore_scg(scg.getId_scg());
            }
        }
    }

    /**
     * 更新当前数据信息
     * @param ids
     */
    @Override
    public void update(List<Integer>  ids){
            iSix_code_groud.update(ids);
    }

    /**
     * 更新其他数据信息
     * @param ids
     */
    @Override
    public void updateOther(List<Integer> ids) {
        iSix_code_groud.updateOther(ids);
    }

    /**
     * 查询所有数据信息
     * @return
     */
    @Override
    public List<Six_code_groud> findAll() {
        return iSix_code_groud.findAll();
    }

    @Override
    public void addSixAndfour() {
        List<Six_code_groud> scg = iSix_code_groud.findAll();
        List<Four_code_groud> fcg = iFour_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Six_code_groud s : scg) {
            List<String> tmp = new ArrayList<>();
            tmp.add(s.getName_one_scg());
            tmp.add(s.getName_two_scg());
            tmp.add(s.getName_the_scg());
            tmp.add(s.getName_fou_scg());
            tmp.add(s.getName_fiv_scg());
            tmp.add(s.getName_six_scg());
            for (Four_code_groud f : fcg) {
                if(tmp.contains(f.getName_one_fcg()) && tmp.contains(f.getName_two_fcg()) &&
                    tmp.contains(f.getName_fou_fcg()) && tmp.contains(f.getName_the_fcg())){
                    oneToMoney.setId_size(s.getId_scg());
                    oneToMoney.setId(f.getId_fcg());
                    //iSix_code_groud.addSixAndfour(oneToMoney);
                }
            }
        }
    }

    @Override
    public void addSixAndFive() {
        List<Six_code_groud> scg = iSix_code_groud.findAll();
        List<Five_code_groud> fcg = iFive_code_groud.findAll();

        OneToMoney oneToMoney = new OneToMoney();

        for (Six_code_groud s : scg) {
            List<String> tmp = new ArrayList<>();
            tmp.add(s.getName_one_scg());
            tmp.add(s.getName_two_scg());
            tmp.add(s.getName_the_scg());
            tmp.add(s.getName_fou_scg());
            tmp.add(s.getName_fiv_scg());
            tmp.add(s.getName_six_scg());
            for (Five_code_groud f : fcg) {
                if(tmp.contains(f.getName_one_Fcg()) && tmp.contains(f.getName_two_Fcg()) &&
                        tmp.contains(f.getName_the_Fcg()) && tmp.contains(f.getName_fou_Fcg()) && tmp.contains(f.getName_fiv_Fcg())){
                    oneToMoney.setId_size(s.getId_scg());
                    oneToMoney.setId(f.getId_Fcg());
                    //iSix_code_groud.addSixAndfive(oneToMoney);
                }
            }
        }
    }


}
