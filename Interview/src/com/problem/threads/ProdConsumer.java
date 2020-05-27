package com.problem.threads;

import java.util.LinkedList;

public class ProdConsumer {
	
	static PC pc = new PC();
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// TODO Auto-generated method stub

			}
		});

		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub

			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

	static class PC{

		LinkedList<Integer> li= new LinkedList<>();

		private static final int size= 2;

		public synchronized void produce() throws InterruptedException {

			Integer value=0;
			while(true) {
				synchronized (this) {
					if(li.size() == size) {
						wait();
					}

					li.add(value++);
					notify();
					Thread.sleep(1000); 
				}
				
			}

		}

		public void consume() throws InterruptedException {

			Integer value=0;
			while(true) {
				synchronized (this) {
					if(li.size() == 0) {
						wait();
					}

					Integer data=li.removeFirst();
					System.out.println("removed Item is "+ data);
					notify();
					Thread.sleep(1000); 
				}
				
			}

		}

	}

}
