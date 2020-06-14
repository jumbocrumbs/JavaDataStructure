package com.bank.application.controller;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	
	private String panNumber;
	
	private List<BankAccount> account;
	
	public Customer() {
	}

	public Customer(String panNumber) {
		this.panNumber = panNumber;
		this.account = new ArrayList<BankAccount>();
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public List<BankAccount> getAccount() {
		return account;
	}

	public void setAccount(List<BankAccount> account) {
		this.account = account;
	}

}
