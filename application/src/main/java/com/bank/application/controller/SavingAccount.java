package com.bank.application.controller;

public class SavingAccount extends BankAccount{
	
	public SavingAccount() {
		super();
		this.minimumBalance = 10000.0;
		this.interestRate = 4.5;
	}

	public String getType() {
		return "Saving";
	}

}
