package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Product;
import com.brainyi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;


    /**
     * 产品查询接口
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

    //    批量删除
    @RequestMapping("/deleteAll")
    public String deleteAll(@RequestBody List<Integer> pid){
        return JSON.toJSONString(productService.deleteAll(pid));
    }

    //增加新产品
    @RequestMapping(value = "/addNewProduct",method = RequestMethod.POST)
    public String addNewProduct(@RequestBody Product product){
        System.out.println(product);
        return JSON.toJSONString(productService.addProduct(product));

    }

    //修改产品信息
    @RequestMapping("/updateProduct")
    public String updateProduct(@RequestBody Product product){
        System.out.println(product);
        return JSON.toJSONString(productService.updateByExampleSelective(product));

    }

   //产品分页
    @RequestMapping("/findProductForPage")
    public String findProductForPage(@RequestParam("page") Integer page , @RequestParam("limit") Integer pageSize){
        return JSON.toJSONString(productService.findProductForPage(page,pageSize));
    }
}
