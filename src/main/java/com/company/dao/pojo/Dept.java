package com.company.dao.pojo;

import java.util.List;

public class Dept {
    private int did;
    private String dname;
    private List<Student> stus;

    public Dept() {
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", stus=" + stus +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Student> getStus() {
        return stus;
    }

    public void setStus(List<Student> stus) {
        this.stus = stus;
    }

    public Dept(int did, String dname, List<Student> stus) {
        this.did = did;
        this.dname = dname;
        this.stus = stus;
    }
}
