package com.brainyi.domain;

public class DepartmentOne {
    private Integer did;

    private String dName;

    private Boolean dRank;

    private Integer dParentId;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public Boolean getdRank() {
        return dRank;
    }

    public void setdRank(Boolean dRank) {
        this.dRank = dRank;
    }

    public Integer getdParentId() {
        return dParentId;
    }

    public void setdParentId(Integer dParentId) {
        this.dParentId = dParentId;
    }
}