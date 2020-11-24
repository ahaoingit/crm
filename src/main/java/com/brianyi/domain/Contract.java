package com.brianyi.domain;

import java.util.Date;

public class Contract {
    private String contractId;

    private String cname;

    private String signer;

    private Date contractDate;

    private Byte invoicingFlag;

    private String orderClerck;

    private String notes;

    private Integer contractAttachmentUrl;

    private Integer clientcid;

    private Integer sysusersysUserId;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer == null ? null : signer.trim();
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Byte getInvoicingFlag() {
        return invoicingFlag;
    }

    public void setInvoicingFlag(Byte invoicingFlag) {
        this.invoicingFlag = invoicingFlag;
    }

    public String getOrderClerck() {
        return orderClerck;
    }

    public void setOrderClerck(String orderClerck) {
        this.orderClerck = orderClerck == null ? null : orderClerck.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Integer getContractAttachmentUrl() {
        return contractAttachmentUrl;
    }

    public void setContractAttachmentUrl(Integer contractAttachmentUrl) {
        this.contractAttachmentUrl = contractAttachmentUrl;
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