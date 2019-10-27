package com.macd.sth.dao;

import com.macd.sth.models.credit;

import java.util.List;

public interface CreditDao {
    void enterEntry(credit credit);
    void deleteEntry(int custID);
    void updateEntry(credit credit);
    List<credit> getAllEntries();
    List<credit> getCreditDetails(int custID);
    boolean entryAlreadyExists(int id);

//    only update if entry with custID exists, no need for another entry.
}
