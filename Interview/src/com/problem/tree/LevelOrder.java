package com.problem.tree;
import java.util.LinkedList;
import java.util.Queue;


public class LevelOrder {
	Node root;
	void printLevelOrder() {
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node tempNode= q.poll();
			System.out.println(tempNode.data + " ");

			if(tempNode.left != null) {
				q.add(tempNode.left);
			}
			if(tempNode.right != null) {
				q.add(tempNode.right);
			}
		}
	}

	public void printRightView()  
	{ 
		if (root == null) 
			return; 

		Queue<Node> queue = new LinkedList<>(); 
		queue.add(root); 

		while (!queue.isEmpty())  
		{    
			// number of nodes at current level 
			int n = queue.size(); 

			// Traverse all nodes of current level  
			for (int i = 1; i <= n; i++) { 
				Node temp = queue.poll(); 

				// Print the right most element at  
				// the level 
				if (i == n) 
					System.out.print(temp.data + " "); 

				// Add left node to queue 
				if (temp.left != null) 
					queue.add(temp.left); 

				// Add right node to queue 
				if (temp.right != null) 
					queue.add(temp.right); 
			} 
		} 
	} 

	public static void main(String[] args) {
		LevelOrder lOrder= new LevelOrder();
		lOrder.root= new Node(1);
		lOrder.root.left= new Node(2);
		lOrder.root.right= new Node(3);
		lOrder.root.left.left= new Node(4);
		lOrder.root.left.right= new Node(5);
		lOrder.root.right.right= new Node(6);
		//lOrder.printLevelOrder();
		lOrder.printRightView();}

}
