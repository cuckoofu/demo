package com.fu.demo.model;

public class ExpandoColumn {

    private long columnid;
    private long companyid;
    private long tableid;
    private String name;
    private long type_;
    private String defaultdata;
    private String typesettings;

    public long getColumnid() {
        return columnid;
    }

    public void setColumnid(long columnid) {
        this.columnid = columnid;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }

    public long getTableid() {
        return tableid;
    }

    public void setTableid(long tableid) {
        this.tableid = tableid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getType_() {
        return type_;
    }

    public void setType_(long type_) {
        this.type_ = type_;
    }

    public String getDefaultdata() {
        return defaultdata;
    }

    public void setDefaultdata(String defaultdata) {
        this.defaultdata = defaultdata;
    }

    public String getTypesettings() {
        return typesettings;
    }

    public void setTypesettings(String typesettings) {
        this.typesettings = typesettings;
    }
}
