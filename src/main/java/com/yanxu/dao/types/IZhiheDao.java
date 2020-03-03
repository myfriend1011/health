package com.yanxu.dao.types;

import com.yanxu.domain.Three_code_groud;
import com.yanxu.domain.pojo.Zhihe;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IZhiheDao {
    /**
     * 保存数据信息
     * @param zhihe
     */
    @Insert("insert into zhihe(id_zh,name_zh,now_zh,before_zh)values(#{id_zh},#{name_zh},#{now_zh},#{before_zh})")
    public void insertZhihe(Zhihe zhihe);

    /**
     * update zhihe set now_zh=0 where id
     */
    public void updateZhihe();

    /**
     * 查询结果返回这个数据的id
     * @param ji
     * @return
     */
    @Select("select id_zh from zhihe where id_zh = #{ji}")
    public Integer getById(String ji);

    /**
     * 更具这个id更新数据信息
     */
    @Update("update zhihe set before_zh=now_zh,now_zh = 0 where id_zh=#{id}")
    public void updateData(Integer id);

    /**
     * 设置其他的数据更新操作
     */
    @Update("update zhihe set now_zh=now_zh+1 where id_zh<>#{id}")
    public void UpdateData(Integer id);

    @Select("select * from zhihe")
    List<Zhihe> findAll();
}
