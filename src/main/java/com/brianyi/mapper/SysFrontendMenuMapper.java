package com.brianyi.mapper;

import com.brianyi.domain.SysFrontendMenu;
import com.brianyi.domain.SysFrontendMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFrontendMenuMapper {
    long countByExample(SysFrontendMenuExample example);

    int deleteByExample(SysFrontendMenuExample example);

    int insert(SysFrontendMenu record);

    int insertSelective(SysFrontendMenu record);

    List<SysFrontendMenu> selectByExample(SysFrontendMenuExample example);

    int updateByExampleSelective(@Param("record") SysFrontendMenu record, @Param("example") SysFrontendMenuExample example);

    int updateByExample(@Param("record") SysFrontendMenu record, @Param("example") SysFrontendMenuExample example);
}