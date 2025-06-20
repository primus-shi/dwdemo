package com.example.demo.service;

import com.example.demo.entity.Lb;

import java.util.List;
import java.util.Map;

public interface LitService { public Map<String, Object>

    getLit(String page, String limit);

    Map<String,Object> getLbList();

    Map<String, Object> addLbt(Lb lb);

    Map<String, Object> deleteLbt(Integer id);
}
