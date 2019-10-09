package com.macd.sth.dao;

import com.macd.sth.models.inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.*;
import java.util.List;

public class InventoryDaoImpl implements InventoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEntry(inventory inventory, String modelNo) {
        String sql = "insert into inventory(quantity, modelNO) values(?,?)";
        jdbcTemplate.update(sql, inventory.getQuantity(), modelNo);
    }

    @Override
    public void deleteEntry(int id) {
        String sql = "delete from inventory where id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void updateEntry(inventory inventory, String modelNo) {
        String sql = "update inventory set quantity=? where modelNo=?";
        jdbcTemplate.update(sql, inventory.getQuantity(), modelNo);
    }

    @Override
    public List<inventory> getCompleteInventory() {
        String sql = "select * from inventory";
        RowMapper<inventory> rowMapper = new BeanPropertyRowMapper<inventory>(inventory.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public inventory getParticularInventory(int id) {
        String sql = "select * from inventory where id=?";
        RowMapper<inventory> rowMapper = new BeanPropertyRowMapper<inventory>(inventory.class);
        inventory inventory = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return inventory;
    }
}
