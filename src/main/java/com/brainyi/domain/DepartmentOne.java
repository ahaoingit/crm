package com.brainyi.domain;

import java.util.ArrayList;
import java.util.List;

public class DepartmentOne {
    private Integer did;

    private String dName;

    private Integer dRank;

    private Integer dParentId;

    private List<DepartmentOne> departmentOneList;

    public List<DepartmentOne> getDepartmentOneList() {
        return departmentOneList;
    }

    public void setDepartmentOneList(List<DepartmentOne> departmentOneList) {
        this.departmentOneList = departmentOneList;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Integer getdRank() {
        return dRank;
    }

    public void setdRank(Integer dRank) {
        this.dRank = dRank;
    }

    public Integer getdParentId() {
        return dParentId;
    }

    public void setdParentId(Integer dParentId) {
        this.dParentId = dParentId;
    }

    @Override
    public String toString() {
        return "DepartmentOne{" +
                "did=" + did +
                ", dName='" + dName + '\'' +
                ", dRank=" + dRank +
                ", dParentId=" + dParentId +
                ", departmentOneList=" + departmentOneList +
                '}';
    }
}