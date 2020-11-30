package com.brainyi.service;

import com.brainyi.domain.DepartmentOne;
import com.brainyi.domain.PageReturnData;
import com.brainyi.domain.Result;
import com.brainyi.mapper.DepartmentOneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentOneService {

    @Autowired
    DepartmentOneMapper departmentOneMapper;


    /**
     * 查询所有系统用户
     * @return
     */
    public Result selectAllDepartmentOne() {

        PageReturnData<DepartmentOne> pageReturnData = new PageReturnData<>();
        pageReturnData.setCode(Result.SUCCESS);
        pageReturnData.setData(departmentOneMapper.selectAllDepartmentOne());
        return  pageReturnData;
    }
}
