package com.bank.application.controller;

public class CurrentAccount extends BankAccount{
	
	public CurrentAccount() {
		this.minimumBalance = 20000.0;
		this.interestRate = 0.0;
	}

	public String getType() {
		return "Current";
	}

}
