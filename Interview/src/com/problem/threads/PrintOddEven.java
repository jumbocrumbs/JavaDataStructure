package com.problem.threads;

public class PrintOddEven {
	
	int count= 1;
	int MAX= 20;
	boolean odd;
	
	public void printOdd() {
		synchronized (this) {
			while(count < MAX) {
				System.out.println("Checking odd loop");
				while(!odd) {
					
					try {
						System.out.println("Odd waiting: " + count);
						wait();
						System.out.println("Notified odd: " + count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Odd thread" + count);
				count++;
				odd= false;
				notify();
			}
		}
	}
	
	public void printEven() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (this) {
			while(count < MAX) {
				System.out.println("Checking Even loop");
				while(odd) {
					
					try {
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Notified Even: " + count);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Even Thread" + count);
				odd= true;
				count++;
				notify();
			}
			
		}
	}
	
	public static void main(String[] args) {
		PrintOddEven print= new PrintOddEven();
		print.odd= true;
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				print.printEven();
				// TODO Auto-generated method stub
				
			}
		});
		
		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {
				print.printOdd();
				// TODO Auto-generated method stub
				
			}
			
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
