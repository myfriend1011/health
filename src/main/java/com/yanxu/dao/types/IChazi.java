package com.yanxu.dao.types;

import com.yanxu.domain.pojo.Chazi;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IChazi {

    @Insert("insert into chazi (id_chazi,name_chazi,now_chazi,before_chazi) values(#{id_chazi},#{name_chazi},#{now_chazi},#{before_zhazi})")
    void save(Chazi chazi);

    @Update("update chazi set before_chazi=now_chazi,now_chazi=0 where id_chazi = #{id}")
    void update(Integer id);

    @Update("update chazi set now_chazi where id_chazi<>#{id}")
    void updateOther(Integer id);

    @Select("select * from chazi")
    List<Chazi> findAll();
}
