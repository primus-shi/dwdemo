package com.muye.dw.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CompanyMapper {
    List<Map<String, Object>> getAll();
}
