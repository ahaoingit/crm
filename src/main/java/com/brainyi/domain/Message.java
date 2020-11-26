package com.brainyi.domain;

import java.util.Date;

public class Message {
    private Integer mid;

    private Byte mType;

    private String mContent;

    private Date mTime;

    private Byte mDeleteFlag;

    private Integer sysusersysUserId;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Byte getmType() {
        return mType;
    }

    public void setmType(Byte mType) {
        this.mType = mType;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent == null ? null : mContent.trim();
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Byte getmDeleteFlag() {
        return mDeleteFlag;
    }

    public void setmDeleteFlag(Byte mDeleteFlag) {
        this.mDeleteFlag = mDeleteFlag;
    }

    public Integer getSysusersysUserId() {
        return sysusersysUserId;
    }

    public void setSysusersysUserId(Integer sysusersysUserId) {
        this.sysusersysUserId = sysusersysUserId;
    }
}