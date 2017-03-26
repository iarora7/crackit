package main.java.glassdoor;

import java.util.*;

/**
 * Created by arorai on 3/21/17.
 *
 *  Question: List all pairs that sum up to target (Two Pair)
 * Complexity: O(n)
 */
public class SumToTarget {

    public static void main(String args[]) {
        int[] a = {3, 17, 4, 7, 9, 11}; // 20
        int target = 20;
        List<List<Integer>> res = sumToTarget(a, target);
    }

    private static List<List<Integer>> sumToTarget(int[] a, int target) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i: a) {
            if(set.contains(target - i)) {
                res.add(Arrays.asList(i, target-i));
            } else {
               set.add(i);
            }
            System.out.println(i);
        }
        System.out.println("List --> " + res);
        return res;
    }
}
