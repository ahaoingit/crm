package com.brainyi.mapper;

import com.brainyi.domain.Product;
import com.brainyi.domain.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);
    //   查询所有产品
    List<Product> selectAllProducts();

    //删除当前一行数据
    Integer deleteProduct(@Param("pid") Integer pid);

    //    增加新用户
    Integer addProduct(Product product);


}