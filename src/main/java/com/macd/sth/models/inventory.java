package com.macd.sth.models;

public class inventory {

    private int quantity, id;

    public inventory(int quantity, int id) {
        this.quantity = quantity;
        this.id = id;
    }

    private inventory(){}

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
}
