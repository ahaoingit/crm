package com.brainyi.domain;

import java.util.Date;
import java.util.List;

public class Role {
    private Integer rid;

    private String rname;

    private String remarks;

    private Date rCreateTime;

    private List<SysFrontendMenu> sysFrontendMenus;

    private List<SysBackendApi> sysBackendApis;

    public List<SysBackendApi> getSysBackendApis() {
        return sysBackendApis;
    }

    public void setSysBackendApis(List<SysBackendApi> sysBackendApis) {
        this.sysBackendApis = sysBackendApis;
    }

    public List<SysFrontendMenu> getSysFrontendMenus() {
        return sysFrontendMenus;
    }

    public void setSysFrontendMenus(List<SysFrontendMenu> sysFrontendMenus) {
        this.sysFrontendMenus = sysFrontendMenus;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Date getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(Date rCreateTime) {
        this.rCreateTime = rCreateTime;
    }
}