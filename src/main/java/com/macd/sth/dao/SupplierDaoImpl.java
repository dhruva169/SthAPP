package com.macd.sth.dao;

import com.macd.sth.models.supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class SupplierDaoImpl implements SupplierDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addSupplier(supplier supplier) {
        String sql = "insert into supplier(fName, lName, phoneNo, email, address) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, supplier.getfName(), supplier.getLname(), supplier.getPhoneNo(), supplier.getEmail(),
                supplier.getAddress());
    }

    @Override
    public void deleteSupplier(int suppID) {
        String sql = "delete from supplier where suppID=?";
        jdbcTemplate.update(sql, suppID);
    }

    @Override
    public void updateSupplier(supplier supplier) {
        String sql = "update supplier set fName=?, lName=?, phoneNo=?, email=?, address=? where suppID=?";
        jdbcTemplate.update(sql, supplier.getfName(), supplier.getLname(),supplier.getPhoneNo(), supplier.getEmail(),
                supplier.getAddress() ,supplier.getSuppId());
    }

    @Override
    public List<supplier> getAllSupplier() {
        String sql = "select * from supplier";
        RowMapper<supplier> rowMapper = new BeanPropertyRowMapper<supplier>(supplier.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public supplier getSupplierDetails(int suppID) {
        String sql = "select * from supplier";
        RowMapper<supplier> rowMapper = new BeanPropertyRowMapper<supplier>(supplier.class);
        supplier supplier = jdbcTemplate.queryForObject(sql, rowMapper, suppID);
        return supplier;
    }
}
