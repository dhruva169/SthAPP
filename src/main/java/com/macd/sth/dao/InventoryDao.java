package com.macd.sth.dao;

import com.macd.sth.models.inventory;

import java.util.List;

public interface InventoryDao {

    void addEntry(inventory inventory);
    void deleteEntry(int id);
    void updateEntry(inventory inventory);
    List<inventory> getCompleteInventory();
    inventory getParticularInventory(int id);

}
