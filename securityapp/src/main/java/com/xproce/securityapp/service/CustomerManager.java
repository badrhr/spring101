package com.xproce.securityapp.service;

import com.xproce.securityapp.dao.entities.Customer;
import com.xproce.securityapp.dao.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerManager implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer addCustomer(Customer customer) {
        Customer customerByEmail = customerRepository.findByEmail(customer.getEmail());
        if (customerByEmail != null)
            return null;
        return customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
        Customer customerById = customerRepository.
                findById(customer.getId()).get();
        if (customerById != null)
            return false;
        return true;
    }
}
