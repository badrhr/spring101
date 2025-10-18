package com.xproce.securityapp.dao.repositories;

import com.xproce.securityapp.dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {
    public Customer findByEmail(String email);
}
