package com.ecommerce.model;

import java.time.LocalDate;

import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int orderId;
	
	 @Column(name="invoiceNumber")
private int invoiceNumber;
private LocalDate shipDate;
private LocalDate orderDate;
private String transactionStatus;
private int quantity;
@ManyToOne
private Customer customer;
@ManyToOne
private Shipper shipper;
@ManyToOne
private Payment payment;



public Orders() {
	super();
	}

public Orders(int orderId, int invoiceNumber, LocalDate shipDate, LocalDate orderDate, String transactionStatus,
		int quantity, Customer customer, Shipper shipper, Payment payment) {
	super();
	this.orderId = orderId;
	this.invoiceNumber = invoiceNumber;
	this.shipDate = shipDate;
	this.orderDate = orderDate;
	this.transactionStatus = transactionStatus;
	this.quantity = quantity;
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

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Shipper getShipper() {
	return shipper;
}

public void setShipper(Shipper shipper) {
	this.shipper = shipper;
}

public Payment getPayment() {
	return payment;
}

public void setPayment(Payment payment) {
	this.payment = payment;
}



@Override
public String toString() {
	return "Orders [orderId=" + orderId + ", invoiceNumber=" + invoiceNumber + ", shipDate=" + shipDate + ", orderDate="
			+ orderDate + ", transactionStatus=" + transactionStatus + ", quantity=" + quantity + ", customer="
			+ customer + ", shipper=" + shipper + ", payment=" + payment + "]";
}

@Override
public int hashCode() {
	return Objects.hash(customer, invoiceNumber, orderDate, orderId, payment, quantity, shipDate, shipper,
			transactionStatus);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Orders other = (Orders) obj;
	return Objects.equals(customer, other.customer) && invoiceNumber == other.invoiceNumber
			&& Objects.equals(orderDate, other.orderDate) && orderId == other.orderId
			&& Objects.equals(payment, other.payment) && quantity == other.quantity
			&& Objects.equals(shipDate, other.shipDate) && Objects.equals(shipper, other.shipper)
			&& Objects.equals(transactionStatus, other.transactionStatus);
}



}
