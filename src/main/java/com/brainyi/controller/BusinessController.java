package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    BusinessService businessService;

    @RequestMapping("/showAllBusiness")
    public String showAllBusiness(){return JSON.toJSONString(businessService.selectAllBusiness());
    }
}
