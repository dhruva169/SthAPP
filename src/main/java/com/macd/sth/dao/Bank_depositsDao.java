package com.macd.sth.dao;

import com.macd.sth.models.bank_deposits;

import java.util.Date;
import java.util.List;

public interface Bank_depositsDao {
    bank_deposits getAmountDepositedByDate(Date depositDate);
    void addEntry(int empID,bank_deposits bd);
    void deleteEntryByDate(Date depositDate);
    void updateEntry(bank_deposits bank_deposits);
    List<bank_deposits> getAllBankDeposits();
}
