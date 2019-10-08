package com.macd.sth.dao;


import com.macd.sth.models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ToDoDaoImpl implements ToDoDao {

    @Autowired
    DataSource datasource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addTask(int empID, todo task) {
        String sql = "insert into todo(empID, dueDate, inDate, task) values(?,?,?,?)";
        Object[] objects = {empID, task.getDueDate(), task.getInDate(), task.getTask()};
        jdbcTemplate.update(sql,objects);

    }

    @Override
    public void deleteTask(int taskID) {

    }

    @Override
    public todo getTask(int taskID) {
        return null;
    }
}