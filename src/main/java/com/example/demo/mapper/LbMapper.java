package com.example.demo.mapper;

import com.example.demo.entity.Lb;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface LbMapper {
    @Select("SELECT * FROM lbt limit #{page}, #{limit}")
    public List<Lb> getLbList(@Param("page")int page, @Param("limit") int limit);

    int getAllLbCount();

    @Select("select * from lbt")
    List<Lb> getLb();
}
