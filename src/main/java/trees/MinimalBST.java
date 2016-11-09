package main.java.trees;

import main.java.utility.Node;
import main.java.utility.Tree;

/*
 * create a Minimal Binary Search Tree from a sorted array.
 * For minimal height, the middle element of the array should be the root element.
 */

public class MinimalBST {
	Node root;
	
	public static void main(String args[]){
		MinimalBST tree = new MinimalBST();
		int arr[] = {0,1,2,3,4};
		
		Node root = createMinimalBST(arr,0,arr.length-1);
//		printBST(root);
		System.out.println("depth: " + Tree.depth(root));
	}

	private static void printBST(Node root) {
		Tree.printTree(root);
	}

	private static Node createMinimalBST(int[] arr, int i, int j) {
		if(j < i) {
			return null;
		}
		int mid = (i+j)/2;
		Node n = new Node(arr[mid]);
		n.left = createMinimalBST(arr, i, mid-1);
		n.right = createMinimalBST(arr, mid+1, j);
		System.out.println(n.data);
		return n;
	}

}
