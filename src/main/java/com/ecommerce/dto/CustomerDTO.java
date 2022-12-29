package com.ecommerce.dto;

import java.time.LocalDate;

public class CustomerDTO {

	private int customerId;
	  private String customerName;
	  private String customerAddress;
	  private String customerEmailId;
	  private String customerPassword;
	  private String customerBillingAddress;
	  private LocalDate customerDate;
	  
	  public CustomerDTO() {
		  
	  }
	  
	  
	public CustomerDTO(int customerId, String customerName, String customerAddress, String customerEmailId,
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
		return "CustomerDTO [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerEmailId=" + customerEmailId + ", customerPassword=" + customerPassword
				+ ", customerBillingAddress=" + customerBillingAddress + ", customerDate=" + customerDate + "]";
	}
	  
	  
}
