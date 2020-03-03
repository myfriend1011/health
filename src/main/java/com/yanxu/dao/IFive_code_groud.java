package com.yanxu.dao;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.OneToMoney;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IFive_code_groud {
    @Insert("insert into five_code_groud (" +
            "name_one_Fcg,name_two_Fcg,name_the_Fcg,name_fou_Fcg,name_fiv_Fcg," +
            "now_Fcg,before_fcg) " +
            "values(" +
            "#{name_one_Fcg},#{name_two_Fcg},#{name_the_Fcg},#{name_fou_Fcg},#{name_fiv_Fcg}," +
            "#{now_Fcg},#{before_fcg})")
    public void add(Five_code_groud five_code_groud);


    public void update(@Param("ids") List<Integer> ids);
    public void updateOther(@Param("ids") List<Integer> ids);

    @Select("select * from five_code_groud order by now_Fcg desc")
    public List<Five_code_groud> findAll();
    @Select("SELECT fcg.id_Fcg FROM five_code_groud as fcg " +
            "where (fcg.name_one_Fcg=#{one} or fcg.name_two_Fcg=#{one} or fcg.name_the_Fcg=#{one}) " +
            "and   (fcg.name_two_Fcg=#{two} or Fcg.name_the_Fcg=#{two} or Fcg.name_fou_Fcg=#{two}) " +
            "and   (fcg.name_the_Fcg=#{the} or fcg.name_fou_Fcg=#{the} or fcg.name_fiv_Fcg=#{the})")
    List<Integer> findByIds(@Param("one") String one,@Param("two") String two, @Param("the") String the);

    void addFiveAndfour(OneToMoney OneToMoney);

    List<Three_code_groud> find_fiveGuanLianThere(Integer id);

    List<Four_code_groud> find_fiveGuanLianFour(Integer id);

    List<Six_code_groud> find_fiveGuanLianSix(Integer id);

    List<Sev_code_groud> find_fiveGuanLianSeven(Integer id);

    List<Eig_code_groud> find_fiveGuanLianEight(Integer id);

    void updateNow_Fcg(Integer id_fcg);

    void updateBefore(Integer id_fcg);
}
