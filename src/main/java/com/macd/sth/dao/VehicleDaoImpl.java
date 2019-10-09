package com.macd.sth.dao;


import com.macd.sth.models.vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;


public class VehicleDaoImpl implements VehicleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public List<vehicle> getAllVehicles() {
        String sql = "select * from vehicle";
        RowMapper<vehicle> rowMapper = new BeanPropertyRowMapper<vehicle>(vehicle.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public vehicle getVehicleByVehicleNo(String vehicleNo) {
        String sql = "select * from vehicle where vehicleNo=?";
        RowMapper<vehicle> rowMapper = new BeanPropertyRowMapper<vehicle>(vehicle.class);
        vehicle vehicle = jdbcTemplate.queryForObject(sql, rowMapper, vehicleNo);
        return vehicle;
    }

    @Override
    public void removeVehicle(String vehicleNo) {
        String sql = "delete from vehicle where vehicleNo=?";
        jdbcTemplate.update(sql, vehicleNo);
    }

    @Override
    public void updateVehicle(vehicle vehicle) {
        String sql = "update vehicle set dtOfMaintenance ,distanceCovered=?, dieselAvailable=?, isAvailable=? where vehicleNo=?";
        jdbcTemplate.update(sql, vehicle.getDtOfMaintenance(), vehicle.getDistanceCovered(), vehicle.getDieselAvailable(),
                vehicle.isAvailable(), vehicle.getVehicleNo());
    }

    @Override
    public void addVehicle(vehicle vehicle) {
        String sql = "insert into vehicle(vehicleNO, dtOfMaintenance, distanceCovered, dieselAvailable, isAvailable)" +
                "values(?,?,?,?,?)";
        jdbcTemplate.update(sql, vehicle.getVehicleNo(), vehicle.getDtOfMaintenance(), vehicle.getDistanceCovered(),
                vehicle.getDieselAvailable(), vehicle.isAvailable());
    }
}
