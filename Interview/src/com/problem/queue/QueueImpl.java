package com.problem.queue;

public class QueueImpl {
	
	private int[] arr;
	private int capacity;
	private int front;
	private int rear;
	private int count;
	
	QueueImpl(int size){
		front=0;
		rear=-1;
		capacity= size;
		arr=new int[size];
		count=0;
	}
	
	public void enqueue(int data) {
		if(count >= capacity) {
			System.out.println("Queue is full");
			System.exit(1);
		}
		
		rear= (rear+1) % capacity;
		arr[rear]= data;
		count++;
	}
	
	public void dequeue() {
		if(count == 0) {
			System.out.println("Queue is empty");
			System.exit(1);
		}
		
		System.out.println("Removed element is" + arr[front]);
		front= (front+1) % capacity;
		count--;
		
	}
	
	public static void main(String[] args) {
		QueueImpl q= new QueueImpl(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		
	}
	

}
