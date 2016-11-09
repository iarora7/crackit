package main.java.undone;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
	
	public static void main(String args[]) {
		// create priority queue
		PriorityQueue<Integer> prq = new PriorityQueue<Integer>();

		// insert values in the queue
		prq.add(6);
		prq.add(9);
		prq.add(5);
		prq.add(64);
		prq.add(6);
		prq.add(7);

		System.out.println("Priority queue values are: " + prq);

		// create comparator
//		Comparator comp = prq.comparator();

//		System.out.println("Comparator value is: " + comp);
	}

}
