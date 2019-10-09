package com.macd.sth.dao;

import com.macd.sth.models.customer;

import java.util.List;

public interface CustomerDao {

    List<customer> getAllCustomers();
    void addCustomer(customer customer);
    void deleteCustomer(int custID);
    void updateCustomerDetails(customer customer);
    customer getCustomerDetails(int custID);

}
