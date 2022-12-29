package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.dto.CustomerDTO;
import com.ecommerce.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	void save(CustomerDTO customer);

}
