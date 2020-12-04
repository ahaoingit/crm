package com.brainyi.domain;

import java.util.Date;
import java.util.List;

public class Product {
    private Integer pid;

    private String pname;

    private Date pCreateTime;

    private Integer pCreatePerson;

    private SysUser sysUser;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Date getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Date pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    public Integer getpCreatePerson() {
        return pCreatePerson;
    }

    public void setpCreatePerson(Integer pCreatePerson) {
        this.pCreatePerson = pCreatePerson;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pCreateTime=" + pCreateTime +
                ", pCreatePerson=" + pCreatePerson +
                ", sysUser=" + sysUser +
                '}';
    }
}