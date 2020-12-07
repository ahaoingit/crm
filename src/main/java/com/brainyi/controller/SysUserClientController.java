package com.brainyi.controller;

import com.brainyi.domain.Result;
import com.brainyi.domain.SysUserClient;
import com.brainyi.service.SysUserClientservice;
import com.brainyi.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    @RequestMapping("/changeClientToPrivate")
    public Result changeClientToPrivate(@RequestBody List<SysUserClient> sysUserClients , HttpServletRequest request) {
        //获取SysUserId
        String token = request.getHeader("Token");
        String sysUserId = JWTUtils.getClaimVal("sysUserId", token);
        System.out.println(sysUserId);
        return sysUserClientservice.insertMoreClientToPrivateArea(sysUserClients,sysUserId);
    }
    @RequestMapping("/changeClientToPublic")
    public Result changeClientToPublic(@RequestBody List<SysUserClient> sysUserClients , HttpServletRequest request) {
        //获取SysUserId
        String token = request.getHeader("Token");
        String sysUserId = JWTUtils.getClaimVal("sysUserId", token);
        return sysUserClientservice.deleteClientOfPrivate(sysUserClients,sysUserId);
    }

}
