package com.brainyi.controller;


import com.alibaba.fastjson.JSON;
import com.brainyi.domain.SysUser;
import com.brainyi.mapper.SysUserMapper;
import com.brainyi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * TODO
 *
 * @author ahao 2020-11-23
 */
@RestController
@RequestMapping("/sysUsers")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    SysUserMapper sysUserMapper;

    /**
     * 系统用户查询接口
     * @return
     */
    @RequestMapping("/showAllSysUsers")
    public String showAllSysUsers() {
        return JSON.toJSONString(sysUserService.selectAllSysUsers());
    }

//    添加用户
    @RequestMapping("/addSysUsers")
    public String addClientOfPublic(@RequestBody SysUser sysUser) {
        return JSON.toJSONString(sysUserService.insertSysUser(sysUser));
    }


}
