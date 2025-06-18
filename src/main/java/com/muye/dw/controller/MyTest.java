package com.muye.dw.controller;

import com.muye.dw.mapper.CompanyMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class MyTest {
    @Resource
    private CompanyMapper companyMapper;
    @RequestMapping("/test")
    @ResponseBody
    public List<Map<String, Object>> getAll(){

        return  companyMapper.getAll();
    }
}
