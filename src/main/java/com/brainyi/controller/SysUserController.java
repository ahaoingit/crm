package com.brainyi.controller;


import com.alibaba.fastjson.JSON;
import com.brainyi.domain.SysUser;
import com.brainyi.mapper.SysUserMapper;
import com.brainyi.service.SysUserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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



    //删除当前一行用户
    @RequestMapping(value = "/deleteCurrUser",method = RequestMethod.GET)
    public String deleteCurrUser( Integer sysUserId){

        return JSON.toJSONString(sysUserService.deleteSysUser(sysUserId));

    }

    //增加新用户
    @RequestMapping(value = "/addNewSysUser",method = RequestMethod.POST)
    public String addNewSysUser(@RequestBody SysUser sysUser){
        System.out.println(111111);
        System.out.println(sysUser);
        return JSON.toJSONString(sysUserService.addSysUser(sysUser));

    }


}
