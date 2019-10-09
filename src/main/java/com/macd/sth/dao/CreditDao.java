package com.macd.sth.dao;

import com.macd.sth.models.credit;

import java.util.List;

public interface CreditDao {
    void enterEntry(int custID, credit credit);
    void deleteEntry(int custID);
    void updateEntry(int custID, credit credit);
    List<credit> getAllEntries();
    credit getCreditDetails(int custID);
}
