package com.example.demo.controller;

import com.example.demo.service.serviceImpl.CompanyServiceImpl;
import com.example.demo.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CompanyController {


    @Autowired
    CompanyServiceImpl companyServiceImpl;
    @RequestMapping("/getCompany")
    @ResponseBody
    public List<Company> getcompany(){
        return companyServiceImpl.getcompany();
    }
}
