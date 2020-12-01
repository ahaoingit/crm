package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Product;
import com.brainyi.domain.Result;
import com.brainyi.mapper.ProductMapper;
import com.brainyi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    //删除当前一行产品
    @RequestMapping(value = "/deleteCurrProduct",method = RequestMethod.GET)
    public String deleteCurrProduct( Integer pid){

        return JSON.toJSONString(productService.deleteProduct(pid));

    }

    //增加新产品
    @RequestMapping(value = "/addNewProduct",method = RequestMethod.POST)
    public String addNewProduct(@RequestBody Product product){
        System.out.println(product);
        return JSON.toJSONString(productService.addProduct(product));

    }
}
