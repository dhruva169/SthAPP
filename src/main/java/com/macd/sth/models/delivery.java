package com.macd.sth.models;

import java.util.Date;

public class delivery {
    private int deliveryID;
    private String deliveryAddress, vehicleNO;
    private Date dateOfDelivery, dateOfOrderPlaced;

    public delivery(int deliveryID, String deliveryAddress, String vehicleNO, Date dateOfDelivery, Date dateOfOrderPlaced) {
        this.deliveryID = deliveryID;
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

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public Date getDateOfOrderPlaced() {
        return dateOfOrderPlaced;
    }

    public void setDateOfOrderPlaced(Date dateOfOrderPlaced) {
        this.dateOfOrderPlaced = dateOfOrderPlaced;
    }
}
