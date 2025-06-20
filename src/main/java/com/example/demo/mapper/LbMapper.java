package com.example.demo.mapper;

import com.example.demo.entity.Lb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface LbMapper {
    public List<Lb> getLbList();
}
