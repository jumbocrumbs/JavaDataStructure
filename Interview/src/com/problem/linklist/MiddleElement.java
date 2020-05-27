package com.problem.linklist;

public class MiddleElement {
	Node head; 
	
	public void printMiddle() {
		Node fast= head;
		Node slow= head;
		
		while(fast != null) {
			fast= fast.next.next;
			slow= slow.next;
		}
		System.out.println("Middle ele=" + slow.data);
	}
	
	public void push(int new_data) {
		Node node= new Node(new_data);
		node.next= head;
		head= node;
	}
	
	public void printList() {
		Node tNode= head;
		while(tNode != null) {
			System.out.print(tNode.data + "->");
			tNode= tNode.next;
		}
		
		System.out.println("NULL");
	}
	
	
	public static void main(String[] args) {
		//LinkedList<Node> ll= new LinkedList<>();
		MiddleElement llist= new MiddleElement();
		for(int i= 1; i <= 10; i++) {
			llist.push(i);
		}
		
		llist.printList();
		llist.printMiddle();
		
	}

}
