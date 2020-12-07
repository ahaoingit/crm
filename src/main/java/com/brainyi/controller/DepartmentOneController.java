package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.domain.DepartmentOne;
import com.brainyi.service.DepartmentOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentOneController {
    @Autowired
    DepartmentOneService departmentOneService;


   //部门查询接口
    @RequestMapping("/showAllDepartment")
    public String showAllDepartment() {
        return JSON.toJSONString(departmentOneService.selectAllDepartmentOne());
    }

    //根据did查询
    @RequestMapping("/showDepartmentByDid")
    public String showDepartmentByDid(Integer did) {
        return JSON.toJSONString(departmentOneService.selectByDid(did));
    }


    //部门分页
    @RequestMapping("/findDepartmentForPage")
    public String findDepartmentForPage(@RequestParam("page") Integer page , @RequestParam("limit") Integer pageSize){
        return JSON.toJSONString(departmentOneService.findDepartmentForPage(page,pageSize));
    }

    //添加新部门
    @RequestMapping("/addDepartment")
    public String addDepartment(@RequestBody DepartmentOne departmentOne){
        return JSON.toJSONString(departmentOneService.insert(departmentOne));
    }

    //删除当前部门
    @RequestMapping(value = "/deleteCurrDepartment")
    public String deleteCurrDepartment(Integer did){
        return JSON.toJSONString(departmentOneService.deleteByExample(did));

    }

    //    批量删除
    @RequestMapping("/deleteAll")
    public String deleteAll(@RequestBody List<Integer> did){
        return JSON.toJSONString(departmentOneService.deleteAll(did));
    }


    //修改部门信息
    @RequestMapping("/updateDepartment")
    public String updateDepartment(@RequestBody DepartmentOne departmentOne){
        System.out.println(departmentOne);
        return JSON.toJSONString(departmentOneService.updateByExampleSelective(departmentOne));

    }
}
