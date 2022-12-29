package com.ecommerce.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int paymentId;
 @Column(name="paymentType")
	private String paymentType;
	private int paymentAmount;
	public Payment() {
		super();

	}
	public Payment(int paymentId, String paymentType, int paymentAmount) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.paymentAmount = paymentAmount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentType=" + paymentType + ", paymentAmount=" + paymentAmount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(paymentAmount, paymentId, paymentType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return paymentAmount == other.paymentAmount && paymentId == other.paymentId && Objects.equals(paymentType, other.paymentType);
	}
	
	
	
}
