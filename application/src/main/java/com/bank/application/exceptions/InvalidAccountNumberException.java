package com.bank.application.exceptions;

public class InvalidAccountNumberException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7061392624470337617L;
	
	public InvalidAccountNumberException(String message){
		super(message);
	}
	

}
