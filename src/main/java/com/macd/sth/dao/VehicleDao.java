package com.macd.sth.dao;

import com.macd.sth.models.vehicle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleDao {

    public List<vehicle> getAllVehicles();
    public vehicle getVehicleByVehicleNo(String vehicleNo);
    void removeVehicle(String vehicleNo);
    void updateVehicle(vehicle vehicle);
    void addVehicle(vehicle vehicle);

}
