package com.macd.sth.models;

import java.util.Date;

public class employee {

    private String fName;
    private String lName;
    private String designation;
    private String joiningDate;
    private String phoneNo;
    private int salary;
    private String username;
    private int empID;
    private String address;
    private String password;
    private String passwordConfirm;
    private boolean enabled;


    public employee(String fName, String lName, String designation, String joiningDate, String phoneNo, int salary, String username, int empID, String address, String password, String passwordConfirm, boolean enabled) {
        this.fName = fName;
        this.lName = lName;
        this.designation = designation;
        this.joiningDate = joiningDate;
        this.phoneNo = phoneNo;
        this.salary = salary;
        this.username = username;
        this.empID = empID;
        this.address = address;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.enabled = enabled;
    }

    public employee() {
    }

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

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return this.username + "/" + this.password;
    }
}
