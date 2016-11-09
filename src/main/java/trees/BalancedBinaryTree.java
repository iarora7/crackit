package main.java.trees;

import main.java.utility.Node;
import main.java.utility.Tree;

/*
 * Check if tree is a balanced binary tree.
 * 
 */

public class BalancedBinaryTree {
	
	Node root;
	
	public static void main(String args[]){
		BalancedBinaryTree tree = new BalancedBinaryTree();
		createTree(tree.root);
		System.out.println(isBalanced(tree) ? "Balanced" : "Not Balanced");
	}

	private static boolean isBalanced(BalancedBinaryTree tree) {
		int ht = checkHeight(tree.root);
		if(ht == -1) {
			return false;
		}
		System.out.println("Tree height: " + ht);
		return true;
	}

	private static int checkHeight(Node node) {
		if(node == null){
			return 0;
		}
		int leftht = checkHeight(node.left);
		if(leftht == -1) {
			return -1;
		} 
		
		int rightht = checkHeight(node.right);
		if(rightht == -1) {
			return -1;
		}
		
		int htdiff = leftht - rightht;
		if(htdiff > 1) {
			return -1;
		} else {
			return Math.max(leftht, rightht) + 1;
		}
	}

	private static Node createTree(Node root) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		return root;
	}

}

