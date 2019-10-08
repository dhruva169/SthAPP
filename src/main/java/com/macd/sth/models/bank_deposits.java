package com.macd.sth.models;

import java.util.Date;

public class bank_deposits {

    private int depostID, amountDeposited;
    private Date depositDate;

    public bank_deposits(int depostID, int amountDeposited, Date depositDate) {
        this.depostID = depostID;
        this.amountDeposited = amountDeposited;
        this.depositDate = depositDate;
    }

    public bank_deposits(){}

    public int getDepostID() {
        return depostID;
    }

    public void setDepostID(int depostID) {
        this.depostID = depostID;
    }

    public int getAmountDeposited() {
        return amountDeposited;
    }

    public void setAmountDeposited(int amountDeposited) {
        this.amountDeposited = amountDeposited;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }
}
