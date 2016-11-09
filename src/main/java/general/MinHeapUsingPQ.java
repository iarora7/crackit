package main.java.general;

import java.util.PriorityQueue;

public class MinHeapUsingPQ {
	
	PriorityQueue<Integer> pq;
	
	public MinHeapUsingPQ() {
		pq = new PriorityQueue<>();
	}
	
	public void insert(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			pq.offer(arr[i]);
		}
	}
	
	public int peek() {
		return pq.peek();
	}
	
	public int extractMin() {
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
		MinHeapUsingPQ minHeap = new MinHeapUsingPQ();
		minHeap.insert(arr);
		minHeap.print();
		System.out.println("Min : " + minHeap.extractMin());
		minHeap.print();
	}

}
