package com.macd.sth.models;

import java.util.Date;

public class credit {

    private int id, amount;
    private Date dueDate;

    public credit(int id, int amount, Date dueDate) {
        this.id = id;
        this.amount = amount;
        this.dueDate = dueDate;
    }

    private credit(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
