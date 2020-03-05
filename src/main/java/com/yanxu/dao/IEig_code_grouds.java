package com.yanxu.dao;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IEig_code_grouds {

    @Insert("insert into eig_code_groud (name_one_eig,name_two_eig,name_the_eig,name_fou_eig,name_fiv_eig,name_six_eig,name_sev_eig,name_eig_eig,now_eig,before_eig) " +
            "values(#{name_one_eig},#{name_two_eig},#{name_the_eig},#{name_fou_eig},#{name_fiv_eig},#{name_six_eig},#{name_sev_eig},#{name_eig_eig},#{now_eig},#{before_eig})")
    public void add(Eig_code_groud eig_code_groud);


    public void update(@Param("ids") List<Integer> ids);
    public void updateOther(@Param("ids") List<Integer> ids);

    @Select("select * from eig_code_groud order by now_eig desc")
    public List<Eig_code_groud> findAll();

    @Select("SELECT id_eig FROM eig_code_groud as eig \n" +
            "where (eig.name_one_eig = #{one} or eig.name_two_eig = #{one} or eig.name_the_eig = #{one} or eig.name_fou_eig = #{one} or eig.name_fiv_eig = #{one} or eig.name_six_eig = #{one}) \n" +
            "and \t(eig.name_two_eig = #{two} or eig.name_the_eig = #{two} or eig.name_fou_eig = #{two} or eig.name_fiv_eig = #{two} or eig.name_six_eig = #{two} or eig.name_sev_eig = #{two})\n" +
            "and   (eig.name_the_eig = #{the} or eig.name_fou_eig = #{the} or eig.name_fiv_eig = #{the} or eig.name_six_eig = #{the} or eig.name_sev_eig = #{the} or eig.name_eig_eig = #{the})")
    List<Integer> findByIds(@Param("one") String one, @Param("two") String two, @Param("the") String the);

    @Insert("insert into eight_code_and_four_code (id_eight,id_four) values(#{id_size},#{id})")
    void addEigthAndfour(OneToMoney oneToMoney);
    @Insert("insert into eight_code_and_five_code (id_eight,id_five) values (#{id_size},#{id})")
    void addEigthAndfive(OneToMoney oneToMoney);
    @Insert("insert into eight_code_and_six_code (id_eight,id_six) values(#{id_size},#{id})")
    void addEightAndsixe(OneToMoney oneToMoney);
    @Insert("insert into eight_code_and_seven_code (id_eight,id_seven) values(#{id_size},#{id})")
    void addEightAndseve(OneToMoney oneToMoney);

    List<Three_code_groud> find_eightGuanLianThere(Integer id);

    List<Four_code_groud> find_eightGuanLianFour(Integer id);

    List<Five_code_groud> find_eightGuanLianFive(Integer id);

    List<Six_code_groud> find_eightGuanLianSix(Integer id);

    List<Sev_code_groud> find_eightGuanLianSeven(Integer id);

    void updateNow_scg(Integer id_eig);

    void updateBefore_scg(Integer id_eig);

    Integer find_MaxEig_code_groud();
}
