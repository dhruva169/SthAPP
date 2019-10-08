package com.macd.sth.models;

import java.util.Date;

public class employee {

    private String fName;
    private String lName;
    private String designation;
    private Date joiningDate;
    private String phoneNo;
    private int salary;
    private String username;
    private int empID;
    private String address;

    public employee(String fName, String lName, String designation, Date joiningDate, String phoneNo, int salary, String username, int empID, String address) {
        this.fName = fName;
        this.lName = lName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.username = username;
        this.empID = empID;
        this.address = address;
    }

    public employee(){}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
