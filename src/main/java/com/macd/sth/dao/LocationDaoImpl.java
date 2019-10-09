package com.macd.sth.dao;

import com.macd.sth.models.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class LocationDaoImpl implements LocationDao{

    @Autowired
    DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //RowMapper<Article> rowMapper = new BeanPropertyRowMapper<Article>(Article.class);


    @Override
    public int getLocationByModelNo(int modelNo) {

        String sql = "select shelfNo from location where modelNo=\"+modelNo+\"";



        return 0;
    }

    @Override
    public void insertLocationByModelNo(int modelNo, location location) {

    }

    @Override
    public void deleteLocationByModelNo(int modelNo) {

    }
}
