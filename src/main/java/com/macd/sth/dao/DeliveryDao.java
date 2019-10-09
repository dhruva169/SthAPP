package com.macd.sth.dao;

import com.macd.sth.models.delivery;

import java.util.Date;
import java.util.List;

public interface DeliveryDao {
    void addEntry(delivery delivery, int orderID, String vehicleNo);
    void deleteEntry(int deliveryID);
    void updateEntry(delivery delivery, int orderID, String vehicleNo);
    List<delivery> getAllDeliveryByDateOfDelivery(Date date);
    delivery getDeliveryDetails(int deliveryID);

}
