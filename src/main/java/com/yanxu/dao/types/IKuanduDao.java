package com.yanxu.dao.types;

import com.yanxu.domain.pojo.Kuandu;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IKuanduDao {

    @Insert("insert into kuandu (id_kuandu,name_kuandu,now_kuandu,before_kuandu) values(#{id_kuandu},#{name_kuandu},#{now_kuandu}#{before_kuandu})")
    void save(Kuandu kuandu);

    @Update("update kuandu set before_kuandu=now_kuandu,now_kuandu=0 where id_kuandu=#{id}")
    void update(Integer id);

    @Update("update kuandu set now_kuandu=now_kuandu+1 where id_kuandu<>#{id}")
    void updateOther(Integer id);

    @Select("select * from kuandu")
    List<Kuandu> findAll();

    @Select("select * from kuandu wehre name_kuandu=#{name}")
    Kuandu SelectName(String name);
}
