package com.brainyi.controller;


import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Result;
import com.brainyi.domain.SysUser;
import com.brainyi.mapper.SysUserMapper;
import com.brainyi.service.SysUserService;
import com.brainyi.util.JWTUtils;
import com.brainyi.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


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
    @Autowired
    RedisTemplate redisTemplate;

    /**
     * 系统用户查询接口
     *
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

    @RequestMapping("/login")
    public Result login(@RequestParam("phone") String sysUserPhone, @RequestParam("pwd") String sysUserPassword, HttpServletResponse response) {
        Result result = sysUserService.findUserForLogin(sysUserPhone, sysUserPassword);
        if (result.getCode() == 1) {
            Map<String, String> claim = new HashMap<>(3);
            claim.put("sysUserId", ((SysUser) result.getObj()).getSysUserId().toString());
            claim.put("phone", sysUserPhone);
            String token = JWTUtils.getToken(claim);
            //以token为键 对象为值 存30分钟
            redisTemplate.boundValueOps(token).set(JSON.toJSONString(result.getObj()), 30, TimeUnit.MINUTES);
            //result对象 放置token返回
            result.setObj(token);
        }
        return result;
    }

}
