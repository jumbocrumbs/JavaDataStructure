package com.bank.application.exceptions;

public class BankServiceException extends RuntimeException{

	private static final long serialVersionUID = -6350505471050077586L;
	
	public BankServiceException(String message) {
		super(message);
	}
	

}
