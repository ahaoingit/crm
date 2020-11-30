package com.brainyi.service;

import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Product;
import com.brainyi.domain.Result;
import com.brainyi.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    /**
     * 查询所有产品
     * @return
     */
    public Result selectAllProducts() {

        PageReturnData<Product> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(productMapper.selectAllProducts());
        return  pageReturnData;
    }
}
