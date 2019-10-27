package com.macd.sth.dao;

import com.macd.sth.models.todo;

import java.util.List;

public interface ToDoDao {

    void addTask(todo task);
    void deleteTask(int taskID);
    void updateTask(todo task);
    List<todo> getAllTasks();
    todo getTask(int taskID);
}


