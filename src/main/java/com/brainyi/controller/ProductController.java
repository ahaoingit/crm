package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Result;
import com.brainyi.mapper.ProductMapper;
import com.brainyi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;


    /**
     * 系统用户查询接口
     * @return
     */
    @RequestMapping("/showAllProducts")
    public String showAllProducts() {
        return JSON.toJSONString(productService.selectAllProducts());

    }
}
