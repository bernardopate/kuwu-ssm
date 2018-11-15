package com.kawu.studio.entity;

public class Student {
    private long stnum;
    private String name;
    private String classname;

    public Student(){
    }

    public Student(long stnum, String name, String classname){
        this.stnum=stnum;
        this.name=name;
        this.classname=classname;
    }

    public long getStnum(){
        return stnum;
    }

    public void setStnum(long stnum){
        this.stnum=stnum;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getClassname(){
        return classname;
    }

    public void setClassname(String classname){
        this.classname=classname;
    }

    public String toString(){
        return "Student [stnum=" + stnum + ", name=" + name + ", classname=" + classname + "]";
    }

}
