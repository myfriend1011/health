package com.yanxu.dao.types;

import com.yanxu.domain.pojo.JiOu;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IJiOuDao {

    /**
     * 更新当前数据行信息
     */
    @Update("update jiou set before_jo=now_jo+1,now_jo=0 where id_jo=#{id}")
    public void update(Integer id);

    /**
     * 更新其他数据信息
     * @param id
     */
    @Update("update jiou set now_jo=now_jo+1 where id_jo<>#{id}")
    public void updateOther(Integer id);

    /**
     * 查询所有数据信息
     * @return
     */
    @Select("select * from jiou")
    public List<JiOu> findAll();


}
