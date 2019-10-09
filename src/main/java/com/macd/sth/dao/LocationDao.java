package com.macd.sth.dao;

import com.macd.sth.models.location;

public interface LocationDao {
    int getLocationByModelNo(int modelNo);
    void insertLocationByModelNo(int modelNo, location location);
    void deleteLocationByModelNo(int modelNo);
}
