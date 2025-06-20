package com.example.demo.controller;

import com.example.demo.entity.Lb;
import com.example.demo.service.LitService;
import com.example.demo.service.serviceImpl.LitServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@Controller
public class LbController {
    @Autowired
    LitService litService ;
    @RequestMapping("/getAllLbt")
    @ResponseBody
    public Map<String,Object> getLb(@Param("page") String page, @Param("limit") String limit) {
         return   litService.getLit(page,limit );
    }
    @RequestMapping("/getLb")
    @ResponseBody
    public Map<String,Object> getLbList() {
        return litService.getLbList();
    }
}
