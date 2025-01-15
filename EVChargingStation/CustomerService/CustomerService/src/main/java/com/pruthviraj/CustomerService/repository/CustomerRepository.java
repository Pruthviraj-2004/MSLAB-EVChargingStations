package com.pruthviraj.CustomerService.repository;

import com.pruthviraj.CustomerService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
