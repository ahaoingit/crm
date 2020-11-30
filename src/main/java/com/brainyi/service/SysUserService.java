package com.brainyi.service;

import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Result;
import com.brainyi.domain.SysUser;
import com.brainyi.domain.SysUserExample;
import com.brainyi.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;


    /**
     * 查询所有系统用户
     * @return
     */
    public Result selectAllSysUsers() {
//        SysUserExample sysUserExample = new SysUserExample();
//        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
//        criteria.andSysUserNameIsNull();
//        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
//        Result result = new Result();
//        result.setCode(Result.SUCCESS);
//        result.setObj(sysUserMapper.selectAllSysUsers());

        PageReturnData<SysUser> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(sysUserMapper.selectAllSysUsers());
        return  pageReturnData;
    }

//
public  Result insertSysUser(SysUser sysUser) {
    int insert = sysUserMapper.insert(sysUser);
    PageReturnData pageReturnData = new PageReturnData();
    pageReturnData.setCode(Result.SUCCESS);

    pageReturnData.setMessage("添加成功");
    System.out.println(insert);
    return pageReturnData;
}

    /**
     *
     * @return 插入结果
     */
    public int insertofSysUser(SysUser sysUser){
        return  sysUserMapper.insert(sysUser);
    }

}
