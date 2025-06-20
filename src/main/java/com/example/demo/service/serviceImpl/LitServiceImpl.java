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
    public Map<String, Object> getLit(String page, String limit) {
        int pages = Integer.parseInt(page);
        int pageSize = Integer.parseInt(limit);
        List<Lb> lits = lbMapper.getLbList((pages-1)*pageSize,pageSize );
        int count = lbMapper.getAllLbCount();
        return Result.success("",count,lits);

    }

    @Override
    public Map<String,Object> getLbList() {
        List<Lb> lits =lbMapper.getLb();
      return  Result.success("", 1,lits);
    }
    // Placeholder return statement

}
