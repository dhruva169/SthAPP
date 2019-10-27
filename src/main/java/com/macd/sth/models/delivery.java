package com.macd.sth.models;

import java.util.Date;

public class delivery {
    private int deliveryID, orderID;
    private String deliveryAddress, vehicleNO;
    private String dateOfDelivery, dateOfOrderPlaced;

    public delivery(int deliveryID, int orderID, String deliveryAddress, String vehicleNO, String dateOfDelivery, String dateOfOrderPlaced) {
        this.deliveryID = deliveryID;
        this.orderID = orderID;
        this.deliveryAddress = deliveryAddress;
        this.vehicleNO = vehicleNO;
        this.dateOfDelivery = dateOfDelivery;
        this.dateOfOrderPlaced = dateOfOrderPlaced;
    }

    public delivery(){}

    public int getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getVehicleNO() {
        return vehicleNO;
    }

    public void setVehicleNO(String vehicleNO) {
        this.vehicleNO = vehicleNO;
    }

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public String getDateOfOrderPlaced() {
        return dateOfOrderPlaced;
    }

    public void setDateOfOrderPlaced(String dateOfOrderPlaced) {
        this.dateOfOrderPlaced = dateOfOrderPlaced;
    }

}
