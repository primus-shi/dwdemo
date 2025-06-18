package com.example.demo.service.serviceImpl;

import com.example.demo.service.CompanyService;
import com.example.demo.entity.Company;
import com.example.demo.mapper.ConpayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private ConpayMapper conpayMapper;
    @Override
    public List<Company> getcompany() {
       return conpayMapper.selectAllConpay();
    }
}
