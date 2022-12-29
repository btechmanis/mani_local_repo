package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.CustomerDTO;

import com.ecommerce.service.CustomerService;

@RestController
	@RequestMapping("/customer")
	public class CustomerController {
		@Autowired
		CustomerService customerService;
		
		@PostMapping(value="/create",consumes=MediaType.APPLICATION_JSON_VALUE)
		public CustomerDTO createCustomer(@RequestBody CustomerDTO customer) {
			 return this.customerService.createCustomer(customer);		
		}
		@GetMapping("/customers")
		public List<CustomerDTO> getCustomer() {
			return this.customerService.getCustomer();
		}
		@GetMapping("/customers/{customerid}")
		public CustomerDTO getCustomerByID(@PathVariable int customerid) {
			return this.customerService.getCustomerByID(customerid);
		}
		
		@DeleteMapping("/customers/{customerid}")
		public void deleteCustomer(@PathVariable int customerid) {
			this.customerService.deleteCustomer(customerid);
			
		}
		@PutMapping(value="/customers",consumes=MediaType.APPLICATION_JSON_VALUE)
		public CustomerDTO updateCustomer(@RequestBody CustomerDTO customer) {
			return this.customerService.updateCustomer(customer);
		}

	}

