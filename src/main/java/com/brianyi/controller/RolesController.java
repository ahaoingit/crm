package com.brianyi.controller;

import com.alibaba.fastjson.JSON;
import com.brianyi.domain.Role;
import com.brianyi.domain.RoleExample;
import com.brianyi.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author ahao 2020-11-24
 */
@RestController
public class RolesController {
    @Autowired
    RoleMapper roleMapper;
    @RequestMapping("/showAllRoles")
    public String findAllRoles() {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andRnameEqualTo("打工仔");
        List<Role> roles = roleMapper.selectByExample(roleExample);
        roles.forEach(role -> System.out.println(role.getRname()));
        return JSON.toJSONString(roles);
    }
}
