package com.brainyi.domain;

import java.util.Date;

public class Product {
    private Integer pid;

    private String pname;

    private Date pCreateTime;

    private Integer pCreatePerson;

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
}