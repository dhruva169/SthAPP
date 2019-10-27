package com.macd.sth.models;

import java.util.Date;

public class vehicle {

    private String vehicleNo;
    private String dtOfMaintenance;
    private int distanceCovered, dieselAvailable;
    private boolean isAvailable;

    public vehicle(String vehicleNo, String dtOfMaintenance, int distanceCovered, int dieselAvailable, boolean isAvailable) {
        this.vehicleNo = vehicleNo;
        this.dtOfMaintenance = dtOfMaintenance;
        this.distanceCovered = distanceCovered;
        this.dieselAvailable = dieselAvailable;
        this.isAvailable = isAvailable;
    }

    public vehicle(){}

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDtOfMaintenance() {
        return dtOfMaintenance;
    }

    public void setDtOfMaintenance(String dtOfMaintenance) {
        this.dtOfMaintenance = dtOfMaintenance;
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public void setDistanceCovered(int distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public int getDieselAvailable() {
        return dieselAvailable;
    }

    public void setDieselAvailable(int dieselAvailable) {
        this.dieselAvailable = dieselAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
