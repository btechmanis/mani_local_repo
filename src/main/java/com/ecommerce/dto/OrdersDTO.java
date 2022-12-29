package com.ecommerce.dto;

import java.time.LocalDate;
import java.util.List;



public class OrdersDTO {
    
	private int orderId;
	private int invoiceNumber;
	private LocalDate shipDate;
	private LocalDate orderDate;
	private String transactionStatus;
	private CustomerDTO customer;
	private ShipperDTO shipper;
	private PaymentDTO payment;
	
	
	public OrdersDTO() {
		
	}
	
	public OrdersDTO(int orderId, int invoiceNumber, LocalDate shipDate, LocalDate orderDate, String transactionStatus,
			CustomerDTO customer, ShipperDTO shipper, PaymentDTO payment) {
		super();
		this.orderId = orderId;
		this.invoiceNumber = invoiceNumber;
		this.shipDate = shipDate;
		this.orderDate = orderDate;
		this.transactionStatus = transactionStatus;
		this.customer = customer;
		this.shipper = shipper;
		this.payment = payment;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public LocalDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(LocalDate shipDate) {
		this.shipDate = shipDate;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public ShipperDTO getShipper() {
		return shipper;
	}

	public void setShipper(ShipperDTO shipper) {
		this.shipper = shipper;
	}

	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}
	
	

	@Override
	public String toString() {
		return "OrdersDTO [orderId=" + orderId + ", invoiceNumber=" + invoiceNumber + ", shipDate=" + shipDate
				+ ", orderDate=" + orderDate + ", transactionStatus=" + transactionStatus + ", customer=" + customer
				+ ", shipper=" + shipper + ", payment=" + payment + "]";
	}

}
