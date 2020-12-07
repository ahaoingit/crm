package com.brainyi.mapper;

import com.brainyi.domain.SysFrontendMenu;
import com.brainyi.domain.SysFrontendMenuExample;
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

    /**
     * 根据id 获取 前端功能列表
     * @param id
     * @return
     */
    List<SysFrontendMenu> selectFrontMenuById(@Param("id") String id);

}