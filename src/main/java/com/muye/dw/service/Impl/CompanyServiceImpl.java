package com.muye.dw.service.Impl;

import com.muye.dw.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public List<Map<String, Object>> getCompanyList() {
        return Collections.emptyList();
    }
}
