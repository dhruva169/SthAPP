package com.macd.sth.dao;

import com.macd.sth.models.bankDeposits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class BankDepositsDaoImpl implements BankDepositsDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public bankDeposits getAmountDepositedByDate(String depositDate) {
        String sql = "select depositDate, amountDeposited, empID from bank_deposits where depositDate=?";
        RowMapper<bankDeposits> rowMapper = new BeanPropertyRowMapper<bankDeposits>(bankDeposits.class);
        bankDeposits bd = jdbcTemplate.queryForObject(sql, rowMapper, depositDate);
        return bd;
    }

    @Override
    public void addEntry(bankDeposits bd) {
        String sql = "insert into bank_deposits(empID, depositDate, amountDeposited) values (?,?,?)";
        jdbcTemplate.update(sql, bd.getEmpID(), bd.getDepositDate(), bd.getAmountDeposited());
    }

//    @Override
//    public void deleteEntryByDate(String depositDate) {
//        String sql = "delete from bank_deposits where depositDate=?";
//        jdbcTemplate.update(sql, depositDate);
//    }

    @Override
    public void updateEntry(bankDeposits bd) {
//        String sql1 = "delete from bank_deposits where depositDate=?";
//        jdbcTemplate.update(sql1, bd.getDepositDate());
//
//        String sql = "insert into bank_deposits(empID, depositDate, amountDeposited) values (?,?,?)";
//        jdbcTemplate.update(sql, bd.getEmpID(), bd.getDepositDate(), bd.getAmountDeposited());

        String sql = "update bank_deposits set amountDeposited=? where depositDate=?";
        jdbcTemplate.update(sql, bd.getAmountDeposited(), bd.getDepositDate());
    }

    @Override
    public List<bankDeposits> getAllBankDeposits() {
        String sql = "select * from bank_deposits";
        RowMapper<bankDeposits> rowMapper = new BeanPropertyRowMapper<bankDeposits>(bankDeposits.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public boolean entryAlreadyExists(String depositDate) {

        String sql = "SELECT count(*) FROM bank_deposits WHERE depositDate=?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, depositDate);
        if(count == 0) {
            return false;
        } else {
            return true;
        }
    }
}
