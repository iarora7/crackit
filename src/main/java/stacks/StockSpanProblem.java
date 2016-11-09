package main.java.stacks;

import java.util.Stack;

/*
 * The span Si of the stock’s price on a given day i is defined as 
 * the maximum number of consecutive days just before the given day, 
 * for which the price of the stock on the current day is less than 
 * or equal to its price on the given day.
 * 
 * http://www.geeksforgeeks.org/the-stock-span-problem/
 */
public class StockSpanProblem {
	
	public static void main(String args[]) {
		int arr[] = {100, 80, 60, 70, 60, 75, 85};
		stockSpan(arr);
	}

	private static void stockSpan(int[] arr) {
		int s[] = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		s[0] = 1;
		st.push(0);	// First element being the highest in beginning.
		for(int i=1;i<arr.length;i++){
			while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
				st.pop();
			}
			s[i] = st.isEmpty() ? (i+1) : (i-st.peek());
			st.push(i);
		}

		for(int i : s) {
			System.out.print(i + " ");
		}
		
	}

}
