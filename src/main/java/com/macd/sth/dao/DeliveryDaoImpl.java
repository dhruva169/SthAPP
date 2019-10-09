package com.macd.sth.dao;

import com.macd.sth.models.delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Date;
import java.util.List;

//private int deliveryID;
//private String deliveryAddress, vehicleNO;
//private Date dateOfDelivery, dateOfOrderPlaced;
//orderID, vehicleNo foreign key.

public class DeliveryDaoImpl implements DeliveryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEntry(delivery delivery, int orderID, String vehicleNo) {
        String sql = "insert into delivery(deliveryAddress, vehicleNo, dateOfDelivery, dateOfOrderPlaced, orderID, vehicleNo)" +
                "values(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, delivery.getDeliveryAddress(), delivery.getVehicleNO(), delivery.getDateOfDelivery(), delivery.getDateOfOrderPlaced(),
                orderID, vehicleNo);
    }

    @Override
    public void deleteEntry(int deliveryID) {
        String sql = "delete from delivery where deliveryID=?";
        jdbcTemplate.update(sql, deliveryID);
    }

    @Override
    public void updateEntry(delivery delivery, int orderID, String vehicleNo) {
        String sql = "update delivery set deliveryAddress=?, dateOfDelivery=?, orderID=?, vehicleNo=?";
        jdbcTemplate.update(sql, delivery.getDeliveryAddress(), delivery.getDateOfDelivery(), orderID, vehicleNo);
    }

    @Override
    public List<delivery> getAllDeliveryByDateOfDelivery(Date date) {
        String sql = "select * from delivery";
        RowMapper<delivery> rowMapper = new BeanPropertyRowMapper<delivery>(delivery.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public delivery getDeliveryDetails(int deliveryID) {
        String sql = "select * from delivery where deliveryID=?";
        RowMapper<delivery> rowMapper = new BeanPropertyRowMapper<delivery>(delivery.class);
        delivery delivery = jdbcTemplate.queryForObject(sql, rowMapper, deliveryID);
        return delivery;
    }
}
