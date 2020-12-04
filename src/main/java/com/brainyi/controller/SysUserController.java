package com.brainyi.controller;


import com.alibaba.fastjson.JSON;
import com.brainyi.domain.SysUser;
import com.brainyi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

//    批量删除
    @RequestMapping("/deleteAll")
    public String deleteAll(@RequestBody List<Integer> sysUserId){
        return JSON.toJSONString(sysUserService.deleteAll(sysUserId));
    }

    //增加新用户
    @RequestMapping("/addNewSysUser")
    public String addNewSysUser(@RequestBody SysUser sysUser){

        System.out.println(sysUser);
        return JSON.toJSONString(sysUserService.addSysUser(sysUser));

    }

    //修改用户信息
    @RequestMapping("/updateSysUser")
    public String updateSysUser(@RequestBody SysUser sysUser){
        System.out.println(sysUser);
        return JSON.toJSONString(sysUserService.updateByExampleSelective(sysUser));

    }

    //产品分页
    @RequestMapping("/findSysUserForPage")
    public String findSysUserForPage(@RequestParam("page") Integer page , @RequestParam("limit") Integer pageSize){
        return JSON.toJSONString(sysUserService.findSysUserForPage(page,pageSize));
    }


}
