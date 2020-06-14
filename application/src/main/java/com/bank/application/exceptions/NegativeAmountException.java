package com.bank.application.exceptions;

public class NegativeAmountException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6999983916938035792L;
	
	public NegativeAmountException(String message) {
		super(message);
	}

}
