package com.macd.sth.dao;

import com.macd.sth.models.order;

import java.util.List;

public interface OrderDao {

    void addOrder(order order);
    void deleteOrder(int orderID);
    void updateOrder(order order);
    List<order> getAllOrders();
    order getOrderDetails(int orderID);


}
