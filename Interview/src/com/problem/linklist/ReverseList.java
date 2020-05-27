package com.problem.linklist;

public class ReverseList {
	Node head;
	
	public Node reverseList() {
		Node temp= head;
		Node prev= null;
		Node cur= temp;
		Node next=null;
		while(cur != null){
			next= cur.next;
			cur.next= prev;
			prev= cur;
			cur= next;
		}
		temp= prev;
		printListNode(temp);
		return temp;
	}
	public void printListNode(Node node) {
		Node temp= node;
		while(temp != null) {
			System.out.print(temp.data +"->");
			temp= temp.next;
		}
		System.out.print("null");
	}
	
	public void printList() {
		Node temp= head;
		while(temp != null) {
			System.out.print(temp.data +"->");
			temp= temp.next;
		}
		System.out.print("null");
	}
	
	public void push(int data) {
		Node node= new Node(data);
		node.next= head;
		head=node;
	}
	
	public static void main(String[] args) {
		ReverseList list= new ReverseList();
		for(int i= 1; i <= 10; i++) {
			list.push(i);
		}
		list.printList();
		System.out.println();
		System.out.println("After reversing====");
		list.reverseList();
		
	}

}
