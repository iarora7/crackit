package main.java.stacks;

import java.util.Stack;

public class SortedStack {
	Stack<Integer> s1, s2;
	String currStack;
	
	SortedStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		currStack = "s1";
		s1.push(5);
		s1.push(30);
		s1.push(10);
		s1.push(20);
		s1.push(15);
	}

	public static void main(String args[]) {
		SortedStack st = new SortedStack();
		System.out.println("Initial Stack:");
		st.print();
		st.sortStack();
		st.print();
	}
	
	private void sortStack() {
		int temp;

		while(s1.size() > 0) {
			temp =  s1.pop();
			if(s1.size() > 0 && temp <  s1.peek()) {
				s2.push(temp);
			} else {
				while (s2.size() > 0 && (s2.peek() < temp)) {
					s1.push(s2.pop());
				}
				s2.push(temp);
			}
		}
		
	}
	
	public void print() {
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
	
}
