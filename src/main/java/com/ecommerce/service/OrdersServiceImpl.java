package com.ecommerce.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dto.CustomerDTO;
import com.ecommerce.dto.OrdersDTO;
import com.ecommerce.dto.PaymentDTO;
import com.ecommerce.dto.ShipperDTO;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Orders;
import com.ecommerce.model.Payment;
import com.ecommerce.model.Shipper;


import com.ecommerce.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	
	@Autowired
	private OrdersRepository ordersrepository;
	
	
	
	@Autowired
	private CustomerServiceImpl custImpl;
	@Autowired
	private ShipperServiceImpl shipperImpl;
	@Autowired
	private PaymentServiceImpl paymentImpl;
	

	@Override
	public OrdersDTO createOrders(OrdersDTO ordersDto) {
		 Orders orders=new Orders();
		
		orders.setInvoiceNumber(ordersDto.getInvoiceNumber());
		orders.setShipDate(ordersDto.getShipDate());
		if(ordersDto.getOrderDate()==null)
			ordersDto.setOrderDate(LocalDate.now());
		orders.setOrderDate(ordersDto.getOrderDate());
		orders.setTransactionStatus(ordersDto.getTransactionStatus());
		
		Customer customer1=custImpl.customerrepository.findById(ordersDto.getCustomer().getCustomerId()).get();
		orders.setCustomer(customer1);
		
		Payment payment = paymentImpl.paymentrepository.findById(ordersDto.getPayment().getPaymentId()).get();
		orders.setPayment(payment);
		
		Shipper shipper = shipperImpl.shipperrepository.findById(ordersDto.getShipper().getShipperId()).get();
		orders.setShipper(shipper);
		
		CustomerDTO customerDto=custImpl.getCustomerByID(ordersDto.getCustomer().getCustomerId());
		ordersDto.setCustomer(customerDto);
		
		PaymentDTO paymentDto = paymentImpl.getPaymentByID(ordersDto.getPayment().getPaymentId());
		ordersDto.setPayment(paymentDto);
		
		ShipperDTO shipperDto = shipperImpl.getShipperByID(ordersDto.getShipper().getShipperId());
		ordersDto.setShipper(shipperDto);
		
		
		orders = ordersrepository.save(orders);
		ordersDto.setOrderId(orders.getOrderId());
		
		 return ordersDto;
	}

	@Override
	public List<OrdersDTO> getOrders() {
		Iterable<Orders> orders=ordersrepository.findAll();
		List<OrdersDTO> orders2=new ArrayList<>();
		orders.forEach(t -> {
			OrdersDTO cat=new OrdersDTO();
			cat.setOrderId(t.getOrderId());
			cat.setInvoiceNumber(t.getInvoiceNumber());
			cat.setOrderDate(t.getOrderDate());
			cat.setShipDate(t.getShipDate());
			cat.setTransactionStatus(t.getTransactionStatus());
			CustomerDTO customer1=custImpl.getCustomerByID(t.getCustomer().getCustomerId());
			cat.setCustomer(customer1);
			
			PaymentDTO payment = paymentImpl.getPaymentByID(t.getPayment().getPaymentId());
			cat.setPayment(payment);
			
			ShipperDTO shipper = shipperImpl.getShipperByID(t.getShipper().getShipperId());
			cat.setShipper(shipper);
			//cat.setOrderProducts(t.getOrderProducts());
			
			orders2.add(cat);
		});
		return orders2;
	}

	@Override
	public OrdersDTO getOrdersByID(int ordersid) {
		
		Orders orders = ordersrepository.findById(ordersid).get();
		OrdersDTO ordersDto = new OrdersDTO();
		ordersDto.setOrderId(orders.getOrderId());
		ordersDto.setInvoiceNumber(orders.getInvoiceNumber());
		ordersDto.setShipDate(orders.getShipDate());
		ordersDto.setOrderDate(orders.getOrderDate());
		ordersDto.setTransactionStatus(orders.getTransactionStatus());
		CustomerDTO customer1=custImpl.getCustomerByID(orders.getCustomer().getCustomerId());
		ordersDto.setCustomer(customer1);
		
		PaymentDTO payment = paymentImpl.getPaymentByID(orders.getPayment().getPaymentId());
		ordersDto.setPayment(payment);
		
		ShipperDTO shipper = shipperImpl.getShipperByID(orders.getShipper().getShipperId());
		ordersDto.setShipper(shipper);
		
	   
		return ordersDto;
	}


	
	
	
		

}
