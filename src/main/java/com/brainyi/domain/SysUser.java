package com.brainyi.domain;

import java.util.Date;
import java.util.List;

public class SysUser {
    private Integer sysUserId;

    private String sysUserName;

    private String phone;

    private String email;

    private Date joinTime;

    private String password;

    private Integer dId;

    private DepartmentOne departmentOne;

    public DepartmentOne getDepartmentOne() {
        return departmentOne;
    }

    public void setDepartmentOne(DepartmentOne departmentOne) {
        this.departmentOne = departmentOne;
    }

    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName == null ? null : sysUserName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "sysUserId=" + sysUserId +
                ", sysUserName='" + sysUserName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", joinTime=" + joinTime +
                ", password='" + password + '\'' +
                ", dId=" + dId +
                ", departmentOne=" + departmentOne +
                '}';
    }
}