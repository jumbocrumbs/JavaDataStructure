package com.problem.designpat.observer;

public class Youtube {
	
	public static void main(String[] args) {
		Subscriber s1= new Subscriber("Akshay");
		Subscriber s2= new Subscriber("harsh");
		Subscriber s3= new Subscriber("Sita");
		Subscriber s4= new Subscriber("Mukesh");
		Subscriber s5= new Subscriber("Gita");
		
		Channel c= new Channel();
		c.subscribe(s1);
		c.subscribe(s2);
		c.subscribe(s3);
		c.subscribe(s4);
		c.subscribe(s5);
		
		s1.subscribedChannel(c);
		s2.subscribedChannel(c);
		s3.subscribedChannel(c);
		s4.subscribedChannel(c);
		s5.subscribedChannel(c);
		
		c.upload("new Video");
		
		
	}
	
	
	
	

}
