package com.brainyi.domain;

import java.util.List;

public class Client {
    private Integer cid;

    private String cname;

    private String contactsName;

    private String phone;

    private String position;

    private String industry;

    private String wechatName;

    private String email;

    private String cNotes;

    private Byte cSource;

    private String tel;

    private String website;

    private String province;

    private String city;

    private String area;

    private String address;

    List<SysUser> sysUsers;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getcNotes() {
        return cNotes;
    }

    public void setcNotes(String cNotes) {
        this.cNotes = cNotes == null ? null : cNotes.trim();
    }

    public Byte getcSource() {
        return cSource;
    }

    public void setcSource(Byte cSource) {
        this.cSource = cSource;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public List<SysUser> getSysUsers() {
        return sysUsers;
    }

    public void setSysUsers(List<SysUser> sysUsers) {
        this.sysUsers = sysUsers;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", contactsName='" + contactsName + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", industry='" + industry + '\'' +
                ", wechatName='" + wechatName + '\'' +
                ", email='" + email + '\'' +
                ", cNotes='" + cNotes + '\'' +
                ", cSource=" + cSource +
                ", tel='" + tel + '\'' +
                ", website='" + website + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", sysUsers=" + sysUsers +
                '}';
    }
}