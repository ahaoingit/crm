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

        PageReturnData<SysUser> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(sysUserMapper.selectAllSysUsers());
        return  pageReturnData;
    }



    //删除当前一行用户
    public Result deleteSysUser(Integer sysUserId){

        sysUserMapper.deleteSysUser(sysUserId);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("删除成功");
        return result;
    }

//    增加新用户
    public Result addSysUser(SysUser sysUser){
        sysUserMapper.addSysUser(sysUser);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
        return result;
    }

}
