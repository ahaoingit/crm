package com.brainyi.mapper;

import com.brainyi.domain.SysRoleBackendApi;
import com.brainyi.domain.SysRoleBackendApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleBackendApiMapper {
    long countByExample(SysRoleBackendApiExample example);

    int deleteByExample(SysRoleBackendApiExample example);

    int insert(SysRoleBackendApi record);

    int insertSelective(SysRoleBackendApi record);

    List<SysRoleBackendApi> selectByExample(SysRoleBackendApiExample example);

    int updateByExampleSelective(@Param("record") SysRoleBackendApi record, @Param("example") SysRoleBackendApiExample example);

    int updateByExample(@Param("record") SysRoleBackendApi record, @Param("example") SysRoleBackendApiExample example);
}