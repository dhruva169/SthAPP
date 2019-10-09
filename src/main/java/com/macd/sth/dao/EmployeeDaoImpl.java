package com.macd.sth.dao;

import com.macd.sth.models.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addEmployee(employee employee) {
        String sql = "insert into employee(fName, lName, designation, joiningDate, phoneNo, salary, address, username)" +
                "values(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, employee.getfName(), employee.getlName(), employee.getDesignation(), employee.getJoiningDate(),
                employee.getPhoneNo(), employee.getSalary(), employee.getAddress(), employee.getUsername());
    }

    @Override
    public void deleteEmployee(int empID) {
        String sql = "delete from employee where employeeID=?";
        jdbcTemplate.update(sql, empID);
    }

    @Override
    public void updateEmployee(employee employee) {
        String sql = "update employee set fName=?, lName=?, designation=?, joiningDate=?, phoneNo=?, salary=?, address=?, username=? " +
                "where empID=?";
        jdbcTemplate.update(sql, employee.getfName(), employee.getlName(), employee.getDesignation(), employee.getJoiningDate(),
                employee.getPhoneNo(), employee.getSalary(), employee.getAddress(), employee.getUsername(), employee.getEmpID());
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
}
