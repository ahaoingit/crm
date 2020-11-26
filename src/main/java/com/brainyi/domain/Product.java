package com.brainyi.domain;

public class Product {
    private Integer pid;

    private String pname;

    private Integer pCreateTime;

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

    public Integer getpCreateTime() {
        return pCreateTime;
    }

    public void setpCreateTime(Integer pCreateTime) {
        this.pCreateTime = pCreateTime;
    }

    public Integer getpCreatePerson() {
        return pCreatePerson;
    }

    public void setpCreatePerson(Integer pCreatePerson) {
        this.pCreatePerson = pCreatePerson;
    }
}