package main.java.glassdoor;

import java.util.LinkedList;

/**
 * Created by arorai on 3/21/17.
 * Given a sequence of non-negative integers A and an integer T,
 * return whether there is a *continuous sequence* of A that sums up to exactly T
 * Complexity: O(n)
 */
public class ContinousSeq {

    public static void main(String args[]) {
        int[] arr = {23, 5, 4, 7, 2, 11}; // 20 true
//        int[] arr = {1, 3, 5, 23, 2}; // 8 true
//        int[] arr = {1, 3, 5, 23, 2}; // 7 false
        int target = 20;

        boolean seqPresent = continousSeqToTarget(arr, target);
        System.out.print(target + " --> " + seqPresent);
    }

    private static boolean continousSeqToTarget(int[] arr, int target) {
        LinkedList<Integer> list = new LinkedList<>();
        int i=0;
        int sum = 0;
        list.add(arr[i]);
        sum = arr[i++];
        while(i < arr.length || sum >= target) {
            System.out.println("sum=" + sum + " list" + " --> " + list);
            if(sum == target) {
                return true;
            } else if(sum < target){
                sum += arr[i];
                list.add(arr[i++]);
            } else {
                int old = (int) list.remove();
                sum -= old;
            }
        }

        return false;
    }
}
