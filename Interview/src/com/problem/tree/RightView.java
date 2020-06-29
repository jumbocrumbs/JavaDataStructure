package com.problem.tree;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {
	Node root;

	private void printLevelOrder() {

		if(root == null) {
			return;
		}

		Queue<Node> queue= new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {

			int n= queue.size();

			for(int i= 1; i <= n; i++) {
				Node temp= queue.poll();

				if(i==n) {
					System.out.print(temp.data + " ");
				}

				if(temp.left != null) {
					queue.add(temp.left);
				}

				if(temp.right != null) {
					queue.add(temp.right);
				}
			}

		}
	}


	public static void main(String[] args) {
		RightView lOrder= new RightView();
		lOrder.root= new Node(1);
		lOrder.root.left= new Node(2);
		lOrder.root.right= new Node(3);
		lOrder.root.left.left= new Node(4);
		lOrder.root.left.right= new Node(5);
		lOrder.root.right.right= new Node(6);
		lOrder.printLevelOrder();

	}


	//lOrder.printRightView();

}
