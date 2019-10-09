package com.macd.sth.dao;


import com.macd.sth.models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class ToDoDaoImpl implements ToDoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTask(int empID, todo task) {
        String sql = "insert into todo(empID, dueDate, inDate, task) values(?,?,?,?)";
        jdbcTemplate.update(sql, empID, task.getDueDate(), task.getInDate(), task.getTask());
    }

    @Override
    public void deleteTask(int taskID) {
        String sql = "delete from todo where taskID=?";
        jdbcTemplate.update(sql, taskID);
    }

    @Override
    public void updateTask(todo task, int empID) {
        String sql = "update todo set dueDate=?, task=?, empID=? where taskID=?";
        jdbcTemplate.update(sql, task.getDueDate(), task.getTask(), empID);
    }

    @Override
    public List<todo> getAllTasks() {
        String sql = "select * from todo";
        RowMapper<todo> rowMapper = new BeanPropertyRowMapper<todo>(todo.class);
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public todo getTask(int taskID) {

        String sql = "select * from todo where taskID=?";
        RowMapper<todo> rowMapper = new BeanPropertyRowMapper<todo>(todo.class);
        todo task = jdbcTemplate.queryForObject(sql, rowMapper, taskID);
        return task;
    }
}