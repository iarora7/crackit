package main.java.leetcode;

import main.java.utility.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arorai on 1/22/17.
 */
public class LevelOrder {

    static Node root;

    public static void main(String args[]) {
        LevelOrder tree = new LevelOrder();
        root = createTree(tree.root);
        List<List<Integer>> res = tree.levelOrderBottom(root);

    }

    public List<List<Integer>> levelOrderBottom(Node root) {

        List<List<Integer>> result = new ArrayList();
        levelOrder(root, 0, result);

        return result;
    }

    public void levelOrder(Node root, int level, List<List<Integer>> result) {
        if (root == null) return;

        if(level >= result.size()) {
            System.out.println("level " + level +  " was null, at: " + root.data);
            result.add(new ArrayList());
        }
        levelOrder(root.left, level+1, result);
        levelOrder(root.right, level+1, result);
        result.get(result.size()-level-1).add(root.data);

        return;
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
}
