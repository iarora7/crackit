package main.java.trees;

import main.java.utility.Node;

/*
 * Identify if the binary tree is Binary Search Tree
 */

public class BinarySearchTree {
	
	Node root;
	
	public static void main(String args[]){
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        
        System.out.println(tree.isBST() ? "Is BST" : "Not a BST");
	}

	private boolean isBST() {
		int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
		if(!isBST(root, min, max)) {
			return false;
		}
		return true;
	}

	private boolean isBST(Node node, int min, int max) {
		if(node == null) {
			return true;
		}
		if(node.data < min || node.data > max) {
			return false;
		}
		if(!isBST(node.left, min, node.data) ||
				!isBST(node.right, node.data, max)) {
			return false;
		}
		return true;
	}

}
