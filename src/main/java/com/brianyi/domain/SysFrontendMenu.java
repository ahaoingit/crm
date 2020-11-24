package com.brianyi.domain;

public class SysFrontendMenu {
    private String frontedMenuId;

    private String frontendMenuName;

    private String frontendMenuUrl;

    private String pid;

    private Integer frontedMenuSort;

    private String description;

    public String getFrontedMenuId() {
        return frontedMenuId;
    }

    public void setFrontedMenuId(String frontedMenuId) {
        this.frontedMenuId = frontedMenuId == null ? null : frontedMenuId.trim();
    }

    public String getFrontendMenuName() {
        return frontendMenuName;
    }

    public void setFrontendMenuName(String frontendMenuName) {
        this.frontendMenuName = frontendMenuName == null ? null : frontendMenuName.trim();
    }

    public String getFrontendMenuUrl() {
        return frontendMenuUrl;
    }

    public void setFrontendMenuUrl(String frontendMenuUrl) {
        this.frontendMenuUrl = frontendMenuUrl == null ? null : frontendMenuUrl.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getFrontedMenuSort() {
        return frontedMenuSort;
    }

    public void setFrontedMenuSort(Integer frontedMenuSort) {
        this.frontedMenuSort = frontedMenuSort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}