package com.macd.sth.models;

public class supplier {

    private String fName;
    private String lname;
    private int suppId;
    private String address;
    private String email;
    private String phoneNo;

    public supplier(String fName, String lname, int suppId, String address, String email, String phoneNo) {
        this.fName = fName;
        this.lname = lname;
        this.suppId = suppId;
        this.address = address;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public supplier(){}

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSuppId() {
        return suppId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}