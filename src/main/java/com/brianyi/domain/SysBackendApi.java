package com.brianyi.domain;

public class SysBackendApi {
    private String backendApiId;

    private String backendApiName;

    private String backendApiMethod;

    private String backendApiUrl;

    private String pid;

    private Integer backendApiSort;

    private String description;

    public String getBackendApiId() {
        return backendApiId;
    }

    public void setBackendApiId(String backendApiId) {
        this.backendApiId = backendApiId == null ? null : backendApiId.trim();
    }

    public String getBackendApiName() {
        return backendApiName;
    }

    public void setBackendApiName(String backendApiName) {
        this.backendApiName = backendApiName == null ? null : backendApiName.trim();
    }

    public String getBackendApiMethod() {
        return backendApiMethod;
    }

    public void setBackendApiMethod(String backendApiMethod) {
        this.backendApiMethod = backendApiMethod == null ? null : backendApiMethod.trim();
    }

    public String getBackendApiUrl() {
        return backendApiUrl;
    }

    public void setBackendApiUrl(String backendApiUrl) {
        this.backendApiUrl = backendApiUrl == null ? null : backendApiUrl.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getBackendApiSort() {
        return backendApiSort;
    }

    public void setBackendApiSort(Integer backendApiSort) {
        this.backendApiSort = backendApiSort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}