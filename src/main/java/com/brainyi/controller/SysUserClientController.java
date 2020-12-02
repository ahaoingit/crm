package com.brainyi.controller;

import com.brainyi.service.SysUserClientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author ahao 2020-12-01
 */
@RestController
@RequestMapping("/SysUserClient")
public class SysUserClientController {
    @Autowired
    SysUserClientservice sysUserClientservice;
    public String changeClientToPrivateMoreOrOne(){
        return "";
    }
}
