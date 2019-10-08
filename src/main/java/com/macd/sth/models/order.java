package com.macd.sth.models;

public class order {

    private int orderID, overheadCharges, amount;
    private String paymentMode, type;
    private Boolean status;

    public order(int orderID, int overheadCharges, int amount, String paymentMode, String type, Boolean status) {
        this.orderID = orderID;
        this.overheadCharges = overheadCharges;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.type = type;
        this.status = status;

    }

    public order(){}

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getOverheadCharges() {
        return overheadCharges;
    }

    public void setOverheadCharges(int overheadCharges) {
        this.overheadCharges = overheadCharges;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
