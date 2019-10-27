package com.macd.sth.dao;

import com.macd.sth.models.inventory;

import java.util.List;

public interface InventoryDao {

    void addEntry(inventory inventory);
    void deleteEntry(String modelNo);
    void updateEntry(inventory inventory);
    List<inventory> getCompleteInventory();
    inventory getParticularInventory(String modelNo);
    inventory getStockByModelNo(String modelNo);

}
