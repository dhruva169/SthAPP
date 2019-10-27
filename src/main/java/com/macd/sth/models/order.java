package com.macd.sth.models;

public class order {

    private int orderID, overheadCharges, amount, custID, quantity;
    private String paymentMode, modelNo;
    private String status;

    public order(int orderID, int overheadCharges, int amount, int custID, String paymentMode, String modelNo, String status, int quantity) {
        this.orderID = orderID;
        this.overheadCharges = overheadCharges;
        this.amount = amount;
        this.custID = custID;
        this.paymentMode = paymentMode;
        this.modelNo = modelNo;
        this.status = status;
        this.quantity = quantity;
    }

    public order(){}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
