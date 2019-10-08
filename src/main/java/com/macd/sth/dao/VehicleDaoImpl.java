package com.macd.sth.dao;


import com.macd.sth.models.vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class VehicleDaoImpl implements VehicleDao {


    @Autowired
    DataSource datasource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public VehicleDaoImpl() {

    }
    public VehicleDaoImpl(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

    @Transactional
    public List<vehicle> getAllVehicles() {
        return null;
    }

    @Transactional
    public vehicle getVehicleByVehicleNo(String vehicleNo) {
        String sql = "SELECT * FROM vehicle WHERE vehicleNo='\"+vehicleNo+\"' ";
        return jdbcTemplate.query(sql,new ResultSetExtractor<vehicle>() {

            public vehicle extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()) {
                    vehicle user = new vehicle();
//                    user.setUsername(rs.getString("username"));
//                    user.setPassword(rs.getString("password"));
//                    return user;
                }
                return null;
            }
        });

    }

    @Transactional
    public void removeVehicle(String vehicleNo) {
        String sql = "DELETE FROM vehicle WHERE vehicleNo=?";
        jdbcTemplate.update(sql,vehicleNo);
    }

    @Transactional
    public void updateVehicle(vehicle vehicle) {

    }

    @Transactional
    public void addVehicle(vehicle vehicle) {
        String sql = "INSERT INTO vehicle VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[] {vehicle.getVehicleNo(), vehicle.getDtOfMaintenance(),
                vehicle.getDistanceCovered(), vehicle.getDieselAvailable(), vehicle.isAvailable()});
    }
}
