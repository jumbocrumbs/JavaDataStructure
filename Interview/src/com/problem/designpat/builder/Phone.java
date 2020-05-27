package com.problem.designpat.builder;

public class Phone {
	private int battery;
	private String model;
	private String processor;
	private double screnSize;
	private boolean isGood;
	
	
	public Phone(int battery, String model, String processor, double screnSize, boolean isGood) {
		super();
		this.battery = battery;
		this.model = model;
		this.processor = processor;
		this.screnSize = screnSize;
		this.isGood = isGood;
	}


	@Override
	public String toString() {
		return "Phone [battery=" + battery + ", model=" + model + ", processor=" + processor + ", screnSize="
				+ screnSize + ", isGood=" + isGood + "]";
	}


	
	

}
