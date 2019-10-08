package com.macd.sth.models;

public class location {
    private int id, shelfno, level;

    public location(int id, int shelfno, int level) {
        this.id = id;
        this.shelfno = shelfno;
        this.level = level;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
