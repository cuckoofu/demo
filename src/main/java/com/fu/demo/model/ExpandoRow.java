package com.fu.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "expandorow")
public class ExpandoRow implements Serializable {

    @Id
    @Column
    private long rowid_;
    @Column
    private long companyid;
    @Column
    private long tableid;
    @Column
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
