package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.SysUserMapper;
import com.github.pagehelper.PageHelper;
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


}
