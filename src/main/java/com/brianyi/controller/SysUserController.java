package com.brianyi.controller;

import com.brianyi.domain.Roles;
import com.brianyi.mapper.RolesMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import java.util.Date;

/**
 * TODO
 *
 * @author ahao 2020-11-23
 */
@RestController
//@Api
public class SysUserController {
    @Autowired
    RolesMapper rolesMapper;
    @RequestMapping("/print")
//    @ApiOperation(value = "test")
    public String print() {
        Roles roles =new Roles();
        roles.setrCreateTime(new Date());
        roles.setRemarks("test");
        roles.setRname("管理元");
        return rolesMapper.insert(roles)+"";
    }

}
