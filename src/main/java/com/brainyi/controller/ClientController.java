package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Client;
import com.brainyi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping(value = "/addClientOfPublic")
    public String addClientOfPublic(@RequestBody Client client) {
        System.out.println(client);
        return JSON.toJSONString(clientService.insertClientForPublic(client));
    }
}
