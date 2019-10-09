package com.macd.sth.dao;

import com.macd.sth.models.bank_deposits;
import com.macd.sth.models.credit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class CreditDaoImpl implements CreditDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void enterEntry(int custID, credit credit) {
        String sql = "insert into credit(custID, amount, dueDate) values(?,?,?)";
        jdbcTemplate.update(sql, custID, credit.getAmount(), credit.getDueDate());
    }

    @Override
    public void deleteEntry(int custID) {
        String sql = "delete from credit where custID=?";
        jdbcTemplate.update(sql, custID);
    }

    @Override
    public void updateEntry(int custID, credit credit) {
        String sql = "update credit set amount=?, dueDate=? where custID=? ";
        jdbcTemplate.update(sql, credit.getAmount(), credit.getDueDate(), custID);
    }

    @Override
    public List<credit> getAllEntries() {
        String sql = "select * from credit";
//        RowMapper<bank_deposits> rowMapper = new BeanPropertyRowMapper<bank_deposits>(bank_deposits.class);
        List<credit> list;
        list = (List<credit>) this.jdbcTemplate.query(sql, new BeanPropertyRowMapper<credit>(credit.class));
        return list;
    }

    @Override
    public credit getCreditDetails(int custID) {
        String sql = "select custID, amount, dueDate from credit where custID=? ";
        RowMapper<credit> rowMapper = new BeanPropertyRowMapper<credit>(credit.class);
        credit credit = jdbcTemplate.queryForObject(sql, rowMapper, custID);
        return credit;
    }
}
