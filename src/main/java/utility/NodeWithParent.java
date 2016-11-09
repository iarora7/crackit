package main.java.utility;

public class NodeWithParent {
	public int data;
	public NodeWithParent left, right, parent;
	
	public NodeWithParent() {
		left = right = parent = null;
	}
	
	public NodeWithParent(int c){
		data = c;
		parent = this;
		left = right = null;
	}

}
