package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.SysUserMapper;

import com.github.pagehelper.PageHelper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    //分页展示用户
    public Result findSysUserForPage(Integer page, Integer pageSize) {
        //构建返回对象
        PageReturnData<SysUser> pageReturnData = new PageReturnData<>();
        //获取产品总数 必须在开启分页之前查寻 原因:开启分页后 查询语句会根据分页启用limit
        int count = sysUserMapper.selectAllSysUsers().size();
        pageReturnData.setCount(count);
        //开启分页
        PageHelper.startPage(page,pageSize);
        //初始化分页数据 分页会对第一个select进行分页
        List<SysUser> sysUsers = sysUserMapper.selectAllSysUsers();
        pageReturnData.setData(sysUsers);
        //初始化信息与标志
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setMessage("查询分页成功");
        return pageReturnData;
    }


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

    //    修改员工信息
    public Result updateByExampleSelective(SysUser sysUser){
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andSysUserIdEqualTo(sysUser.getSysUserId());
        sysUser.setSysUserName(sysUser.getSysUserName());
        sysUser.setEmail(sysUser.getEmail());
        sysUser.setPhone(sysUser.getPhone());
        sysUser.setPassword(sysUser.getPassword());
        sysUser.setdId(sysUser.getdId());
        sysUserMapper.updateByExampleSelective(sysUser,sysUserExample);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("修改员工成功");
        System.out.println(sysUser);
        return result;
    }

//    批量删除
    public Result deleteAll(List<Integer> sysUserId){
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andSysUserIdIn(sysUserId);
        sysUserMapper.deleteByExample(sysUserExample);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("批量删除成功");
        System.out.println(sysUserId);
        return result;
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
