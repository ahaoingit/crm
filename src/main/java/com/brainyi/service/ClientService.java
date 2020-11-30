package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.ClientMapper;
import com.brainyi.mapper.SysUserClientMapper;
import com.github.pagehelper.PageHelper;
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
    @Autowired
    SysUserClientMapper sysUserClientMapper;
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

    /**
     * 公海分页
     * @param page
     * @param pageSize
     * @return
     */
    public Result findClientOfPublicForPage(Integer page, Integer pageSize) {
        //构建返回对象
        PageReturnData<Client> pageReturnData = new PageReturnData<>();
        //获取公海总数 必须在开启分页之前查寻 原因:开启分页后 查询语句会根据分页启用limit
        int count = clientMapper.selectAllClientOfPublic().size();
        pageReturnData.setCount(count);
        //开启分页
        PageHelper.startPage(page,pageSize);
        //初始化分页数据 分页会对第一个select进行分页
        List<Client> clients = clientMapper.selectAllClientOfPublic();
        pageReturnData.setData(clients);
        //初始化信息与标志
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setMessage("查询分页成功");
        return pageReturnData;
    }

}
