package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.OrdersDTO;


public interface OrdersService {

	
	public OrdersDTO createOrders(OrdersDTO orders);

	public List<OrdersDTO> getOrders();

	public OrdersDTO getOrdersByID(int ordersid);

	

}
