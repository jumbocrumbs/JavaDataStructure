package com.bank.application.controller;

import org.springframework.data.annotation.Id;

public class Transaction {
	
	//@Id
	private static String transactionId= "0";
	private Double amount;
	private String type;
	
	public Transaction(Double amount, String type) {
		this.transactionId = String.valueOf(((Integer.parseInt(transactionId))+ 1));
		this.amount = amount;
		this.type = type;
	}

	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Double getAmount() {
		return amount;
	}
	public String getType() {
		return type;
	}

}
