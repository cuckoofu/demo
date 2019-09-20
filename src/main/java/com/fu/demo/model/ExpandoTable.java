package com.fu.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expandotable")
public class ExpandoTable {

    @Id
    @Column
    private long tableid;
    @Column
    private long companyid;
    @Column
    private long classnameid;
    @Column
    private String name;

    public long getTableid() {
        return tableid;
    }

    public void setTableid(long tableid) {
        this.tableid = tableid;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }

    public long getClassnameid() {
        return classnameid;
    }

    public void setClassnameid(long classnameid) {
        this.classnameid = classnameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
