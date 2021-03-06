package main.java.trees;

import java.util.Stack;

//Binary Tree node
class NodeWithLeaf {
	int data;
	NodeWithLeaf left, right;

	public NodeWithLeaf(int x) {
		data = x;
		left = right = null;
	}

	public boolean isLeaf() {
		return (left == null && right == null);
	}
}

class LeafOrderTraversal {
	// Returns true of leaf traversal of two trees is
	// same, else false
	public static boolean isSame(NodeWithLeaf root1, NodeWithLeaf root2) {
		// Create empty stacks. These stacks are going
		// to be used for iterative traversals.
		Stack<NodeWithLeaf> s1 = new Stack<NodeWithLeaf>();
		Stack<NodeWithLeaf> s2 = new Stack<NodeWithLeaf>();

		s1.push(root1);
		s2.push(root2);

		// Loop until either of two stacks is not empty
		while (!s1.empty() || !s2.empty()) {
			// If one of the stacks is empty means other
			// stack has extra leaves so return false
			if (s1.empty() || s2.empty())
				return false;

			NodeWithLeaf temp1 = s1.pop();
			while (temp1 != null && !temp1.isLeaf()) {
				// Push right and left children of temp1.
				// Note that right child is inserted
				// before left
				if (temp1.right != null)
					s1.push(temp1.right);
				if (temp1.left != null)
					s1.push(temp1.left);
				temp1 = s1.pop();
			}

			// same for tree2
			NodeWithLeaf temp2 = s2.pop();
			while (temp2 != null && !temp2.isLeaf()) {
				if (temp2.right != null)
					s2.push(temp2.right);
				if (temp2.left != null)
					s2.push(temp2.left);
				temp2 = s2.pop();
			}

			// If one is null and other is not, then
			// return false
			if (temp1 == null && temp2 != null)
				return false;
			if (temp1 != null && temp2 == null)
				return false;

			// If both are not null and data is not
			// same return false
			if (temp1 != null && temp2 != null) {
				if (temp1.data != temp2.data)
					return false;
			}
		}

		// If control reaches this point, all leaves
		// are matched
		return true;
	}

	// Driver program to test
	public static void main(String[] args) {
		// Let us create trees in above example 1
		NodeWithLeaf root1 = new NodeWithLeaf(1);
		root1.left = new NodeWithLeaf(2);
		root1.right = new NodeWithLeaf(3);
		root1.left.left = new NodeWithLeaf(4);
		root1.right.left = new NodeWithLeaf(6);
		root1.right.right = new NodeWithLeaf(7);

		NodeWithLeaf root2 = new NodeWithLeaf(0);
		root2.left = new NodeWithLeaf(1);
		root2.right = new NodeWithLeaf(5);
		root2.left.right = new NodeWithLeaf(4);
		root2.right.left = new NodeWithLeaf(6);
		root2.right.right = new NodeWithLeaf(7);

		if (isSame(root1, root2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
