package com.brainyi.controller;

import com.alibaba.fastjson.JSON;
import com.brainyi.mapper.DepartmentOneMapper;
import com.brainyi.service.DepartmentOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentOneController {@Autowired
DepartmentOneService departmentOneService;
    DepartmentOneMapper departmentOneMapper;

    /**
     * 系统用户查询接口
     * @return
     */
    @RequestMapping("/showAllDepartment")
    public String showAllDepartment() {
        return JSON.toJSONString(departmentOneService.selectAllDepartmentOne());
    }
}
