package main.java.utility;

/* Class containing left and right child of current node and key */

public class Node {
	public int data;
	public Node left, right;
	
	public Node(){
		left = right = null;
	}

	public Node(int item) {
		data = item;
		left = right = null;
	}
}
