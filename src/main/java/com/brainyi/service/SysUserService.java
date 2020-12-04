package com.brainyi.service;

import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Result;
import com.brainyi.domain.SysUser;
import com.brainyi.domain.SysUserExample;
import com.brainyi.mapper.SysUserMapper;
import org.junit.Test;
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

    public Result findUserForLogin(String sysUserPhone, String sysUserPassword) {
        Result result = new Result();
        if (!checkPhone(sysUserPhone)) {
            result.setMessage("手机号格式错误");
            result.setCode(Result.FAILS);
            return result;
        }
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andPhoneEqualTo(sysUserPhone).andPasswordEqualTo(sysUserPassword);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (sysUsers.size() > 0) {
            result.setCode(Result.SUCCESS);
            result.setMessage("login success");
            result.setObj(sysUsers.get(0));
        }else {
            result.setCode(Result.FAILS);
            result.setMessage("手机号或者密码错误");
        }
        return result;
    }

    /**
     * 手机号验证
     * @param sysUserPhone
     * @return
     */
    private boolean checkPhone(String sysUserPhone) {
        String match = "^1(3([0-35-9]\\d|4[1-8])|4[14-9]\\d|5([0-35689]\\d|7[1-79])|66\\d|7[2-35-8]\\d|8\\d{2}|9[13589]\\d)\\d{7}$";
        return sysUserPhone.matches(match);

    }
    @Test
    public void test() {
        System.out.println(checkPhone("18796388873"));
    }
}
