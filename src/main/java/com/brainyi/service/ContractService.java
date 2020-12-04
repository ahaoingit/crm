package com.brainyi.service;

import com.brainyi.domain.*;
import com.brainyi.mapper.ContractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    @Autowired
    ContractMapper contractMapper;

    public Result selectAllContract(){
        Result result=new Result();
        result.setCode(Result.SUCCESS);
        result.setObj(contractMapper.selectAllContract());
        return result;
    }

    public Result insertContract(Contract contract){
        int insert=contractMapper.insert(contract);
        Result result=new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("添加成功");
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
        contractMapper.updateByExampleSelective(contract, example);
        Result result = new Result();
        result.setCode(Result.SUCCESS);
        result.setMessage("修改成功");
        return result;
    }
}
