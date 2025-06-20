package com.example.demo.mapper;

import com.example.demo.entity.Lb;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface LbMapper {
    @Select("SELECT * FROM lbt limit #{page}, #{limit}")
    List<Lb> getLbList(@Param("page")int page, @Param("limit") int limit);

    int getAllLbCount();

    @Select("select * from lbt")
    List<Lb> getLb();

    @Insert("insert into lbt (id, imgPath) VALUES (#{id},#{imgPath})")
    int addLbt(Lb lb);

    @Delete("delete from lbt where id=#{id}")
    void deleteLbt(Integer id);
}
