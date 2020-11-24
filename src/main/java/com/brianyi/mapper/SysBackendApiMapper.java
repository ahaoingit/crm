package com.brianyi.mapper;

import com.brianyi.domain.SysBackendApi;
import com.brianyi.domain.SysBackendApiExample;
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