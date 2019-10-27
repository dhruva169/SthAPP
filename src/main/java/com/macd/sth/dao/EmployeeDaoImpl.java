package com.macd.sth.dao;

import com.macd.sth.models.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addEmployee(employee employee) {
        String sql = "insert into employee(fName, lName, designation, joiningDate, phoneNo, salary, address, username, password, enabled)" +
                "values(?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, employee.getfName(), employee.getlName(), employee.getDesignation(), employee.getJoiningDate(),
                employee.getPhoneNo(), employee.getSalary(), employee.getAddress(), employee.getUsername(),
                bCryptPasswordEncoder.encode(employee.getPassword()), employee.isEnabled());
    }

//    @Override
//    public void deleteEmployee(int empID) {
//        String sql = "delete from employee where employeeID=?";
//        jdbcTemplate.update(sql, empID);
//    }

    @Override
    public void updateEmployee(employee employee) {
        String sql = "update employee set fName=?, lName=?, designation=?, joiningDate=?, phoneNo=?, salary=?, address=?, username=?," +
                "password = ?, enabled=? " +
                "where empID=?";
        jdbcTemplate.update(sql, employee.getfName(), employee.getlName(), employee.getDesignation(), employee.getJoiningDate(),
                employee.getPhoneNo(), employee.getSalary(), employee.getAddress(), employee.getUsername(),
                bCryptPasswordEncoder.encode(employee.getPassword()),
                employee.isEnabled(),employee.getEmpID());
    }

    @Override
    public List<employee> getAllEmployees() {
        String sql = "select * from employee";
        RowMapper<employee> rowMapper = new BeanPropertyRowMapper<employee>(employee.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public employee getEmployeeDetails(int empID) {
        String sql = "select * from employee where empID=?";
        RowMapper<employee> rowMapper = new BeanPropertyRowMapper<employee>(employee.class);
        employee employee = jdbcTemplate.queryForObject(sql, rowMapper, empID);
        return employee;
    }

    @Override
    public employee findByUsername(String userName) {
        String sql = "select * from employee where username=?";
        RowMapper<employee> rowMapper = new BeanPropertyRowMapper<>(employee.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, userName);
    }

    @Override
    public boolean employeeExists(int empID) {
        String query = "select count(*) from employee where empID=?";
        int cnt = jdbcTemplate.queryForObject(query, Integer.class, empID);
        if (cnt == 0) return false;
        else return true;
    }




}


