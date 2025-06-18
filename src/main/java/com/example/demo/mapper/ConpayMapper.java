package com.example.demo.mapper;

import com.example.demo.entity.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ConpayMapper {

    List<Company> selectAllConpay();
}
