package com.brainyi.service;

import com.brainyi.domain.Client;
import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Product;
import com.brainyi.domain.Result;
import com.brainyi.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    /**
     * 查询所有产品
     * @return
     */
    public Result findProductForPage(Integer page, Integer pageSize) {
        //构建返回对象
        PageReturnData<Product> pageReturnData = new PageReturnData<>();
        //获取公海总数 必须在开启分页之前查寻 原因:开启分页后 查询语句会根据分页启用limit
        int count = productMapper.selectAllProducts().size();
        pageReturnData.setCount(count);
        //开启分页
        PageHelper.startPage(page,pageSize);
        //初始化分页数据 分页会对第一个select进行分页
        List<Product> products = productMapper.selectAllProducts();
        pageReturnData.setData(products);
        //初始化信息与标志
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setMessage("查询分页成功");
        return pageReturnData;
    }

    public Result selectAllProducts() {

        PageReturnData<Product> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(productMapper.selectAllProducts());
        return  pageReturnData;
    }

    //删除当前一行产品
    public Result deleteProduct(Integer pid){

        productMapper.deleteProduct(pid);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("删除成功");
        return result;
    }

    //    增加新产品
    public Result addProduct(Product product){
        productMapper.addProduct(product);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
        System.out.println(product);
        return result;
    }
}
