package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Lb;
import com.example.demo.mapper.LbMapper;
import com.example.demo.result.Result;
import com.example.demo.service.LitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class LitServiceImpl implements LitService {
    @Autowired
    LbMapper lbMapper;
    @Override
    public Map<String, Object> getLit() {
        List<Lb> lits = lbMapper.getLbList();
        return Result.success("",1,lits);

    }
         // Placeholder return statement

}
