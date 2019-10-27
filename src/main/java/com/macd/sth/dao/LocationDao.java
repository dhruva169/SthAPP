package com.macd.sth.dao;

import com.macd.sth.models.location;

import java.util.List;

public interface LocationDao {
    location getLocationByModelNo(String modelNo);
    List<location> getAllLocations();
    void insertLocationByModelNo(location location);
    void updateLocationByModelNo(location location);
}
