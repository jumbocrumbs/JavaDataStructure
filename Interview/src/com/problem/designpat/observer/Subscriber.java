package com.problem.designpat.observer;

public class Subscriber {
	
	private Channel channel= new Channel();
	
	private String name;
	
	
	
	public Subscriber(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println("Hey "+name + " Video Uploaded");
	}
	
	public void subscribedChannel(Channel  ch) {
		channel= ch;
	}

}
