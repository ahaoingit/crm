package com.brainyi.domain;

public class Enterprise {
    private Integer enterpriseId;

    private String enterpriseName;

    private Integer clientcid;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public Integer getClientcid() {
        return clientcid;
    }

    public void setClientcid(Integer clientcid) {
        this.clientcid = clientcid;
    }
}