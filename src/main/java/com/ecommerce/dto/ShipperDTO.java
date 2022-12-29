package com.ecommerce.dto;

public class ShipperDTO {
	private int shipperId;
	private long phoneNumber;
	private String companyName;
	private String shipperAddress;
	
	
	public ShipperDTO() {
		
	}
	
	public ShipperDTO(int shipperId, long phoneNumber, String companyName, String shipperAddress) {
		super();
		this.shipperId = shipperId;
		this.phoneNumber = phoneNumber;
		this.companyName = companyName;
		this.shipperAddress = shipperAddress;
	}
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getShipperAddress() {
		return shipperAddress;
	}
	public void setShipperAddress(String shipperAddress) {
		this.shipperAddress = shipperAddress;
	}
	@Override
	public String toString() {
		return "ShipperDTO [shipperId=" + shipperId + ", phoneNumber=" + phoneNumber + ", companyName=" + companyName
				+ ", shipperAddress=" + shipperAddress + "]";
	}
	
	
}
