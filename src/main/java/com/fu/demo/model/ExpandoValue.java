package com.fu.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expandovalue")
public class ExpandoValue {

    @Id
    @Column
    private long valueid;
    @Column
    private long companyid;
    @Column
    private long tableid;
    @Column
    private long columnid;
    @Column
    private long rowid_;
    @Column
    private long classnameid;
    @Column
    private long classpk;
    @Column
    private String data_;

    public long getValueid() {
        return valueid;
    }

    public void setValueid(long valueid) {
        this.valueid = valueid;
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

    public long getColumnid() {
        return columnid;
    }

    public void setColumnid(long columnid) {
        this.columnid = columnid;
    }

    public long getRowid_() {
        return rowid_;
    }

    public void setRowid_(long rowid_) {
        this.rowid_ = rowid_;
    }

    public long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(long classnameid) {
        this.classnameid = classnameid;
    }

    public long getClasspk() {
        return classpk;
    }

    public void setClasspk(long classpk) {
        this.classpk = classpk;
    }

    public String getData_() {
        return data_;
    }

    public void setData_(String data_) {
        this.data_ = data_;
    }
}
