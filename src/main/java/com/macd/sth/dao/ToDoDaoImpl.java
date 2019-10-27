package com.macd.sth.dao;


import com.macd.sth.models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class ToDoDaoImpl implements ToDoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addTask(todo task) {
        String sql = "insert into todo(empID, dueDate, inDate, task) values(?,?,?,?)";
        jdbcTemplate.update(sql, task.getEmpID(), task.getDueDate(), task.getInDate(), task.getTask());
    }

    @Override
    public void deleteTask(int taskID) {
        String sql = "delete from todo where taskID=?";
        jdbcTemplate.update(sql, taskID);
    }

    @Override
    public void updateTask(todo task) {
        String sql = "update todo set inDate=?,dueDate=?, task=?, empID=? where taskID=?";
        jdbcTemplate.update(sql, task.getInDate(), task.getDueDate(), task.getTask(), task.getEmpID(), task.getTaskId());
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