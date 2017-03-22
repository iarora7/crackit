package main.java.glassdoor;

import java.util.LinkedList;

/**
 * Created by arorai on 3/21/17.
 */
public class ContinousSeq {

    public static void main(String args[]) {
//        int[] arr = {23, 5, 4, 7, 2, 11}; // 20
        int[] arr = {1, 3, 5, 23, 2}; // 8
        int target = 8;

        boolean seqPresent = continousSeqToTarget(arr, target);
        System.out.print(target + " --> " + seqPresent);
    }

    private static boolean continousSeqToTarget(int[] arr, int target) {
        LinkedList<Integer> list = new LinkedList<>();
        int i=0;
        int sum = 0;
        list.add(arr[i]);
        sum = arr[i++];
        while(i < arr.length) {
//            System.out.println("list" + " --> " + list);
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
