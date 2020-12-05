package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.ContractMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    ContractMapper contractMapper;

    public Result findContractForPage(Integer page,Integer pageSize){
        PageReturnData<Contract>pageReturnData=new PageReturnData<>();
        int count=contractMapper.selectAllContract().size();
        pageReturnData.setCount(count);
        PageHelper.startPage(page,pageSize);
        List<Contract>contracts=contractMapper.selectAllContract();
        pageReturnData.setData(contracts);
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setMessage("查询分页成功");
        return pageReturnData;
    }

    public Result selectAllContract(){
       PageReturnData<Contract>pageReturnData=new PageReturnData<>();
       pageReturnData.setCode(Result.SUCCESS);
       pageReturnData.setData(contractMapper.selectAllContract());
       return pageReturnData;
    }

    public Result insertContract(Contract contract){
        int insert=contractMapper.insert(contract);
        Result result=new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
        System.out.println(contract);
        return result;
    }

    public Result deleteContract(Contract contract){
        ContractExample example=new ContractExample();
        ContractExample.Criteria criteria = example.createCriteria();
        criteria.andContractIdEqualTo(contract.getContractId());
        contractMapper.deleteByExample(example);
        Result result=new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("删除成功");
        return result;
    }
    public Result updateContract(Contract contract) {
        ContractExample example = new ContractExample();
        ContractExample.Criteria criteria = example.createCriteria();
        criteria.andContractIdEqualTo(contract.getContractId());
        contract.setContractDate(contract.getContractDate());
        contractMapper.updateByExampleSelective(contract, example);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("修改成功");
        System.out.println(contract);
        return result;
    }
}
