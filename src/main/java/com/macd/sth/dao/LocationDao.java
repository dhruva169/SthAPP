package com.macd.sth.dao;

import com.macd.sth.models.location;

public interface LocationDao {
    location getLocationByModelNo(String modelNo);
    void insertLocationByModelNo(String modelNo, location location);
    void deleteLocationByModelNo(String modelNo);
}
