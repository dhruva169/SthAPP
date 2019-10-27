package com.macd.sth.dao;

import com.macd.sth.models.delivery;

import java.util.Date;
import java.util.List;

public interface DeliveryDao {
    void addEntry(delivery delivery);
    void deleteEntry(int deliveryID);
    void updateEntry(delivery delivery);
    List<delivery> getAllDeliveryByDateOfDelivery(String date);
    List<delivery> getAllDelivery();
    delivery getDeliveryDetails(int deliveryID);

//    date of delivery > date of order placed;
}
