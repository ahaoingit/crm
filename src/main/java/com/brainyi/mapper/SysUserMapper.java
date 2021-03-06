package com.brainyi.mapper;

import com.brainyi.domain.Client;
import com.brainyi.domain.SysUser;
import com.brainyi.domain.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

//   查询所有系统用户
    List<SysUser> selectAllSysUsers();

    //删除当前一行数据
    Integer deleteSysUser(@Param("sysUserId") Integer sysUserId);

//    增加新用户
    Integer addSysUser(SysUser sysUser);

    /**
     * 获取用户信息 与 角色
     * @param sysUserId
     * @return
     */
    SysUser selectUserAndRoleById(@Param("id") String sysUserId);


}