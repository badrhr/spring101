package com.xproce.securityapp;

import com.xproce.securityapp.dao.entities.Customer;
import com.xproce.securityapp.dao.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SecurityappApplication implements CommandLineRunner {
    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SecurityappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        customerRepository.saveAll(
                List.of(
                        new Customer(null, "a", "a@email.com", "jbiygufytf"),
                        new Customer(null, "b", "b@email.com", "qfsdcsda"),
                        new Customer(null, "c", "c@email.com", "xvcsdV514"),
                        new Customer(null, "d", "d@email.com", "Sd56465fwe")
                )
        );
    }
}
