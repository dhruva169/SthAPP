package com.macd.sth.dao;

import com.macd.sth.models.tyre;

import java.util.List;

public interface TyreDao {
    void addTyre(tyre tyre, int locationID);
    void deleteTyre(String modelNo);
    void updateTyre(tyre tyre, int locationID);
    List<tyre> getAllTyre();
    tyre getTyreDetails(String modelNo);
}
