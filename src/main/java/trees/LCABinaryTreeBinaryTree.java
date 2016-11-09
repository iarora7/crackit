package main.java.trees;

import main.java.utility.Node;

/*
 * Find common ancestor in Binary Tree. Tree Structure :
 * 
 * 					3
				  /   \
				 4      5
				/ \    / \
			   8   9  10  1
			  / \
			 7   6
			 
			 Code Working for all scenarios
 */

public class LCABinaryTreeBinaryTree {
	
	class Result {
		public Result(Node node, boolean b) {
			this.node = node;
			this.isAncestor = b;
		}
		Node node;
		boolean isAncestor;
	}
	
	Node root;
	
	public static void main(String args[]) {
		LCABinaryTreeBinaryTree tree = new LCABinaryTreeBinaryTree();
		
		tree.root = new Node(3);
        tree.root.left = new Node(4);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(1);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(6);
        
        Result result = tree.lcaBinaryTree(tree.root, 9, 6);
        System.out.println("Result for 9, 6 : " + (result.isAncestor ? result.node.data : "No ancestor found"));
        
        Result result1 = tree.lcaBinaryTree(tree.root, 1, 6);
        System.out.println("Result for 1, 6 : " + (result1.isAncestor ? result1.node.data : "No ancestor found"));
        
        Result result2 = tree.lcaBinaryTree(tree.root, 11, 6);
        System.out.println("Result for 11, 6 : " + (result2.isAncestor ? result2.node.data : "No ancestor found"));
	}

	private Result lcaBinaryTree(Node root, int i, int j) {
		if(root == null) {
			return new Result(null, false);
		}
		
		if(root.data==i && root.data==j) {
			return new Result(root, true);
		}
		
		Result leftRes = lcaBinaryTree(root.left, i, j);
		if(leftRes.isAncestor) {
			return leftRes;
		}
		Result rightRes = lcaBinaryTree(root.right, i, j);
		if(rightRes.isAncestor) {
			return rightRes;
		}
		
		if(leftRes.node!=null && rightRes.node!=null) {
			return new Result(root, true);
		}else if(root.data==i || root.data==j){
			boolean isAncestor = leftRes.node!=null || rightRes.node!=null ? true : false;
			return new Result(root, isAncestor);
		} else {
			return new Result((leftRes.node!=null)? leftRes.node : rightRes.node, false);
		}
	}

}
