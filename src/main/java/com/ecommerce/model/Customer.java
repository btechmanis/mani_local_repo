package com.ecommerce.model;

import java.time.LocalDate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int customerId;
	
	@Column(name="customerName")
  private String customerName;
  private String customerAddress;
  private String customerEmailId;
  private String customerPassword;
  private String customerBillingAddress;
  private LocalDate customerDate;
  
public Customer() {
	super();

}
public Customer(int customerId, String customerName, String customerAddress, String customerEmailId,
		String customerPassword, String customerBillingAddress, LocalDate customerDate) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.customerEmailId = customerEmailId;
	this.customerPassword = customerPassword;
	this.customerBillingAddress = customerBillingAddress;
	this.customerDate = customerDate;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public String getCustomerEmailId() {
	return customerEmailId;
}
public void setCustomerEmailId(String customerEmailId) {
	this.customerEmailId = customerEmailId;
}
public String getCustomerPassword() {
	return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
	this.customerPassword = customerPassword;
}
public String getCustomerBillingAddress() {
	return customerBillingAddress;
}
public void setCustomerBillingAddress(String customerBillingAddress) {
	this.customerBillingAddress = customerBillingAddress;
}
public LocalDate getCustomerDate() {
	return customerDate;
}
public void setCustomerDate(LocalDate customerDate) {
	this.customerDate = customerDate;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", customerEmailId=" + customerEmailId + ", customerPassword=" + customerPassword
			+ ", customerBillingAddress=" + customerBillingAddress + ", customerDate=" + customerDate + "]";
}
@Override
public int hashCode() {
	return Objects.hash(customerAddress, customerBillingAddress, customerDate, customerEmailId, customerId,
			customerName, customerPassword);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	return Objects.equals(customerAddress, other.customerAddress)
			&& Objects.equals(customerBillingAddress, other.customerBillingAddress)
			&& Objects.equals(customerDate, other.customerDate)
			&& Objects.equals(customerEmailId, other.customerEmailId) && customerId == other.customerId
			&& Objects.equals(customerName, other.customerName)
			&& Objects.equals(customerPassword, other.customerPassword);
}
  
  
  
}
