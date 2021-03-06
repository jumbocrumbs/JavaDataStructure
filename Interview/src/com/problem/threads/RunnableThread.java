package com.problem.threads;

public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1= new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i < 2; i++) {
					System.out.println("Hii");
				}

			}
		});

		Thread thread2= new Thread(
				() -> {
					try {
						//thread2 will join thread1. It will wait till thread1 completes
						thread1.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for(int i=0; i < 2; i++) {
						System.out.println("Hello");
					}
					
				});
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("Main thread");
	} 




}
