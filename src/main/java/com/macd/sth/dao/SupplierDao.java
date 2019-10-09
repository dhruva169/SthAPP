package com.macd.sth.dao;

import com.macd.sth.models.supplier;

import java.util.List;

public interface SupplierDao {
    void addSupplier(supplier supplier);
    void deleteSupplier(int suppID);
    void updateSupplier(supplier supplier);
    List<supplier> getAllSupplier();
    supplier getSupplierDetails(int suppID);
}
