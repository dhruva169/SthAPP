package com.macd.sth.dao;

import com.macd.sth.models.todo;

public interface ToDoDao {

    void addTask(int empID, todo task);
    void deleteTask(int taskID);
    todo getTask(int taskID);
}


