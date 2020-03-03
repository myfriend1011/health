package com.yanxu.dao.types;

import com.yanxu.domain.pojo.Sum;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ISumDao {

    //添加数据
    @Insert("insert into sum (name_sum,now_sum,before_sum) values(#{name_sum},#{now_sum},#{before_sum})")
    void save(Sum sum);

    @Update("update sum set before_sum=now_sum,now_sum=0 where id_sum=#{id}")
    void updaeById(Integer id);

    @Update("update sum set now_sum=now_sum+1 where id_sum<>#{id}")
    void updateOther(Integer id);

    @Select("select * from sum")
    List<Sum> findAll();

    @Select("select * from sum where name_sum=#{name}")
    Sum selectSumByName(String name);
}
