package com.ecommerce.service;


import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.dto.CustomerDTO;
import com.ecommerce.model.Customer;

import com.ecommerce.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired CustomerRepository customerrepository;

	

	@Override
	public List<CustomerDTO> getCustomer() {
		Iterable<Customer> customer=customerrepository.findAll();
		List<CustomerDTO> customer2=new ArrayList<>();
		customer.forEach(t -> {
			CustomerDTO cat=new CustomerDTO();
			cat.setCustomerName(t.getCustomerName());
			cat.setCustomerId(t.getCustomerId());
			cat.setCustomerAddress(t.getCustomerAddress());
			cat.setCustomerEmailId(t.getCustomerEmailId());
			cat.setCustomerPassword(t.getCustomerPassword());
			cat.setCustomerBillingAddress(t.getCustomerBillingAddress());
			cat.setCustomerDate(t.getCustomerDate());
			customer2.add(cat);
		});
		return customer2;
	}

	@Override
	public CustomerDTO getCustomerByID(int customerId) {
		Customer customer = customerrepository.findById(customerId).get();
		CustomerDTO customerDto = new CustomerDTO();
		customerDto.setCustomerId(customer.getCustomerId());
		customerDto.setCustomerName(customer.getCustomerName());
		customerDto.setCustomerAddress(customer.getCustomerAddress());
		customerDto.setCustomerEmailId(customer.getCustomerEmailId());
		customerDto.setCustomerPassword(customer.getCustomerPassword());
		customerDto.setCustomerBillingAddress(customer.getCustomerBillingAddress());
		customerDto.setCustomerDate(customer.getCustomerDate());
		return customerDto;
			}

	@Override
	public void deleteCustomer(int customerid) {
		customerrepository.deleteById(customerid);
		
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDto) {
		Customer customer1=new Customer();

		customer1.setCustomerId(customerDto.getCustomerId());
		customer1.setCustomerName(customerDto.getCustomerName());
		customer1.setCustomerAddress(customerDto.getCustomerAddress());
		customer1.setCustomerEmailId(customerDto.getCustomerEmailId());
		customer1.setCustomerPassword(customerDto.getCustomerPassword());
		customer1.setCustomerBillingAddress(customerDto.getCustomerBillingAddress());
		if(customerDto.getCustomerDate()==null)
			customerDto.setCustomerDate(LocalDate.now());
		customer1.setCustomerDate(customerDto.getCustomerDate());
		customer1 = customerrepository.save(customer1);
		customerDto.setCustomerId(customer1.getCustomerId());
		 return customerDto;
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDto) {
		Customer customer1=new Customer();
		
		
		customer1.setCustomerName(customerDto.getCustomerName());
		customer1.setCustomerAddress(customerDto.getCustomerAddress());
		customer1.setCustomerEmailId(customerDto.getCustomerEmailId());
		customer1.setCustomerPassword(customerDto.getCustomerPassword());
		customer1.setCustomerBillingAddress(customerDto.getCustomerBillingAddress());
		if(customerDto.getCustomerDate()==null)
			customerDto.setCustomerDate(LocalDate.now());
		customer1.setCustomerDate(customerDto.getCustomerDate());
		customer1 = customerrepository.save(customer1);
		customerDto.setCustomerId(customer1.getCustomerId());
		 return customerDto;	}
	
}