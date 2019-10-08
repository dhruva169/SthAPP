package com.macd.sth.models;

import java.util.Date;

public class order {

    private int orderID, overheadCharges, amount;
    private String paymentMode, deliveryAddress;
    private Date orderPlaceDate, deliveryDate;
    private Boolean status;

    public order(int orderID, int overheadCharges, int amount, String paymentMode, String deliveryAddress, Date orderPlaceDate, Date deliveryDate, Boolean status) {
        this.orderID = orderID;
        this.overheadCharges = overheadCharges;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.deliveryAddress = deliveryAddress;
        this.orderPlaceDate = orderPlaceDate;
        this.deliveryDate = deliveryDate;
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getOrderPlaceDate() {
        return orderPlaceDate;
    }

    public void setOrderPlaceDate(Date orderPlaceDate) {
        this.orderPlaceDate = orderPlaceDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
