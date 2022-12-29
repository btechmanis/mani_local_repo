package com.ecommerce.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	
	    @ExceptionHandler(value = ProductNotFoundException.class)
	    public ResponseEntity productNotFoundException(ProductNotFoundException productNotFoundException) {
	        return new ResponseEntity("Product not found", HttpStatus.NOT_FOUND);
	    }
	}

