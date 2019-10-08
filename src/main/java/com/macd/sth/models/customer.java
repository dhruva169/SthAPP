package com.macd.sth.models;

public class customer {

    private String fName;
    private String lName;
    private String panNo;
    private String aadharNo;
    private String phoneNo;
    private String email;
    private int custId;
    private String address;
    private String businessType;


    public customer(String fName, String lName, String panNo, String aadharNo, String phoneNo, String email, int custId, String address, String businessType) {
        this.fName = fName;
        this.lName = lName;
        this.panNo = panNo;
        this.aadharNo = aadharNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.custId = custId;
        this.address = address;
        this.businessType = businessType;
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

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
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

}
