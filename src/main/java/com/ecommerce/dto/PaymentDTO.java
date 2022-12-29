package com.ecommerce.dto;

public class PaymentDTO {
	
	private int paymentId;
	private String paymentType;
	private int paymentAmount;
		
	
	public PaymentDTO() {
		
	}
	public PaymentDTO(int paymentId, String paymentType, int paymentAmount) {
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
		return "PaymentDTO [paymentId=" + paymentId + ", paymentType=" + paymentType + ", paymentAmount=" + paymentAmount + "]";
	}
	
	
}
