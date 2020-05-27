package com.problem.tree;

public class MirrorTree {
	Node root;
	
	public static void inorder(Node node) {
		if(node == null) {
			return;
		}
		inorder(node.left);
		System.out.println(node.data + " ");
		inorder(node.right);
	}
	public Node mirror(Node node) {
		if(node == null) {
			return node;
		}
		Node left= mirror(node.left);
		Node right= mirror(node.right);
		node.left= right;
		node.right= left;
		return node;
	}
	
	public static void main(String[] args) {
		MirrorTree tree= new MirrorTree();
		tree.root= new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        
		inorder(tree.root);
	}

}
