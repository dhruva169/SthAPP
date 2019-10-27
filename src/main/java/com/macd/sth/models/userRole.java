package com.macd.sth.models;

public class userRole {

    public int ID, empID, appRoleID;


    public userRole(int ID, int empID, int appRoleID) {
        this.ID = ID;
        this.empID = empID;
        this.appRoleID = appRoleID;
    }

    public userRole(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getAppRoleID() {
        return appRoleID;
    }

    public void setAppRoleID(int appRoleID) {
        this.appRoleID = appRoleID;
    }
}
