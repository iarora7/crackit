package main.java.interviews;

import main.java.leetcode.IntegerToRoman;
import main.java.utility.Node;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by arorai on 3/26/17.
 */

/*
 * 					3
				  /   \
				 4      5
				/ \    / \
			   8   9  10  1
			  / \
			 7   6

 */

public class InorderIteration {
    Node root;


    public static void main(String args[]) {
        InorderIteration tree = new InorderIteration();
        ArrayList<Integer> recursiveList = new ArrayList<>();

        tree.root = new Node(3);
        tree.root.left = new Node(4);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(10);
        tree.root.right.right = new Node(1);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.right = new Node(6);

        System.out.print("recursive inOrder: ");
        inorderTraversal(tree.root);
        System.out.println();
        System.out.print("iterative inOrder: ");
        inOrderRecursive(tree.root);
    }

    private static void inOrderRecursive(Node root) {
        if(root == null) {
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data + ", ");
        inOrderRecursive(root.right);
    }

    private static void inorderTraversal(Node root) {
        Stack<Node> stack = new Stack();
        ArrayList<Integer> list = new ArrayList<>();
        Node p = root;

        while(p!=null || !stack.isEmpty()) {
            if(p!=null) {
                stack.push(p);
                p = p.left;
            } else {
                Node val = stack.pop();
                list.add(val.data);
                p = val.right;
            }
        }
        System.out.print(list);
    }


}
