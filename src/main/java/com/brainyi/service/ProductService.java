package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;

    //分页展示产品
    public Result findProductForPage(Integer page, Integer pageSize) {
        //构建返回对象
        PageReturnData<Product> pageReturnData = new PageReturnData<>();
        //获取产品总数 必须在开启分页之前查寻 原因:开启分页后 查询语句会根据分页启用limit
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

//    修改产品
    public Result updateByExampleSelective(Product product){
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPidEqualTo(product.getPid());
        product.setPname(product.getPname());
        product.setpCreateTime(product.getpCreateTime());
        productMapper.updateByExampleSelective(product,productExample);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("修改成功");
        System.out.println(product);
        return result;
    }

    //    批量删除
    public Result deleteAll(List<Integer> pid){
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        criteria.andPidIn(pid);
        productMapper.deleteByExample(productExample);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("批量删除成功");
        System.out.println(pid);
        return result;
    }

}
