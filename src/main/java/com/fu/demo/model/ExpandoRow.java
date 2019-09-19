package com.fu.demo.model;

public class ExpandoRow {

    private long rowid_;
    private long companyid;
    private long tableid;
    private long classpk;

    public long getRowid_() {
        return rowid_;
    }

    public void setRowid_(long rowid_) {
        this.rowid_ = rowid_;
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

    public long getClasspk() {
        return classpk;
    }

    public void setClasspk(long classpk) {
        this.classpk = classpk;
    }
}
