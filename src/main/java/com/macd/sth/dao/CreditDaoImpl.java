package com.macd.sth.dao;

import com.macd.sth.models.credit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class CreditDaoImpl implements CreditDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void enterEntry(credit credit) {
        String sql = "insert into credit(custID, amount, dueDate) values(?,?,?)";
        jdbcTemplate.update(sql, credit.getCustID(), credit.getAmount(), credit.getDueDate());
    }

    @Override
    public void deleteEntry(int custID) {
        String sql = "delete from credit where custID=?";
        jdbcTemplate.update(sql, custID);
    }

    @Override
    public void updateEntry(credit credit) {
        String sql = "update credit set amount=?, dueDate=? ,custID=?  where id=? ";
        jdbcTemplate.update(sql, credit.getAmount(), credit.getDueDate(), credit.getCustID(), credit.getId());
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
    public List<credit> getCreditDetails(int custID) {
        String sql = "select custID, amount, dueDate from credit where custID=? ";
        RowMapper<credit> rowMapper = new BeanPropertyRowMapper<credit>(credit.class);
        List<credit> list = (List<credit>) jdbcTemplate.queryForObject(sql, rowMapper, custID);
//        credit credit = jdbcTemplate.queryForObject(sql, rowMapper, custID);
        return list;
    }

    @Override
    public boolean entryAlreadyExists(int id) {

        String sql = "SELECT count(*) FROM credit WHERE id=?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, id);
        if(count == 0) {
            return false;
        } else {
            return true;
        }
    }

}
