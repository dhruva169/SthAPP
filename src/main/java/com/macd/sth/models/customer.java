package com.macd.sth.models;

public class customer {

    private String fName;
    private String lName;
    private String pan_no;
    private String aadharNo;
    private String phoneNo;
    private String email;
    private int custId;
    private String address;
    private String businessType;

    private String username;

    public customer(String fName, String lName, String pan_no, String aadharNo, String phoneNo, String email, int custId, String address, String businessType, String username) {
        this.fName = fName;
        this.lName = lName;
        this.pan_no = pan_no;
        this.aadharNo = aadharNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.custId = custId;
        this.address = address;
        this.businessType = businessType;
        this.username = username;
    }

    public customer(){}

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

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
