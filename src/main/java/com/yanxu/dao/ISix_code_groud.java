package com.yanxu.dao;

import com.yanxu.domain.Six_code_groud;
import com.yanxu.domain.pojo.OneToMoney;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ISix_code_groud {
    @Insert("insert into six_code_groud(name_one_scg,name_two_scg,name_the_scg,name_fou_scg,name_fiv_scg,name_six_scg,now_scg,before_scg) " +
            "values(#{name_one_scg},#{name_two_scg},#{name_the_scg},#{name_fou_scg},#{name_fiv_scg},#{name_six_scg},#{now_scg},#{before_scg})")
    public void add(Six_code_groud six_code_groud);


    public void update(@Param("ids") List<Integer> ids);
    public void updateOther(@Param("ids") List<Integer> ids);

    @Select("select * from six_code_groud order by now_scg desc")
    public List<Six_code_groud> findAll();


    @Select("Select id_scg FROM six_code_groud as scg \n" +
            "where (scg.name_one_scg=#{one} or scg.name_two_scg=#{one} or scg.name_the_scg=#{one} or scg.name_fou_scg=#{one})\n" +
            "and   (scg.name_two_scg=#{two} or scg.name_the_scg=#{two} or scg.name_fou_scg=#{two} or scg.name_fiv_scg=#{two})\n" +
            "and   (scg.name_the_scg=#{the} or scg.name_fou_scg=#{the} or scg.name_fiv_scg=#{the} or scg.name_six_scg=#{the})")
    List<Integer> findByids(@Param("one") String one, @Param("two") String two, @Param("the") String the);

    //INSERT INTO `ssmone`.`six_code_and_four_code`(`id_sixfour`, `id_six`, `id_four`) VALUES (1, 1, 1)
    void addSixAndfour(OneToMoney oneToMoney);
    void addSixAndfive(OneToMoney oneToMoney);

    void updateNow_scg(Integer id_scg);

    void updateBefore_scg(Integer id_scg);
    //select ss.name_one_scg,ss.name_two_scg,ss.name_the_scg,ss.name_fou_scg,ss.name_fiv_scg,ss.name_six_scg,tcg.name_one_tcg,tcg.name_two_tcg,tcg.name_the_tcg from six_code_groud as ss, three_code_groud as tcg where tcg.id_tcg in (select id_there from six_code_and_thre_code where id_six=1)
}
