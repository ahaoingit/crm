package com.brainyi.service;

import com.brainyi.domain.Client;
import com.brainyi.domain.Result;
import com.brainyi.domain.SysUser;
import com.brainyi.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 *客户业务类
 * @author ahao 2020-11-24
 */
@Service
public class ClientService {
    @Autowired
    ClientMapper clientMapper;

    public  Result insertClientForPublic(Client client) {
        int insert = clientMapper.insert(client);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
        return result;
    }

    /**
     * 插入公海客户 即不拥有系统用户
     * @return 插入结果
     */
    public int insertClientOfPublic(Client client){
       return  clientMapper.insert(client);
    }

    /**
     * 插入私海用户 有一下步骤  1.插入client表 2.插入sys_user_client表
     * @param client
     * @param sysUser
     * @return
     */
    public int insertClientOfPrivate(Client client , SysUser sysUser) {
        return 0;
    }

    /**
     * 查询所有公海用户
     * @return
     */
    public Result selectAllClientOfPublic() {
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setObj(clientMapper.selectAllClientOfPublic());
        return  result;
    }

    /**
     * 查询用户个人私海
     * @param userID
     * @return
     */
    public Result selectAllClientOfPrivateForUser(String userID) {
        Result result = new Result();
        List<Client> clients = clientMapper.selectClientBySysUserId(userID);
        if (clients.size() == 0) {
            result.setMessage("您还没有个人客户哦");
        } else {
            result.setMessage("查询成功");
            result.setObj(clients);
        }
        result.setCode(Result.SUCCESS);
        return result;
    }

}
