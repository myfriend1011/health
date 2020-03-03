package com.yanxu.dao;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ISev_code_groud {
    @Insert("insert into sev_code_groud(name_one_Scg,name_two_Scg,name_the_Scg,name_fou_Scg,name_fiv_Scg,name_six_Scg,name_sev_Scg,now_Scg,before_Scg) " +
            "values(#{name_one_Scg},#{name_two_Scg},#{name_the_Scg},#{name_fou_Scg},#{name_fiv_Scg},#{name_six_Scg},#{name_sev_Scg},#{now_Scg},#{before_Scg})")
    public void add(Sev_code_groud sev_code_groud);


    public void update(@Param("ids") List<Integer> ids);
    public void updateOther(@Param("ids") List<Integer> ids);

    @Select("select * from sev_code_groud order by now_Scg desc")
    public List<Sev_code_groud> findAll();

    @Select("SELECT * FROM sev_code_groud as Scg \n" +
            "where (Scg.name_one_Scg = '01' or Scg.name_two_Scg = #{one} or Scg.name_the_Scg = #{one} or Scg.name_fou_Scg = #{one} or Scg.name_fiv_Scg = #{one}) \n" +
            "and \t(Scg.name_two_Scg = '02' or Scg.name_the_Scg = #{two} or Scg.name_fou_Scg = #{two} or Scg.name_fiv_Scg = #{two} or Scg.name_six_Scg = #{two})\n" +
            "and   (Scg.name_the_Scg = '03' or Scg.name_fou_Scg = #{the} or Scg.name_fiv_Scg = #{the} or Scg.name_six_Scg = #{the} or Scg.name_sev_Scg = #{the})")
    List<Integer> findByIds(@Param("one") String one, @Param("two") String two, @Param("the") String the);

    //添加第三表的数据
    void addSevenAndfour(OneToMoney oneToMoney);
    void addSevenAndfive(OneToMoney oneToMoney);
    void addSevenAndsixe(OneToMoney oneToMoney);

    List<Three_code_groud> find_sevenGuanLianThere(Integer id);

    List<Four_code_groud> find_sevenGuanLianFour(Integer id);

    List<Five_code_groud> find_sevenGuanLianFive(Integer id);

    List<Six_code_groud> find_sevenGuanLianSix(Integer id);

    void updateBefore(Integer id_scg);

    void updateNow_scg(Integer id_scg);

    List<Eig_code_groud> find_sevenGuanLianEight(Integer id);
}
