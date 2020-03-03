package com.yanxu.service;

import com.yanxu.dao.*;
import com.yanxu.dao.types.*;
import com.yanxu.domain.*;
import com.yanxu.domain.pojo.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("iThree_code_groud_service")
public class IThree_code_groud_serviceImp implements IThree_code_groud_service {
    @Autowired
    private IThree_code_groud iThree_code_grouddao;
    @Autowired
    private IFour_code_groud iFour_code_groud;
    @Autowired
    private IFive_code_groud iFive_code_groud;
    @Autowired
    private ISix_code_groud iSix_code_groud;
    @Autowired
    private ISev_code_groud iSev_code_groud;
    @Autowired
    private IEig_code_grouds iEig_code_groud;

    @Autowired
    private ISizeDao iSizeDao;
    @Autowired
    private IZhiheDao iZhiheDao;
    @Autowired
    private IJiOuDao iJiOuDao;

    @Autowired
    private IChazi iChaziDao;
    @Autowired
    private ISumDao iSumDao;
    
    
    @Override
    public List<Three_code_groud> findAll() {

        return iThree_code_grouddao.findAll();
    }

    /**
     * 添加数据信息
     */
    @Override
    public void saveDate() {
        Three_code_groud t = new Three_code_groud();
        int id = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = i+1; j <= 10; j++) {
                for (int k = j+1; k <= 10; k++) {
                    t.setName_one_tcg((i<10 ? "0"+i:"10"));
                    t.setName_two_tcg((j<10 ? "0"+j:"10"));
                    t.setName_the_tcg((k<10 ?  "0"+k:"10"));
                    t.setNow_tcg(120);
                    t.setBefore_tcg(120);
                    t.setId_tcg(id);
                    iThree_code_grouddao.saveThree_code_groud(t);
                    id++;
                }
            }
        }

    }

    /**
     * 删除所有数据信息
     * @return
     */
    @Override
    public boolean deleteDate() {

        for (int i = 1; i <= 120; i++) {
            iThree_code_grouddao.deleteDate(i);
            if(i==120)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void getById_tcg(String one, String two, String the) {
        System.out.println("233333333333333");
        Integer byid_tcg = iThree_code_grouddao.getByid_tcg(one, two, the);
        System.out.println("sfjdiowef");
        //跟新119条数据
        iThree_code_grouddao.updateDates(byid_tcg);
        //跟新记录信息
        iThree_code_grouddao.updateDateBefore(byid_tcg);
        //更新当前信息
        iThree_code_grouddao.updateDate(byid_tcg);

    }

    @Override
    public void update(String name_one, String name_two, String name_the) {
        Integer byid_tcg = iThree_code_grouddao.getByid_tcg(name_one, name_two, name_the);
        System.out.println("sfjdiowef");
        //跟新119条数据
        iThree_code_grouddao.updateDates(byid_tcg);
        //跟新记录信息
        iThree_code_grouddao.updateDateBefore(byid_tcg);
        //更新当前信息
        iThree_code_grouddao.updateDate(byid_tcg);

    }

    /**
     * there_code关联表four_code
     */
    @Override
    public void associationTable() {
        //查询there_code所有数据
        List<Three_code_groud> threeCodeGrouds = iThree_code_grouddao.findAll();
        //查询four_code所有数据
        List<Four_code_groud> fourCodeGrouds = iFour_code_groud.findAll();
        //查询five_code所有数据
        List<Five_code_groud> fiveCodeGrouds = iFive_code_groud.findAll();
        //查询six_code所有数据
        List<Six_code_groud> sixCodeGrouds = iSix_code_groud.findAll();
        //查询sev_code 所有数据
        List<Sev_code_groud> sevCodeGrouds = iSev_code_groud.findAll();
        //查询six_coe 所有数据
        List<Eig_code_groud> eigCodeGrouds = iEig_code_groud.findAll();
        //逻辑判断there_code数据关联表four_code
        for (Four_code_groud fcg : fourCodeGrouds) {
            for (Three_code_groud t : threeCodeGrouds) {
                if(    (fcg.getName_one_fcg().equalsIgnoreCase(t.getName_one_tcg()) || fcg.getName_two_fcg().equalsIgnoreCase(t.getName_one_tcg()))
                    && (fcg.getName_two_fcg().equalsIgnoreCase(t.getName_two_tcg()) || fcg.getName_the_fcg().equalsIgnoreCase(t.getName_two_tcg()))
                    && (fcg.getName_the_fcg().equalsIgnoreCase(t.getName_the_tcg()) || fcg.getName_fou_fcg().equalsIgnoreCase(t.getName_the_tcg()))){
                    //添加第三表关系的数据
                    //iThree_code_grouddao.associationTable(t.getId_tcg(),fcg.getId_fcg());
                }
            }
        }

        //逻辑判断there_code数据关联表five_code
        for (Five_code_groud Fcg : fiveCodeGrouds) {
            for (Three_code_groud t : threeCodeGrouds) {
                if(    (Fcg.getName_one_Fcg().equalsIgnoreCase(t.getName_one_tcg()) || Fcg.getName_two_Fcg().equalsIgnoreCase(t.getName_one_tcg()) || Fcg.getName_the_Fcg().equalsIgnoreCase(t.getName_one_tcg()))
                    && (Fcg.getName_two_Fcg().equalsIgnoreCase(t.getName_two_tcg()) || Fcg.getName_the_Fcg().equalsIgnoreCase(t.getName_two_tcg()) || Fcg.getName_fou_Fcg().equalsIgnoreCase(t.getName_two_tcg()))
                    && (Fcg.getName_the_Fcg().equalsIgnoreCase(t.getName_the_tcg()) || Fcg.getName_fou_Fcg().equalsIgnoreCase(t.getName_the_tcg()) || Fcg.getName_fiv_Fcg().equalsIgnoreCase(t.getName_the_tcg()))){
                    //添加第三表关系的数据
                    //iThree_code_grouddao.associationTableFcgAndTcg(t.getId_tcg(),Fcg.getId_Fcg());
                }
            }
        }

        //逻辑判断there_code数据关联表six_code
        for (Six_code_groud scg : sixCodeGrouds) {
            for (Three_code_groud t : threeCodeGrouds) {
                if(        (scg.getName_one_scg().equalsIgnoreCase(t.getName_one_tcg()) || scg.getName_two_scg().equalsIgnoreCase(t.getName_one_tcg()) || scg.getName_the_scg().equalsIgnoreCase(t.getName_one_tcg()) || scg.getName_fou_scg().equalsIgnoreCase(t.getName_one_tcg()))
                        && (scg.getName_two_scg().equalsIgnoreCase(t.getName_two_tcg()) || scg.getName_the_scg().equalsIgnoreCase(t.getName_two_tcg()) || scg.getName_fou_scg().equalsIgnoreCase(t.getName_two_tcg()) || scg.getName_fiv_scg().equalsIgnoreCase(t.getName_two_tcg()))
                        && (scg.getName_the_scg().equalsIgnoreCase(t.getName_the_tcg()) || scg.getName_fou_scg().equalsIgnoreCase(t.getName_the_tcg()) || scg.getName_fiv_scg().equalsIgnoreCase(t.getName_the_tcg()) || scg.getName_six_scg().equalsIgnoreCase(t.getName_the_tcg()))){
                    //添加第三表关系的数据
                    //iThree_code_grouddao.associationTableSixAndTcg(t.getId_tcg(),scg.getId_scg());
                }
            }
        }

        //逻辑判断there_code数据关联表sev_code
        for (Sev_code_groud Scg : sevCodeGrouds) {
            for (Three_code_groud t : threeCodeGrouds) {
                if(        (Scg.getName_one_Scg().equalsIgnoreCase(t.getName_one_tcg()) || Scg.getName_two_Scg().equalsIgnoreCase(t.getName_one_tcg()) || Scg.getName_the_Scg().equalsIgnoreCase(t.getName_one_tcg()) || Scg.getName_fou_Scg().equalsIgnoreCase(t.getName_one_tcg()) ||Scg.getName_fiv_Scg().equalsIgnoreCase(t.getName_one_tcg()))
                        && (Scg.getName_two_Scg().equalsIgnoreCase(t.getName_two_tcg()) || Scg.getName_the_Scg().equalsIgnoreCase(t.getName_two_tcg()) || Scg.getName_fou_Scg().equalsIgnoreCase(t.getName_two_tcg()) || Scg.getName_fiv_Scg().equalsIgnoreCase(t.getName_two_tcg()) ||Scg.getName_six_Scg().equalsIgnoreCase(t.getName_two_tcg()))
                        && (Scg.getName_the_Scg().equalsIgnoreCase(t.getName_the_tcg()) || Scg.getName_fou_Scg().equalsIgnoreCase(t.getName_the_tcg()) || Scg.getName_fiv_Scg().equalsIgnoreCase(t.getName_the_tcg()) || Scg.getName_six_Scg().equalsIgnoreCase(t.getName_the_tcg()) ||Scg.getName_sev_Scg().equalsIgnoreCase(t.getName_the_tcg()))){
                    //添加第三表关系的数据
                    //iThree_code_grouddao.associationTableSevAndTcg(t.getId_tcg(),Scg.getId_Scg());
                }
            }
        }

        //逻辑判断there_code数据关联表eig_code
        for (Eig_code_groud eig : eigCodeGrouds) {
            for (Three_code_groud t : threeCodeGrouds) {
                if(        (eig.getName_one_eig().equalsIgnoreCase(t.getName_one_tcg()) || eig.getName_two_eig().equalsIgnoreCase(t.getName_one_tcg()) || eig.getName_the_eig().equalsIgnoreCase(t.getName_one_tcg()) || eig.getName_fou_eig().equalsIgnoreCase(t.getName_one_tcg()) ||eig.getName_fiv_eig().equalsIgnoreCase(t.getName_one_tcg()) || eig.getName_six_eig().equalsIgnoreCase(t.getName_one_tcg()))
                        && (eig.getName_two_eig().equalsIgnoreCase(t.getName_two_tcg()) || eig.getName_the_eig().equalsIgnoreCase(t.getName_two_tcg()) || eig.getName_fou_eig().equalsIgnoreCase(t.getName_two_tcg()) || eig.getName_fiv_eig().equalsIgnoreCase(t.getName_two_tcg()) ||eig.getName_six_eig().equalsIgnoreCase(t.getName_two_tcg()) || eig.getName_sev_eig().equalsIgnoreCase(t.getName_two_tcg()))
                        && (eig.getName_the_eig().equalsIgnoreCase(t.getName_the_tcg()) || eig.getName_fou_eig().equalsIgnoreCase(t.getName_the_tcg()) || eig.getName_fiv_eig().equalsIgnoreCase(t.getName_the_tcg()) || eig.getName_six_eig().equalsIgnoreCase(t.getName_the_tcg()) ||eig.getName_sev_eig().equalsIgnoreCase(t.getName_the_tcg()) || eig.getName_eig_eig().equalsIgnoreCase(t.getName_the_tcg()))){
                    //添加第三表关系的数据
                    iThree_code_grouddao.associationTableEigAndTcg(t.getId_tcg(),eig.getId_eig());
                }
            }
        }

    }

    /**
     * 更新there和Size类
     */
    public void UpdateSizeById(){
        OneToMoney oneToMoney = new OneToMoney();
        List<Three_code_groud> t = iThree_code_grouddao.findAll();
        List<Size> sizes = iSizeDao.findAll();
        for (Three_code_groud three_code_groud : t) {
            for (Size size : sizes) {
                if("0102030405".contains(three_code_groud.getName_one_tcg()) && "0102030405".contains(three_code_groud.getName_the_tcg()) &&
                    size.getName_bs().equalsIgnoreCase("小小小")){
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    oneToMoney.setId_size(size.getId_bs());
                    iThree_code_grouddao.UpdateSizeById(oneToMoney);
                }else if("0607080910".contains(three_code_groud.getName_one_tcg()) && size.getName_bs().equalsIgnoreCase("大大大")){
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    oneToMoney.setId_size(size.getId_bs());
                    iThree_code_grouddao.UpdateSizeById(oneToMoney);
                }else if("0607080910".contains(three_code_groud.getName_two_tcg()) && "0102030405".contains(three_code_groud.getName_one_tcg())
                    && size.getName_bs().equalsIgnoreCase("大大小")){
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    oneToMoney.setId_size(size.getId_bs());
                    iThree_code_grouddao.UpdateSizeById(oneToMoney);
                }else if("0102030405".contains(three_code_groud.getName_two_tcg()) && "0607080910".contains(three_code_groud.getName_the_tcg())
                        && size.getName_bs().equalsIgnoreCase("小小大")){
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    oneToMoney.setId_size(size.getId_bs());
                    iThree_code_grouddao.UpdateSizeById(oneToMoney);
                }
            }
        }

    }

    /**
     * there和合质
     */
    public  void updateHeZhiById(){
        //封装数据信息
        OneToMoney oneToMoney = new OneToMoney();
        //查询there代码
        List<Three_code_groud> tt = iThree_code_grouddao.findAll();
        //查询zhihe代码
        List<Zhihe> zhihes = iZhiheDao.findAll();
        for (Three_code_groud t : tt) {
            for (Zhihe ous : zhihes) {
                if("0102030507".contains(t.getName_one_tcg()) && "0102030507".contains(t.getName_two_tcg()) && "0102030507".contains(t.getName_the_tcg()) &&
                        ous.getName_zh().equalsIgnoreCase("质质质")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_zh());
                    iThree_code_grouddao.updateHeZhiById(oneToMoney);
                }else if("0406080910".contains(t.getName_one_tcg()) && "0406080910".contains(t.getName_two_tcg()) && "0406080910".contains(t.getName_the_tcg()) &&ous.getName_zh().equalsIgnoreCase("合合合")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_zh());
                    iThree_code_grouddao.updateHeZhiById(oneToMoney);
                }else if( (("0102030507".contains(t.getName_one_tcg()) || "0102030507".contains(t.getName_two_tcg()) || "0102030507".contains(t.getName_the_tcg())  ) &&
                        (("0406080910".contains(t.getName_one_tcg()) && "0406080910".contains(t.getName_two_tcg())||("0406080910".contains(t.getName_one_tcg()) && "0406080910".contains(t.getName_the_tcg()))||("0406080910".contains(t.getName_the_tcg()) && "0406080910".contains(t.getName_two_tcg())))&&
                        ous.getName_zh().equalsIgnoreCase("合合质")))){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_zh());
                    iThree_code_grouddao.updateHeZhiById(oneToMoney);
                }else if( (("0406080910".contains(t.getName_one_tcg()) || "0406080910".contains(t.getName_two_tcg()) || "0406080910".contains(t.getName_the_tcg())  ) &&
                        (("0102030507".contains(t.getName_one_tcg()) && "0102030507".contains(t.getName_two_tcg())||("0102030507".contains(t.getName_one_tcg()) && "0102030507".contains(t.getName_the_tcg()))||("0102030507".contains(t.getName_the_tcg()) && "0102030507".contains(t.getName_two_tcg())))&&
                                ous.getName_zh().equalsIgnoreCase("质质合")))){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_zh());
                    iThree_code_grouddao.updateHeZhiById(oneToMoney);
                }
            }
        }
    }

    /**
     * there和奇偶
     */
    public void updateJiOuById(){
        //封装数据信息
        OneToMoney oneToMoney = new OneToMoney();
        //查询there代码
        List<Three_code_groud> tt = iThree_code_grouddao.findAll();
        //查询奇偶数据
        List<JiOu> jiOus = iJiOuDao.findAll();
        for (Three_code_groud t : tt) {
            for (JiOu ous : jiOus) {
                if("0103050709".contains(t.getName_one_tcg()) && "0103050709".contains(t.getName_two_tcg()) && "0103050709".contains(t.getName_the_tcg()) &&
                        ous.getName_jo().equalsIgnoreCase("奇奇奇")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_jo());
                    iThree_code_grouddao.updateJiOuById(oneToMoney);
                }else if("0204060810".contains(t.getName_one_tcg()) && "0204060810".contains(t.getName_two_tcg()) &&ous.getName_jo().equalsIgnoreCase("偶偶偶")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_jo());
                    iThree_code_grouddao.updateJiOuById(oneToMoney);
                }else if(( ("0103050709".contains(t.getName_one_tcg()) || "0103050709".contains(t.getName_two_tcg()) || "0103050709".contains(t.getName_the_tcg())) && ((("0204060810".contains(t.getName_one_tcg()) && "0204060810".contains(t.getName_two_tcg())) || ("0204060810".contains(t.getName_one_tcg()) && "0204060810".contains(t.getName_the_tcg())) || ("0204060810".contains(t.getName_the_tcg()) && "0204060810".contains(t.getName_two_tcg())))) )&&ous.getName_jo().equalsIgnoreCase("偶偶奇")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_jo());
                    iThree_code_grouddao.updateJiOuById(oneToMoney);
                }else if(( ("0204060810".contains(t.getName_one_tcg()) || "0204060810".contains(t.getName_two_tcg()) || "0204060810".contains(t.getName_the_tcg())) && ((("0103050709".contains(t.getName_one_tcg()) && "0103050709".contains(t.getName_two_tcg())) || ("0103050709".contains(t.getName_one_tcg()) && "0103050709".contains(t.getName_the_tcg())) || ("0103050709".contains(t.getName_the_tcg()) && "0103050709".contains(t.getName_two_tcg())))) )&&ous.getName_jo().equalsIgnoreCase("奇奇偶")){
                    oneToMoney.setId(t.getId_tcg());
                    oneToMoney.setId_size(ous.getId_jo());
                    iThree_code_grouddao.updateJiOuById(oneToMoney);
                }
            }
        }
    }

    @Override
    public void updateSumAndthere() {
        //封装数据信息
        OneToMoney oneToMoney = new OneToMoney();
        //查询there代码
        List<Three_code_groud> tt = iThree_code_grouddao.findAll();
        //查询sum代码
        List<Sum> sums = iSumDao.findAll();
        for (Three_code_groud three_code_groud : tt) {
            Integer one = Integer.parseInt( three_code_groud.getName_one_tcg());
            Integer two = Integer.parseInt(three_code_groud.getName_two_tcg());
            Integer the = Integer.parseInt(three_code_groud.getName_the_tcg());
            Integer sum = one + two + the;

            for (Sum sum1 : sums) {
                String name_sum = sum1.getName_sum();
                if(name_sum.equalsIgnoreCase(sum.toString())){
                    oneToMoney.setId_size(sum1.getId_sum());
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    //设置关系
                    iThree_code_grouddao.updateSumAndthere(oneToMoney);
                }
            }
            System.out.println(sum);
        }
    }

    @Override
    public void updatechaziAndthere() {
        //封装数据信息
        OneToMoney oneToMoney = new OneToMoney();
        //查询there代码
        List<Three_code_groud> tt = iThree_code_grouddao.findAll();
        //查询差值
        List<Chazi> chazis = iChaziDao.findAll();

        for (Three_code_groud three_code_groud : tt) {
            Integer one = Integer.parseInt( three_code_groud.getName_one_tcg());
            Integer two = Integer.parseInt(three_code_groud.getName_two_tcg());
            Integer the = Integer.parseInt(three_code_groud.getName_the_tcg());
            Integer chazi = the - one;

            for(Chazi chazi1 : chazis){
                String name_chazi = chazi1.getName_chazi();
                if(name_chazi.equalsIgnoreCase(chazi.toString())){
                    oneToMoney.setId(three_code_groud.getId_tcg());
                    oneToMoney.setId_size(chazi1.getId_chazi());
                    //设置关系
                    iThree_code_grouddao.updatechaziAndthere(oneToMoney);
                }
            }
        }

    }
}
