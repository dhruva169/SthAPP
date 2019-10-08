package com.macd.sth.models;

import java.util.Date;

public class todo {

    private int taskId;
    private Date dueDate;
    private Date inDate;
    private String task;

    public todo(int taskId, Date dueDate, Date inDate, String task) {
        this.taskId = taskId;
        this.dueDate = dueDate;
        this.inDate = inDate;
        this.task = task;
    }

    public todo(){}

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
