package com.brainyi.mapper;

import com.brainyi.domain.SysBackendApi;
import com.brainyi.domain.SysBackendApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBackendApiMapper {
    long countByExample(SysBackendApiExample example);

    int deleteByExample(SysBackendApiExample example);

    int insert(SysBackendApi record);

    int insertSelective(SysBackendApi record);

    List<SysBackendApi> selectByExample(SysBackendApiExample example);

    int updateByExampleSelective(@Param("record") SysBackendApi record, @Param("example") SysBackendApiExample example);

    int updateByExample(@Param("record") SysBackendApi record, @Param("example") SysBackendApiExample example);
}