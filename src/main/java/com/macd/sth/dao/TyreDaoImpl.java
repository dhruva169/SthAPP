package com.macd.sth.dao;

import com.macd.sth.models.tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class TyreDaoImpl implements TyreDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTyre(tyre tyre, int locationID) {
        String sql = "insert into tyre(modelNo, vehicleType, design, isTubeless, price, percentDiscount, locationID)" +
                "values(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, tyre.getModelNo(), tyre.getVehicleType(), tyre.getDesign(), tyre.isTubeless(),
                tyre.getPrice(), tyre.getPercentDiscount(), locationID);
    }

    @Override
    public void deleteTyre(String modelNo) {
        String sql = "delete from tyre where modelNo=?";
        jdbcTemplate.update(sql, modelNo);
    }

    @Override
    public void updateTyre(tyre tyre, int locationID) {
        String sql = "update tyre set price=?, percentDiscount=?, locationID=? where modelNo=?";
        jdbcTemplate.update(sql, tyre.getPrice(), tyre.getPercentDiscount(), locationID);
    }

    @Override
    public List<tyre> getAllTyre() {
        String sql = "select * from tyre";
        RowMapper<tyre> rowMapper = new BeanPropertyRowMapper<tyre>(tyre.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public tyre getTyreDetails(String modelNo) {
        String sql = "select * from tyre where modelNo=?";
        RowMapper<tyre> rowMapper = new BeanPropertyRowMapper<tyre>(tyre.class);
        tyre tyre = jdbcTemplate.queryForObject(sql, rowMapper, modelNo);
        return tyre;
    }
}
