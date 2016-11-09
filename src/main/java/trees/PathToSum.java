package main.java.trees;

import main.java.utility.Node;

/*
 * Tree Struc:
 * 				7
			  /	  \
			 2     3 
			/ \	  / \		
		   4   5 6   1
 */

public class PathToSum {
	
	static Node root;
	
	public static void findSumPath(Node node, int sum, int[] path, int level){
	
		if(node == null){
			return;
		}
		
		path[level] = node.data;
		int t=0;
		for(int i=level; i>=0; i--){
			t += path[i];
			if(t == sum) {
				System.out.println("Path found!");
				printPath(path, i, level);
			}
		}
		
		findSumPath(node.left, sum, path, level+1);
		findSumPath(node.right, sum, path, level+1);
	}
	
	private static void printPath(int[] path, int start, int end) {
		for(int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
			System.out.println();
		
	}

	public static int depth(Node root){
		if(root == null) {
			return 0;
		} else {
			return 1 + Math.max(depth(root.left), depth(root.right));
		}
		
	}

	public static void main(String args[]){
		PathToSum tree = new PathToSum();
		tree.root = new Node(7);
		tree.root.left = new Node(2);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(1);
		
		int[] path = new int[depth(root)];
		findSumPath(root, 6, path, 0);
		
	}
}


