package com.venkateshspringboot.exception;

public class InsufficientBalanceError extends RuntimeException {

	public InsufficientBalanceError(String message) {
		super();
		System.out.println(message);
		
	}

	
   
}
