package main.java.leetcode;

import main.java.utility.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arorai on 3/25/17.
 */
public class LevelOrderTop {
    static Node root;

    public static void main(String args[]) {
        LevelOrderTop tree = new LevelOrderTop();
        root = createTree(root);
        List<List<Integer>> res = tree.levelOrderTop(root);
    }

    private List<List<Integer>> levelOrderTop(Node root) {
        if(root == null) return null;
        List<List<Integer>> res = new ArrayList<>();
        levelOrderTop(root, 0, res);
        System.out.println("result: " + res);
        return res;
    }

    private void levelOrderTop(Node root, int i, List<List<Integer>> res) {
        if(root == null) return;
        if(i >= res.size()) {
            System.out.println("at node: " + root.data);
            res.add(i, new ArrayList<>());
        }
        res.get(i).add(root.data);

        levelOrderTop(root.left, i+1, res);
        levelOrderTop(root.right, i+1, res);
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
