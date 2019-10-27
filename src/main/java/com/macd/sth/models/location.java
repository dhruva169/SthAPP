package com.macd.sth.models;

public class location {
    private int id, shelfno;
    private String ModelNO;

    public location(int id, int shelfno, String modelNO) {
        this.id = id;
        this.shelfno = shelfno;
        ModelNO = modelNO;
    }

    public location(){}

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

    public String getModelNO() {
        return ModelNO;
    }

    public void setModelNO(String modelNO) {
        ModelNO = modelNO;
    }
}
