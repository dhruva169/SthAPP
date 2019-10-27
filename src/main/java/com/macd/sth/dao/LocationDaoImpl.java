package com.macd.sth.dao;

import com.macd.sth.models.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;


@Repository
@Transactional
public class LocationDaoImpl implements LocationDao{

    @Autowired
    DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public location getLocationByModelNo(String modelNo) {
        String sql = "select shelfNo from location where modelNo=?";
        RowMapper<location> rowMapper = new BeanPropertyRowMapper<location>(location.class);
        location location = jdbcTemplate.queryForObject(sql, rowMapper, modelNo);
        return location;
    }

    @Override
    public List<location> getAllLocations() {
        String sql = "select * from location";
        RowMapper<location> rowMapper = new BeanPropertyRowMapper<location>(location.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void insertLocationByModelNo(location location) {
        String sql = "insert into location(shelfNO, modelNo) values(?,?)";
        jdbcTemplate.update(sql, location.getShelfno(), location.getModelNO());
    }

    @Override
    public void updateLocationByModelNo(location location) {
        String sql = "update location set shelfNo=? where ModelNo=?";
        jdbcTemplate.update(sql, location.getShelfno(), location.getModelNO());
    }

//    @Override
//    public void deleteLocationByModelNo(String modelNo) {
//        String sql = "delete from location where modelNo=?";
//        jdbcTemplate.update(sql, modelNo);
//    }
}
