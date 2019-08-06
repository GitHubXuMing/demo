package com.company.dao.pojo;

public class Student {
    private int sid;
    private String sname;
    private Dept dept;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", dept=" + dept.getDname() +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Student(int sid, String sname, Dept dept) {
        this.sid = sid;
        this.sname = sname;
        this.dept = dept;
    }

    public Student() {
    }
}
