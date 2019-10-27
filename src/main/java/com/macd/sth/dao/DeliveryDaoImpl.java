package com.macd.sth.dao;

import com.macd.sth.models.delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class DeliveryDaoImpl implements DeliveryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEntry(delivery delivery) {
        String sql = "insert into delivery(deliveryAddress, dateOfDelivery, dateOfOrderPlaced, orderID, vehicleNo)" +
                "values(?,?,?,?,?)";
        jdbcTemplate.update(sql, delivery.getDeliveryAddress(), delivery.getDateOfDelivery(), delivery.getDateOfOrderPlaced(),
                delivery.getOrderID(), delivery.getVehicleNO());

    }

    @Override
    public void deleteEntry(int deliveryID) {
        String sql = "delete from delivery where deliveryID=?";
        jdbcTemplate.update(sql, deliveryID);
    }

    @Override
    public void updateEntry(delivery delivery) {
        String sql = "update delivery set deliveryAddress=?, dateOfDelivery=?, dateOfOrderPlaced=?, orderID=?, vehicleNo=? where deliveryID=?";
        jdbcTemplate.update(sql, delivery.getDeliveryAddress(), delivery.getDateOfDelivery(), delivery.getDateOfOrderPlaced(),delivery.getOrderID(),
                delivery.getVehicleNO(), delivery.getDeliveryID());
    }

    @Override
    public List<delivery> getAllDeliveryByDateOfDelivery(String date) {
        String sql = "select * from delivery where dateOfDelivery=?";
        RowMapper<delivery> rowMapper = new BeanPropertyRowMapper<delivery>(delivery.class);
        return this.jdbcTemplate.query(sql, rowMapper, date);
    }

    @Override
    public List<delivery> getAllDelivery() {
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
