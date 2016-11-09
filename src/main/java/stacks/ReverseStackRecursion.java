package main.java.stacks;

import java.util.Stack;

/*
 * Reverse a stack using recursion.
 */

public class ReverseStackRecursion {
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main(String args[]) {
		initStack();
		printStack();
		reverseStack();
		printStack();
	}

	private static void printStack() {
		System.out.println(stack);
		
	}

	private static void reverseStack() {
		if(!stack.isEmpty()){
			int temp = stack.pop();
			reverseStack();
			insertAtBottom(temp);
		}
		
	}

	private static void insertAtBottom(int item) {
		if(stack.isEmpty()) {
			stack.push(item);
		} else {
			int temp = stack.pop();
			insertAtBottom(item);
			stack.push(temp);
		}
	}

	private static void initStack() {
		stack.push(5);
		stack.push(15);
		stack.push(25);
		stack.push(35);
	}

}
