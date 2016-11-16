package main.java.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by arorai on 11/9/16.
 */
public class ThirdMax {

    PriorityQueue<Integer> pq;

    public ThirdMax() {
        pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                } else if(o1 == o2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }

    public void insert(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(pq.contains(arr[i])) {
                continue;
            }
            pq.offer(arr[i]);
        }
    }

    public int peek() {
        return pq.peek();
    }

    public int extractMax() {
        return pq.poll();
    }

    public int getSize() {
        return pq.size();
    }

    public void print() {
        System.out.println(pq);
    }

    public static void main(String args[]) {
//        int[] nums = { 1, 6, 2, 9, 4, 3, 8 };
        int[] nums = {-2147483648,1,1};
        System.out.print(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        ThirdMax heap = new ThirdMax();
        int result;
        heap.insert(nums);
        heap.print();
        if(heap.getSize() >= 3){
            heap.extractMax();
            heap.extractMax();
            result = heap.extractMax();
        } else {
            result = heap.extractMax();
        }
        return result;
    }
}
