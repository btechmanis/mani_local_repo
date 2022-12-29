package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.OrdersDTO;
import com.ecommerce.service.OrdersService;

@RestController
	@RequestMapping("/order")
	public class OrdersController {
		@Autowired
		OrdersService ordersService;
		
		@PostMapping("/create")
		public OrdersDTO createOrders(@RequestBody OrdersDTO orders) {
			 this.ordersService.createOrders(orders);
			return orders;		
		}
		@GetMapping("/orders")
		public List<OrdersDTO> getOrders() {
			return this.ordersService.getOrders();
		}
		@GetMapping("/orders/{ordersid}")
		public OrdersDTO getOrderByID(@PathVariable int ordersid) {
			return this.ordersService.getOrdersByID(ordersid);
		}
		
	}

