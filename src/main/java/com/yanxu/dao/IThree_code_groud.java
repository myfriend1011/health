package com.yanxu.dao;

import com.yanxu.domain.Three_code_groud;
import com.yanxu.domain.pojo.OneToMoney;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface IThree_code_groud {
     /**
      * 保存数据
      * @param threeCodeGroud
      */
     @Insert("insert into three_code_groud (id_tcg,name_one_tcg,name_two_tcg,name_the_tcg,now_tcg,before_tcg) values(#{id_tcg},#{name_one_tcg},#{name_two_tcg},#{name_the_tcg},#{now_tcg},#{before_tcg})")
     void saveThree_code_groud(Three_code_groud threeCodeGroud);

     /**
      * 查询所有数据
      * @return
      */
     @Select("select * from three_code_groud order by now_tcg desc")
     List<Three_code_groud> findAll();

    /**
     * 删除数据
     *
     */
    @Delete("delete from three_code_groud where id_tcg = #{id}")
    boolean deleteDate(Integer id);

    /**
     * 更新数据为119条数据
     * @param id
     */
    @Update("update three_code_groud set now_tcg=now_tcg+1 where id_tcg <>#{id}")
    void updateDates(Integer id);

    /**
     * 查询当前出现的数据id
     * @param one
     * @param two
     * @param the
     * @return
     */
    @Select("select id_tcg  from three_code_groud where name_one_tcg =#{one} and name_two_tcg =#{two}and name_the_tcg =#{the}")
    Integer getByid_tcg(@Param("one") String one,@Param("two") String two,@Param("the") String the);

    /**
     * 更新一个数据当前遗漏信息
     * @param id
     */
    @Update("update three_code_groud set now_tcg=0 where id_tcg = #{id}")
    void updateDate(Integer id);

    /**
     * 记录一个数据的前次遗漏信息
     */
    @Update("update three_code_groud set before_tcg=now_tcg where id_tcg = #{id}")
    void updateDateBefore(Integer id);

    /**
     * 关联表four和there
     * @param tcg
     * @param fcg
     */
    @Insert(" insert  into  four_code_and_thre_code (id_three,id_four) values(#{tcg},#{fcg})")
    void associationTable(@Param("tcg")Integer tcg,@Param("fcg")Integer fcg);

    //关联表five和there
    @Insert(" insert into five_code_and_thre_code (id_there,id_five) values(#{tcg},#{fcg})")
    void associationTableFcgAndTcg(@Param("tcg") Integer tcg, @Param("fcg") Integer fcg);

    //关联表six和there
    @Insert(" insert into six_code_and_thre_code (id_there,id_six) values(#{id_tcg},#{id_scg})")
    void associationTableSixAndTcg(@Param("id_tcg") Integer id_tcg,@Param("id_scg") Integer id_scg);

    @Insert(" insert into sevn_code_and_thre_code (id_there,id_seven) values(#{id_tcg},#{id_scg})")
    void associationTableSevAndTcg(@Param("id_tcg") Integer id_tcg,@Param("id_scg") Integer id_scg);
    @Insert(" insert into eight_code_and_thre_code (id_there,id_eight) values(#{id_tcg},#{id_eig})")
    void associationTableEigAndTcg(@Param("id_tcg") Integer id_tcg, @Param("id_eig") Integer id_eig);


    //==============================================
    //UPDATE `ssmone`.`three_code_groud` SET `id_size` = 3 WHERE `id_tcg` = 1
    void UpdateSizeById(OneToMoney oneToMoney);

    //update three_code_groud set id_zhihe where id_tcg= 1;
    void updateHeZhiById(OneToMoney oneToMoney);

    //update three_code_groud set id_jiou where id_tcg = 2;
    void updateJiOuById(OneToMoney oneToMoney);


    //关联和数
    void updateSumAndthere(OneToMoney oneToMoney);
    //关联差查
    void updatechaziAndthere(OneToMoney oneToMoney);
    @Select("select * from three_code_groud where name_one_tcg=#{one} and name_two_tcg=#{two} and name_the_tcg=#{the}")
    Three_code_groud find_There(@Param("one")String one,@Param("two") String two, @Param("the")String the);

    @Select("select * from three_code_groud where now_tcg > 60")
    List<Three_code_groud> findDataDaSix();
}
