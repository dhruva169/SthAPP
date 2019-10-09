package com.macd.sth.dao;

import com.macd.sth.models.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addOrder(order order) {
        String sql = "insert into order(overHeadCharges, , )";
    }

    @Override
    public void deleteOrder(int orderID) {

    }

//    orderID int not null primary key auto_increment,
//    overHeadCharges int,
//    amount int,
//    paymentMode varchar (25),
//    status int,
//    type varchar (25)

    @Override
    public void updateOrder(order order) {

    }

    @Override
    public List<order> getAllOrders() {
        return null;
    }

    @Override
    public order getOrderDetails(int orderID) {
        return null;
    }
}
