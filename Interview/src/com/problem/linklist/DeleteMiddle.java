package com.problem.linklist;

public class DeleteMiddle {
	
	Node head;
	
	public void push(int data) {
		Node node= new Node(data);
		node.next= head;
		head= node;
	}
	
	public void deleteMiddle() {
		Node slow= head;
		Node fast= head;
		Node prev= null;
		while(fast != null ) {
			fast=fast.next.next;
			prev= slow;
			slow= slow.next;
		}
		prev.next= slow.next;
	}
	
	public void printList() {
		Node temp= head;
		while(temp != null) {
			System.out.print(temp.data +"->");
			temp= temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		DeleteMiddle llist= new DeleteMiddle();
		for(int i= 1; i <= 10; i++) {
			llist.push(i);
		}
		llist.printList();
		llist.deleteMiddle();
		llist.printList();
	}
}
