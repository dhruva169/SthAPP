package com.macd.sth.dao;

import com.macd.sth.models.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<customer> getAllCustomers() {
        String sql = "select * from customer";
        RowMapper<customer> rowMapper = new BeanPropertyRowMapper<customer>(customer.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void addCustomer(customer customer) {
        String sql = "insert into customer(fName, lName, panNo, aadharNo, phoneNo, email, address, businessType) values(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, customer.getfName(), customer.getlName(), customer.getPanNo(), customer.getAadharNo(), customer.getPhoneNo(),
            customer.getEmail(), customer.getAddress(), customer.getBusinessType());
    }

    @Override
    public void deleteCustomer(int custID) {
        String sql = "delete from customer where custID=?";
        jdbcTemplate.update(sql, custID);
    }

    @Override
    public void updateCustomerDetails(customer customer) {
        String sql = "update customer set fName=?, lName=?, panNo=?, aadharNo=?, phoneNo=?, email=?, address=?, businessType=? where custID=?";
        jdbcTemplate.update(sql, customer.getfName(), customer.getlName(), customer.getPanNo(), customer.getAadharNo(), customer.getPhoneNo(),
                customer.getEmail(), customer.getAddress(), customer.getBusinessType(), customer.getCustId());
    }

    @Override
    public customer getCustomerDetails(int custID) {
        String sql = "select * from customer where custID=?";
        RowMapper<customer> rowMapper = new BeanPropertyRowMapper<customer>(customer.class);
        customer customer = jdbcTemplate.queryForObject(sql, rowMapper, custID);
        return customer;
    }
}
