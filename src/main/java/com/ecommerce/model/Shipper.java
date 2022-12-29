package com.ecommerce.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipper")
public class Shipper {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int shipperId;
	
	 @Column(name="phoneNumber")

	private long phoneNumber;
	private String companyName;
	private String shipperAddress;
	public Shipper() {
		super();
		
	}
	public Shipper(int shipperId, long phoneNumber, String companyName, String shipperAddress) {
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
		return "Shipper [shipperId=" + shipperId + ", phoneNumber=" + phoneNumber + ", companyName=" + companyName
				+ ", shipperAddress=" + shipperAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(companyName, phoneNumber, shipperAddress, shipperId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shipper other = (Shipper) obj;
		return Objects.equals(companyName, other.companyName) && phoneNumber == other.phoneNumber
				&& Objects.equals(shipperAddress, other.shipperAddress) && shipperId == other.shipperId;
	}
	
	
}
