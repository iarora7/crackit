package main.java.utility;

/*
 * Similar to Node of tree.
 */

public class DoublyLLNode {
	
	public int data;
	public DoublyLLNode prev, next;
	
	public DoublyLLNode(){
		prev = next = null;
	}
	
	public DoublyLLNode(int data) {
		this.data = data;
		prev = next = null;
	}

}
