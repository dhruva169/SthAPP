package com.macd.sth.dao;

import com.macd.sth.models.order;

import java.util.List;

public interface OrderDao {

//    void addOrder(order order);
////    void deleteOrder(int orderID);
//    void updateOrder(order order);
//    List<order> getAllOrders();
//    order getOrderDetails(int orderID);


    void orderTyre(int overHeadCharges, String paymentMode, String Status, int custID, String modelNo, int quantity);
    order getDetails(String modelNo);



//    orderID         | int(11)     | NO   | PRI | NULL    | auto_increment |
//            | overHeadCharges | int(11)     | YES  |     | NULL    |                |
//            | amount          | int(11)     | YES  |     | NULL    |                |
//            | paymentMode     | varchar(25) | YES  |     | NULL    |                |
//            | status          | varchar(25) | YES  |     | NULL    |                |
//            | custID          | int(11)     | YES  | MUL | NULL    |                |
//            | modelNo         | varchar(25) | YES  | MUL | NULL    |


}
