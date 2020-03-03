package com.yanxu.dao.types;

import com.yanxu.domain.pojo.Size;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ISizeDao {

    /**
     * 填充数据信息
     * @param sizeList
     */
    @Insert("insert into size(id_bs,name_bs,now_bs,before_bs)values(#{id_bs},#{name_bs},#{now_bs},#{before_bs})")
    public void add(List<Size> sizeList);

    /**
     * 更新当前数据信息
     * @param id_bs
     */
    @Update("update size set before_bs = now_bs, now_bs= 0 where id_bs =#{id_bs}")
    public void update(Integer id_bs);

    /**
     * 设置其他的数据更新操作
     */
    @Update("update size set now_bs=now_bs +1 where id_bs <> #{id_bs}")
    public void updateOther(Integer id_bs);

    /**
     * 查询所有数据信息
     * @return
     */
    @Select("select * from size")
    public List<Size> findAll();
}
