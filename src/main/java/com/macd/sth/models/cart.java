package com.macd.sth.models;

public class cart {

    private int id, quantity, amount, orderID;
    private String modelNo;

    public cart(int id, int quantity, int amount, int orderID, String modelNo) {
        this.id = id;
        this.quantity = quantity;
        this.amount = amount;
        this.orderID = orderID;
        this.modelNo = modelNo;
    }

    private cart(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
}
