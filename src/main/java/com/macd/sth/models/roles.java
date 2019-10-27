package com.macd.sth.models;

public class roles {

    private int appRoleID;
    private String roleName;

    public roles(int appRoleID, String roleName) {
        this.appRoleID = appRoleID;
        this.roleName = roleName;
    }

    public roles(){}

    public int getAppRoleID() {
        return appRoleID;
    }

    public void setAppRoleID(int appRoleID) {
        this.appRoleID = appRoleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
