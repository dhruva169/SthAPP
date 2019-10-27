package com.macd.sth.dao;

import com.macd.sth.models.bankDeposits;

import java.util.List;

public interface BankDepositsDao {
    bankDeposits getAmountDepositedByDate(String depositDate);
    void addEntry(bankDeposits bd);
//    void deleteEntryByDate(String depositDate);
    void updateEntry(bankDeposits bank_deposits);
    List<bankDeposits> getAllBankDeposits();
    boolean entryAlreadyExists(String depositDate);
}
