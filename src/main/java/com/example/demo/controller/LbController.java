package com.example.demo.controller;

import com.example.demo.service.LitService;
import com.example.demo.service.serviceImpl.LitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
@Controller
public class LbController {
    @Autowired
    LitService litService ;
    @RequestMapping("/getLb")
    @ResponseBody
    public Map<String,Object> getLb() {
         return   litService.getLit();
    }
}
