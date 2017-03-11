package main.java.trees;

import main.java.utility.Node;

/**
 * Created by arorai on 1/15/17.
 * Find the min element in BST. Assumption: tree is a Binary Search Tree.
 */
public class MinInBST {

    Node root;

    public static void main(String args[]) {
        MinInBST tree = new MinInBST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        int min = findMinInBST(tree.root);
        System.out.print(min);
    }

    private static int findMinInBST(Node root) {
        Node node = root;

        while(node.left != null) {
            node = node.left;
        }
        return node.data;
    }
}
