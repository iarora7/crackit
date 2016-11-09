package main.java.utility;

public class Tree {
	
	public Node root;
	
	public static int depth(Node root) {
		int depth;
		if(root==null) {
			return 0;
		}
		else {
			depth = 1 + Math.max(depth(root.left), depth(root.right)); 
		}
		return depth;
	}
	
	public static void printTree(Node root) {
		if(root!=null) {
			printTree(root.left);
			printTree(root.right);
			System.out.println(root.data);
		}
	}

	/*
	public static Node createTree(Node root) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
//		tree.root.left.left.right = new Node(45);
		return root;
	
	}
 */
}
