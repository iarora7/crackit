package main.java.trees;

import main.java.utility.NodeWithParent;

/*
 * Find next element in InOrderTraversal. (Assume that there is a link to parent node)
 */

public class InOrderSuccessor {
	
	NodeWithParent root;
	
	public static void main(String args[]) {
		InOrderSuccessor tree = new InOrderSuccessor();
		tree.root = new NodeWithParent(4);
        tree.root.left = new NodeWithParent(2);
        tree.root.right = new NodeWithParent(5);
        tree.root.left.left = new NodeWithParent(1);
        tree.root.left.right = new NodeWithParent(3);
        NodeWithParent find = tree.root.left;
        NodeWithParent succ = tree.inOrderSucc(find);
        System.out.println("Inorder successor of 4: " + succ != null ? succ.data : "null");
	}

	private NodeWithParent inOrderSucc(NodeWithParent i) {
		NodeWithParent succ = null;
		
		if(i == null) {
			return null;
		}
		
		if(i.right != null) {
			return minFromRightTree(i.right);
		}
		
		while(root != null) {
			if(i.data < root.data) {
				succ = root;
				root = root.left;
			} else if(i.data > root.data) {
				root = root.right;
			} else {
				break;
			}
		}
		return succ;
	}

	private NodeWithParent minFromRightTree(NodeWithParent node) {
		NodeWithParent curr = node;
		
		while(node.left != null){
			node = node.left;
		}
		return curr;
	}

}
