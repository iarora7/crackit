package main.java.trees;

import java.util.Iterator;
import java.util.LinkedList;

import main.java.utility.Node;
import main.java.utility.Tree;

public class DepthLinkedList {
	
	static Node root;
	static LinkedList<Node> list[];
	
	public static void main(String args[]) {
		DepthLinkedList tree = new DepthLinkedList();
		root = createTree(tree.root);
		int depth = depth(tree.root);
		list = new LinkedList[depth];
		createDepthLinkedList(tree.root,0);
		for(int i=0; i< depth; i++) {
			System.out.println("List items of list["+i+"]");
			Iterator itr = list[i].iterator();
			while(itr.hasNext()) {
				System.out.println(((Node) itr.next()).data);
			}
		}
	}
	

	private static int depth(Node root) {
		int depth;
		if(root==null) {
			return 0;
		}
		else {
			depth = 1 + Math.max(depth(root.left), depth(root.right)); 
		}
		return depth;
	
	}


	private static Node createTree(Node root) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(24);
		root.right.right = new Node(25);
		root.left.left.left = new Node(14);
		root.left.left.right = new Node(15);
		return root;
	}


	private static void createDepthLinkedList(Node root, int level) {
		if(root == null) {
			return;
		}
		if(list[level] == null) {
			list[level] = new LinkedList<>();
		}

		createDepthLinkedList(root.left, level + 1);
		createDepthLinkedList(root.right, level + 1);
		list[level].add(root);
	}


}
