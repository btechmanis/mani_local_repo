package com.ecommerce.exception;

public class ProductNotFoundException extends Exception  {
	
	 private String message;
	    public ProductNotFoundException(String message) {
	        super(message);
	        this.message = message;
	    }
	    public ProductNotFoundException() {
	    }
	

}
