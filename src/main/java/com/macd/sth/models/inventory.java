package com.macd.sth.models;

public class inventory {


    private int quantity, id;
    private String modelNo;

    public inventory(int quantity, int id, String modelNo) {
        this.quantity = quantity;
        this.id = id;
        this.modelNo = modelNo;
    }

    public inventory(){}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
}
