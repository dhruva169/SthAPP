package com.macd.sth.dao;

import com.macd.sth.models.employee;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(employee employee);
    void deleteEmployee(int empID);
    void updateEmployee(employee employee);
    List<employee> getAllEmployees();
    employee getEmployeeDetails(int empID);
}
