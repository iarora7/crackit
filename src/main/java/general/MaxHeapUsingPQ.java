package main.java.general;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeapUsingPQ {
	
	PriorityQueue<Integer> pq;
	
	public MaxHeapUsingPQ() {
		pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
	}
	
	public void insert(int[] arr) {
		for(int i=0; i<arr.length; i++) {
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
		int[] arr = { 1, 6, 2, 9, 4, 3, 8 };
		MaxHeapUsingPQ maxHeap = new MaxHeapUsingPQ();
		maxHeap.insert(arr);
		maxHeap.print();
		System.out.println("Max : " + maxHeap.extractMax());
		maxHeap.print();
	}

}
