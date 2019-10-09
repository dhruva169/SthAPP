package com.macd.sth.dao;

import com.macd.sth.models.inventory;

import java.util.List;

public interface InventoryDao {

    void addEntry(inventory inventory, String modelNo);
    void deleteEntry(int id);
    void updateEntry(inventory inventory, String modelNo);
    List<inventory> getCompleteInventory();
    inventory getParticularInventory(int id);

}
