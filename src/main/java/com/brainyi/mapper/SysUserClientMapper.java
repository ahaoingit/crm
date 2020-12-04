package com.brainyi.mapper;

import com.brainyi.domain.SysUserClient;
import com.brainyi.domain.SysUserClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserClientMapper {
    long countByExample(SysUserClientExample example);

    int deleteByExample(SysUserClientExample example);

    int insert(SysUserClient record);

    int insertSelective(SysUserClient record);

    List<SysUserClient> selectByExample(SysUserClientExample example);

    int updateByExampleSelective(@Param("record") SysUserClient record, @Param("example") SysUserClientExample example);

    int updateByExample(@Param("record") SysUserClient record, @Param("example") SysUserClientExample example);

    /**
     * 公海 批量/单一  转私海
     * @param sysUserClientList
     * @param sysUserId
     * @return
     */
    int insertMoreOrOne(@Param("sysUserClientList") List<SysUserClient> sysUserClientList,@Param("sysUserId") String sysUserId);

    /**
     * 私海 批量/单一 转公海
     * @param sysUserClientList
     * @param sysUserId
     * @return
     */
    int deleteMoreOrOne(@Param("sysUserClientList") List<SysUserClient> sysUserClientList,@Param("sysUserId") String sysUserId);
}