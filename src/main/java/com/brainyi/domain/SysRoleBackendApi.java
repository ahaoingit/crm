package com.brainyi.domain;

public class SysRoleBackendApi {
    private Integer id;

    private Integer rolerid;

    private String backendApiId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRolerid() {
        return rolerid;
    }

    public void setRolerid(Integer rolerid) {
        this.rolerid = rolerid;
    }

    public String getBackendApiId() {
        return backendApiId;
    }

    public void setBackendApiId(String backendApiId) {
        this.backendApiId = backendApiId == null ? null : backendApiId.trim();
    }
}