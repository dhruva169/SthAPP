package com.macd.sth.dao;

import com.macd.sth.models.bank_deposits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Date;
import java.util.List;

public class Bank_depositsDaoImpl implements Bank_depositsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public bank_deposits getAmountDepositedByDate(Date depositDate) {
        String sql = "select depositDate, amountDeposited from bank_deposits where depositDate=?";
        RowMapper<bank_deposits> rowMapper = new BeanPropertyRowMapper<bank_deposits>(bank_deposits.class);
        bank_deposits bd = jdbcTemplate.queryForObject(sql, rowMapper, depositDate);
        return bd;
    }

    @Override
    public void addEntry(int empID, bank_deposits bd) {
        String sql = "insert into bank_deposits(empID, depositDate, amountDeposited) values (?,?,?)";
        jdbcTemplate.update(sql, empID, bd.getDepositDate(), bd.getAmountDeposited());
    }

    @Override
    public void deleteEntryByDate(Date depositDate) {
        String sql = "delete from bank_deposits where depositDate=?";
        jdbcTemplate.update(sql, depositDate);
    }

    @Override
    public void updateEntry(bank_deposits bank_deposits) {
        String sql = "update bank_deposits set amountDeposited=? where depositDate=?";
        jdbcTemplate.update(sql, bank_deposits.getAmountDeposited(), bank_deposits.getDepositDate());
    }

    @Override
    public List<bank_deposits> getAllBankDeposits() {
        String sql = "select * from bank_deposits";
        RowMapper<bank_deposits> rowMapper = new BeanPropertyRowMapper<bank_deposits>(bank_deposits.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }
}
