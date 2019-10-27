package com.macd.sth.models;

import java.util.Date;

public class bankDeposits {

    private int amountDeposited, empID;
    private String depositDate;

    public bankDeposits(int amountDeposited, int empID, String depositDate) {
        this.amountDeposited = amountDeposited;
        this.empID = empID;
        this.depositDate = depositDate;
    }

    public bankDeposits(){}

    public int getAmountDeposited() {
        return amountDeposited;
    }

    public void setAmountDeposited(int amountDeposited) {
        this.amountDeposited = amountDeposited;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(String depositDate) {
        this.depositDate = depositDate;
    }
}
