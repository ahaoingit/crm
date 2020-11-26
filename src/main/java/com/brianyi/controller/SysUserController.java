package com.brianyi.controller;

import com.alibaba.fastjson.JSON;


import com.brianyi.domain.Result;
import com.brianyi.domain.SysUser;
import com.brianyi.domain.SysUserExample;
import com.brianyi.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author ahao 2020-11-23
 */
@RestController
public class SysUserController {
    @Autowired
    SysUserMapper sysUserMapper;
        @RequestMapping("/showAllSysUsers")

        public @ResponseBody Map<String,Object>  findAllSysUsers(){
            SysUserExample sysUserExample = new SysUserExample();

            SysUserExample.Criteria criteria = sysUserExample.createCriteria();
//            criteria.andSysUserNameEqualTo("小明");
            criteria.andSysUserIdIsNotNull();
            List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
            int count = sysUsers.size();
            sysUsers.forEach(sysUser -> System.out.println(sysUser.getSysUserName()));
//            return JSON.toJSONString(sysUsers);
            Map<String,Object> map = new HashMap<>();
            map.put("msg",null);
            map.put("code",0);
            map.put("count",count);
            map.put("data",sysUsers);
            System.out.println(map);
            return map;

        }

}
