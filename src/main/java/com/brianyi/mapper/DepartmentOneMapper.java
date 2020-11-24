package com.brianyi.mapper;

import com.brianyi.domain.DepartmentOne;
import com.brianyi.domain.DepartmentOneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentOneMapper {
    long countByExample(DepartmentOneExample example);

    int deleteByExample(DepartmentOneExample example);

    int insert(DepartmentOne record);

    int insertSelective(DepartmentOne record);

    List<DepartmentOne> selectByExample(DepartmentOneExample example);

    int updateByExampleSelective(@Param("record") DepartmentOne record, @Param("example") DepartmentOneExample example);

    int updateByExample(@Param("record") DepartmentOne record, @Param("example") DepartmentOneExample example);
}