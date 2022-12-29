package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.CustomerDTO;


public interface CustomerService {

	public CustomerDTO createCustomer(CustomerDTO customer);
	public List<CustomerDTO> getCustomer();
	
	
	public CustomerDTO getCustomerByID(int customerid);
		public void deleteCustomer(int customerid);
	public CustomerDTO updateCustomer(CustomerDTO customer);

}
