package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Client;
import com.brainyi.domain.Result;
import com.brainyi.service.ClientService;
import com.brainyi.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * TODO
 *
 * @author ahao 2020-11-24
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    /**
     * 公海用户查询接口
     * @return
     */
    @RequestMapping("/showAllClientOfPublic")
    public String showAllClientOfPublic() {
        return JSON.toJSONString(clientService.selectAllClientOfPublic());
    }

    /**
     * 私海查询接口
     * @param userId
     * @return
     */
    @RequestMapping("/showClientOfPrivate")
    public String showClientOfPrivate(@RequestParam(value = "userId") String userId){
       return JSON.toJSONString(clientService.selectAllClientOfPrivateForUser(userId));
    }

    /**
     * 添加公海客户
     * @param client
     * @return
     */
    @RequestMapping(value = "/addClientOfPublic")
    public String addClientOfPublic(@RequestBody Client client) {
        return JSON.toJSONString(clientService.insertClientForPublic(client));
    }

    /**
     * 添加私海客户
     * @param client
     * @param request
     * @return
     */
    @RequestMapping(value = "/addClientOfPrivate")
    public Result addClientOfPrivate(@RequestBody Client client, HttpServletRequest request){
        String token = request.getHeader("Token");
        String sysUserId = JWTUtils.getClaimVal("sysUserId", token);
        return clientService.insertClientOfPrivate(client,sysUserId);
    }

    /**
     * 公海分页接口
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping("/findClientOfPublicForPage")
    public String findClientOfPublicForPage(@RequestParam("page") Integer page ,@RequestParam("limit") Integer pageSize){
        return JSON.toJSONString(clientService.findClientOfPublicForPage(page,pageSize));
    }

}
