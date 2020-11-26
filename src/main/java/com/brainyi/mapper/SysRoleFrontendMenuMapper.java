package com.brainyi.mapper;

import com.brainyi.domain.SysRoleFrontendMenu;
import com.brainyi.domain.SysRoleFrontendMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFrontendMenuMapper {
    long countByExample(SysRoleFrontendMenuExample example);

    int deleteByExample(SysRoleFrontendMenuExample example);

    int insert(SysRoleFrontendMenu record);

    int insertSelective(SysRoleFrontendMenu record);

    List<SysRoleFrontendMenu> selectByExample(SysRoleFrontendMenuExample example);

    int updateByExampleSelective(@Param("record") SysRoleFrontendMenu record, @Param("example") SysRoleFrontendMenuExample example);

    int updateByExample(@Param("record") SysRoleFrontendMenu record, @Param("example") SysRoleFrontendMenuExample example);
}