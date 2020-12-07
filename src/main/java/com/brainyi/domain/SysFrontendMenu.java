package com.brainyi.domain;

public class SysFrontendMenu {
    private Integer id;

    private String title;

    private String href;

    private String icon;

    private String description;

    private Integer type;

    private String pid;

    private String opentype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOpentype() {
        return opentype;
    }

    public void setOpentype(String opentype) {
        this.opentype = opentype;
    }

    @Override
    public String toString() {
        return "SysFrontendMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", icon='" + icon + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", pid='" + pid + '\'' +
                ", opentype='" + opentype + '\'' +
                '}';
    }
}