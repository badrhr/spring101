package com.xproce.securityapp.service;

import com.xproce.securityapp.dao.entities.Customer;

import java.util.List;

public interface CustomerService {

    public Customer addCustomer(Customer customer);
    public  boolean deleteCustomer(Customer customer);
    public List<Customer> findAllCustomers();
}
