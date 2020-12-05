package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Business;
import com.brainyi.domain.Contract;
import com.brainyi.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;

    @RequestMapping("/showAllContract")
    public String showAllContract(){return JSON.toJSONString(contractService.selectAllContract());}

    @RequestMapping(value = "/addContract",method = RequestMethod.POST)
    public String addContract(Contract contract){
        return JSON.toJSONString(contractService.insertContract(contract));
    }

    @RequestMapping("/deleteContract")
    public void deleteContract(Contract contract){contractService.deleteContract(contract);}

    @RequestMapping("/updateContract")
    public String updateContract(Contract contract){return JSON.toJSONString(contractService.updateContract(contract));
    }

    @RequestMapping("/findContractByPage")
    public String findContractByPage(@RequestParam("page")Integer page,@RequestParam("limit")Integer pageSize){
        return JSON.toJSONString(contractService.findContractForPage(page,pageSize));
    }
}
