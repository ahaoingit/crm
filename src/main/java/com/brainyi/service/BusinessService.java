package com.brainyi.service;

import com.brainyi.domain.Result;
import com.brainyi.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {
    @Autowired
    BusinessMapper businessMapper;

    public Result selectAllBusiness(){
        Result result=new Result();
        result.setCode(Result.SUCCESS);
        result.setObj(businessMapper.selectAllBusiness());
        return result;
    }
}
