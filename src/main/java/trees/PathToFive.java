package main.java.trees;

import main.java.utility.Node;

/*
 * Find Path To Multiples Of Five
 */

public class PathToFive {
	
	static Node root;
	
	public static void main(String args[]){
		PathToFive tree = new PathToFive();
		tree.root = new Node(665);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(45);
		tree.root.left.right = new Node(5);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(15);
		
		int[] path = new int[depth(root)];
		findPathToMultipleOfFive(root, path, 0);
		
	}

	private static int depth(Node root) {
		if(root==null){
			return 0;
		} else {
			return 1 + Math.max(depth(root.left), depth(root.right));
		}
	}

	private static void findPathToMultipleOfFive(Node root, int[] path, int level) {
		if(root == null){
			return;
		}
		path[level] = root.data;
		if(path[level]%5 == 0){
			printPath(path, level);
		}
		findPathToMultipleOfFive(root.left, path, level+1);
		findPathToMultipleOfFive(root.right, path, level+1);
	}

	private static void printPath(int[] path, int level) {
		System.out.print("Path to Node: " );
		for(int i=level; i>=0; i--){
			System.out.print(path[i] + " " );
		}
		System.out.println();
	}

}
