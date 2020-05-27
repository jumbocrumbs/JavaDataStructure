package com.problem.designpat.builder;

public class PhoneBuilder {
	
	private int battery;
	private String model;
	private String processor;
	private double screnSize;
	private boolean isGood;
	
	public PhoneBuilder setIsGood(Boolean isGood) {
		this.isGood = isGood;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public PhoneBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScrenSize(double screnSize) {
		this.screnSize = screnSize;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(battery, model, processor, screnSize, isGood);
	}
	
	
	

}
