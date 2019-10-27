package com.macd.sth.models;


public class credit {

    private int id, amount, custID;
    private String  dueDate;

    public credit(int id, int amount, int custID, String dueDate) {
        this.id = id;
        this.amount = amount;
        this.custID = custID;
        this.dueDate = dueDate;
    }

    public credit(){}

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

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
