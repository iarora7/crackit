package main.java.stacks;

import java.util.Stack;

public class SortStackRecursion {
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String args[]) {
		initStack();
		System.err.println(stack);
		sortStack();
		System.err.println(stack);
	}

	private static void sortStack() {
		if(!stack.isEmpty()) {
			int temp = stack.pop();
			sortStack();
			sortedInsert(temp);
		}
	}

	private static void sortedInsert(int item) {
		if(stack.isEmpty()) {
			stack.push(item);
		} else if(stack.peek() < item) {
			stack.push(item);
		} else {
			int temp = stack.pop();
			sortedInsert(item);
			stack.push(temp);
		}
	}

	private static void initStack() {
		stack.push(30);
		stack.push(-5);
		stack.push(23);
		stack.push(14);
		stack.push(-3);
	}
}
