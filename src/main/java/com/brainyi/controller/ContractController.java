package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.Business;
import com.brainyi.domain.Contract;
import com.brainyi.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractService contractService;

    @RequestMapping("/showAllContract")
    public String showAllContract(){return JSON.toJSONString(contractService.selectAllContract());}

    @RequestMapping(value = "/addContract")
    public String addContract(Contract contract){
        return JSON.toJSONString(contractService.insertContract(contract));
    }

    @RequestMapping("/deleteContract")
    public void deleteContract(Contract contract){contractService.deleteContract(contract);}

    @RequestMapping(value = "/updateContract")
    public String updateContract(Contract contract){return JSON.toJSONString(contractService.updateContract(contract));
    }
}
