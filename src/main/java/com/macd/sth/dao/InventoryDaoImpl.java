package com.macd.sth.dao;

import com.macd.sth.models.inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.List;


@Repository
@Transactional
public class InventoryDaoImpl implements InventoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEntry(inventory inventory) {
        String sql = "insert into inventory(quantity, modelNO) values(?,?)";
        jdbcTemplate.update(sql, inventory.getQuantity(), inventory.getModelNo());
    }

    @Override
    public void deleteEntry(String modelNo) {
        String sql = "delete from inventory where modelNo=?";
        jdbcTemplate.update(sql, modelNo);
    }

    @Override
    public void updateEntry(inventory inventory) {
        String sql = "update inventory set quantity=? where modelNo=?";
        jdbcTemplate.update(sql, inventory.getQuantity(), inventory.getModelNo());
    }

    @Override
    public List<inventory> getCompleteInventory() {
        String sql = "select * from inventory";
        RowMapper<inventory> rowMapper = new BeanPropertyRowMapper<inventory>(inventory.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public inventory getParticularInventory(String modelNo) {
        String sql = "select * from inventory where modelNo=?";
        RowMapper<inventory> rowMapper = new BeanPropertyRowMapper<inventory>(inventory.class);
        inventory inventory = jdbcTemplate.queryForObject(sql, rowMapper, modelNo);
        return inventory;
    }

    @Override
    public inventory getStockByModelNo(String modelNo) {

        String sql = "select * from inventory where modelNo='"+modelNo+"';";
        return this.jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(inventory.class));
    }
}
