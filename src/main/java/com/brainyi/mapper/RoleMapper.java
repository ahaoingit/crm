package com.brainyi.mapper;

import com.brainyi.domain.Role;
import com.brainyi.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * 根据角色id 获取角色信息
     * @param rid
     * @return
     */
    Role selectRoleById(@Param("rid") String rid);

    /**
     * 获取 角色前端功能列表
     * @param rid
     * @return
     */
//    Role selectRoleFrontMenuByRoleId(@Param("rid") String rid);
}