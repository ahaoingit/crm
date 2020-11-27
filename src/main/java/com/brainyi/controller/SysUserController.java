package com.brainyi.controller;


import com.alibaba.fastjson.JSON;
import com.brainyi.domain.SysUser;
import com.brainyi.domain.SysUserExample;
import com.brainyi.mapper.SysUserMapper;
import com.brainyi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}
