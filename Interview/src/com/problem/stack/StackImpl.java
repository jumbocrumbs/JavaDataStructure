package com.problem.stack;

public class StackImpl {
	
	private int arr[];
	private int top;
	private int capacity;
	
	StackImpl(int size){
		capacity= size;
		top=-1;
		arr= new int[size];
	}
	
	public void push(int ele) {
		if(top == (capacity - 1)) {
			System.out.println("stack is full");
		}
		arr[++top]= ele;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is EMPTY");
			System.exit(1);
		}
		
		System.out.println("removed item is" + arr[top]);
		return arr[top--];
		
	}
	
	public static void main(String[] args) {
		StackImpl st= new StackImpl(3);
		st.push(3);
	}

}
