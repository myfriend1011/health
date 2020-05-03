package com.yanxu.dao;

import com.yanxu.domain.*;
import com.yanxu.domain.pojo.danma.BtFirst;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IFour_code_groud {
    @Insert("insert into four_code_groud (name_one_fcg,name_two_fcg,name_the_fcg,name_fou_fcg," +
            "now_fou,before_fou) values(#{name_one_fcg},#{name_two_fcg},#{name_the_fcg},#{name_fou_fcg}," +
            "#{now_fou},#{before_fou})")
    public void add(Four_code_groud four_code_groud);



    public void update(@Param("ids") List<Integer> ids);
    public void updateOther(@Param("ids") List<Integer> ids);

    @Select("select * from four_code_groud order by now_fcg desc")
    public List<Four_code_groud> findAll();

    //查询当前要更新的数据信息
    @Select("select fcg.id_fcg from four_code_groud as fcg where (fcg.name_one_fcg = #{one} or fcg.name_two_fcg=#{one}) and (fcg.name_two_fcg=#{two} or fcg.name_the_fcg=#{two}) and (fcg.name_the_fcg=#{the} or fcg.name_fou_fcg=#{the});")
    List<Integer> findById(@Param("one") String one, @Param("two") String two, @Param("the") String the);


    /**
     * four关联there查询数据信息
     * @param id
     * @return
     */
    List<Three_code_groud> find_fourGuanLianThere(Integer id);

    /**
     * four光临five查询数据信息
     * @param id
     * @return
     */
    List<Five_code_groud> find_fourGuanLianFive(Integer id);

    /**
     * four关联six查询数据信息
     * @param id
     * @return
     */
    List<Six_code_groud> find_fourGuanLianSix(Integer id);

    /**
     * four关联seven查询数据信息
     */
    List<Sev_code_groud> find_fourGuanLianSeven(Integer id);

    /**
     * four关联eight查询数据信息
     * @param id
     * @return
     */
    List<Eig_code_groud> find_fourGuanLianEight(Integer id);

    void updateNow_fcg(Integer id);

    void updatebefore_fcg(Integer id_fcg);


    //给其他添加数据
    void insertBtFrist(BtFirst btFirst);
}
