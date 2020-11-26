package com.brainyi.domain;

public class SysRoleFrontendMenu {
    private Integer id;

    private Integer rolerid;

    private String frontedMenuId;

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

    public String getFrontedMenuId() {
        return frontedMenuId;
    }

    public void setFrontedMenuId(String frontedMenuId) {
        this.frontedMenuId = frontedMenuId == null ? null : frontedMenuId.trim();
    }
}