package com.macd.sth.dao;

import com.macd.sth.models.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

public class LocationDaoImpl implements LocationDao{

    @Autowired
    DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //RowMapper<Article> rowMapper = new BeanPropertyRowMapper<Article>(Article.class);

//    locationID int not null auto_increment primary key ,
//    shelfNo int,
//    modelNo int,
//    foreign key (modelNo) references tyre (modelNo)

    @Override
    public location getLocationByModelNo(String modelNo) {
        String sql = "select shelfNo from location where modelNo=?";
        RowMapper<location> rowMapper = new BeanPropertyRowMapper<location>(location.class);
        location location = jdbcTemplate.queryForObject(sql, rowMapper, modelNo);
        return location;
    }

    @Override
    public void insertLocationByModelNo(String modelNo, location location) {
        String sql = "insert into location(shelfNO, modelNo) values(?,?)";
        jdbcTemplate.update(sql, location.getShelfno(), modelNo);
    }

    @Override
    public void deleteLocationByModelNo(String modelNo) {
        String sql = "delete from location where modelNo=?";
        jdbcTemplate.update(sql, modelNo);
    }
}
