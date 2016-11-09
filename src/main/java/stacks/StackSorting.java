package main.java.stacks;

import java.util.Stack;

public class StackSorting {
	
	public static void main(String args[]){
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(8);

		System.out.println("Original stack : " +s );
		s = sortStack(s);
		System.out.println("Sorted stack : " +s );
		s.pop();
		System.out.println("Sorted stack : " +s );
	}

	private static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		int temp;
		while(!s.isEmpty()){
			temp = s.pop();
			while(!r.isEmpty() && r.peek() > temp){
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
	}
	
	/*
	 * Another method for sorting (not better than earlier one)
	 * 
	 * private void sortStack() {
		int temp;

		while(!s1.isEmpty()) {
			temp =  s1.pop();
			if(!s1.isEmpty() && temp <  s1.peek()) {
				s2.push(temp);
			} else {
				while (!s2.isEmpty() && (s2.peek() < temp)) {
					s1.push(s2.pop());
				}
				s2.push(temp);
			}
		}
		
	}
	 */
}
