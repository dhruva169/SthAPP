package com.macd.sth.models;

public class location {
    private int id, shelfno;

    public location(int id, int shelfno) {
        this.id = id;
        this.shelfno = shelfno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShelfno() {
        return shelfno;
    }

    public void setShelfno(int shelfno) {
        this.shelfno = shelfno;
    }

}
