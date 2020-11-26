package com.brainyi.domain;

public class Business {
    private Integer bid;

    private String bName;

    private String cname;

    private String contactsName;

    private Byte productType;

    private Byte bStage;

    private Byte bSource;

    private Integer clientcid;

    private Integer sysusersysUserId;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public Byte getbStage() {
        return bStage;
    }

    public void setbStage(Byte bStage) {
        this.bStage = bStage;
    }

    public Byte getbSource() {
        return bSource;
    }

    public void setbSource(Byte bSource) {
        this.bSource = bSource;
    }

    public Integer getClientcid() {
        return clientcid;
    }

    public void setClientcid(Integer clientcid) {
        this.clientcid = clientcid;
    }

    public Integer getSysusersysUserId() {
        return sysusersysUserId;
    }

    public void setSysusersysUserId(Integer sysusersysUserId) {
        this.sysusersysUserId = sysusersysUserId;
    }
}