package com.macd.sth.models;


public class todo {

    private int taskId,empID;
    private String dueDate;
    private String inDate;
    private String task;

    public todo(int taskId, int empID, String dueDate, String inDate, String task) {
        this.taskId = taskId;
        this.empID = empID;
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

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
