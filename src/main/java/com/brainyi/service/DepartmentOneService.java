package com.brainyi.service;

import com.brainyi.domain.DepartmentOne;
import com.brainyi.domain.DepartmentOneExample;
import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Result;
import com.brainyi.mapper.DepartmentOneMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentOneService {

    @Autowired
    DepartmentOneMapper departmentOneMapper;



     // 查询所有部门

    public Result selectAllDepartmentOne() {

        PageReturnData<DepartmentOne> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(departmentOneMapper.selectAllDepartmentOne());
        return  pageReturnData;
    }

    //根据did查询
    public Result selectByDid(Integer did){

        Result result = new Result();
        result.setObj(departmentOneMapper.selectByDId(did));
        result.setCode(Result.SUCCESS);
        result.setMessage("查询成功");
        return result;
    }

    //分页展示部门
    public Result findDepartmentForPage(Integer page, Integer pageSize) {
        //构建返回对象
        PageReturnData<DepartmentOne> pageReturnData = new PageReturnData<>();
        //获取产品总数 必须在开启分页之前查寻 原因:开启分页后 查询语句会根据分页启用limit
        int count = departmentOneMapper.selectAllDepartmentOne().size();
        pageReturnData.setCount(count);
        //开启分页
        PageHelper.startPage(page,pageSize);
        //初始化分页数据 分页会对第一个select进行分页
        List<DepartmentOne> departmentOnes = departmentOneMapper.selectAllDepartmentOne();
        pageReturnData.setData(departmentOnes);
        //初始化信息与标志
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setMessage("查询分页成功");
        return pageReturnData;
    }

    //添加新部门
    public Result insert(DepartmentOne departmentOne){

        departmentOne.setdName(departmentOne.getdName());
        departmentOne.setdRank(departmentOne.getdRank());
        departmentOne.setdParentId(departmentOne.getdParentId());
        departmentOneMapper.insert(departmentOne);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
        System.out.println(departmentOne);
        return result;
    }

    //删除部门
    public Result deleteByExample(Integer did){
        DepartmentOneExample example = new DepartmentOneExample();
        DepartmentOneExample.Criteria criteria = example.createCriteria();
        criteria.andDidEqualTo(did);
        departmentOneMapper.deleteByExample(example);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("删除成功");
        return result;
    }

    //    批量删除
    public Result deleteAll(List<Integer> did){
        DepartmentOneExample example = new DepartmentOneExample();
        DepartmentOneExample.Criteria criteria = example.createCriteria();
        criteria.andDidIn(did);
        departmentOneMapper.deleteByExample(example);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("批量删除成功");
        System.out.println(did);
        return result;
    }




    //    修改部门信息
    public Result updateByExampleSelective(DepartmentOne departmentOne){
        DepartmentOneExample example = new DepartmentOneExample();
        DepartmentOneExample.Criteria criteria = example.createCriteria();
        criteria.andDidEqualTo(departmentOne.getDid());
       departmentOne.setdName(departmentOne.getdName());
       departmentOne.setdRank(departmentOne.getdRank());
        departmentOneMapper.updateByExampleSelective(departmentOne,example);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("修改成功");
        System.out.println(departmentOne);
        return result;
    }
}
