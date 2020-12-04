package com.brainyi.service;

import com.brainyi.domain.Result;
import com.brainyi.domain.SysUserClient;
import com.brainyi.mapper.SysUserClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * TODO
 *
 * @author ahao 2020-12-01
 */
@Service
public class SysUserClientservice {
    @Autowired
    SysUserClientMapper sysUserClientMapper;
    /**
     * 公海 转入 私海 统一以list集合进行封装 功能 单一转私海 批量转私海
     * @param sysUserClients
     * @return
     */
    public Result insertMoreClientToPrivateArea(List<SysUserClient> sysUserClients , String sysUserId) {
        sysUserClientMapper.insertMoreOrOne(sysUserClients,sysUserId);
        return new Result(Result.SUCCESS,"转入成功");
    }

    /**
     * 私海转公海 删除 中间表数据
     * @param sysUserClients
     * @param sysUserId
     * @return
     */
    public Result deleteClientOfPrivate(List<SysUserClient> sysUserClients , String sysUserId) {
        sysUserClientMapper.deleteMoreOrOne(sysUserClients,sysUserId);
        return new Result(Result.SUCCESS,"转出成功");
    }
}
