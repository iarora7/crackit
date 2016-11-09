package main.java.stacks;

import java.util.Stack;
import java.util.Vector;

public class StackWithMin {
	
	private static Stack<Integer> stack = new Stack<Integer>();
	private static Vector<Integer> mins = new Vector<Integer>(); 
	
	public static void main(String args[]){
		push(5);
		push(2);
		System.out.println("Stack: " + stack);
		System.out.println("Mins: " + mins);
		push(3);
		System.out.println("Stack: " + stack);
		System.out.println("Mins: " + mins);
		push(1);
		System.out.println("Stack: " + stack);
		System.out.println("Mins: " + mins);
		pop();
		System.out.println("Stack: " + stack);
		System.out.println("Mins: " + mins);
		
	}
	
	public static void push(int num) {
		if(mins.isEmpty()){
			mins.add(num); 		// First element
		}else if(mins.lastElement() >= num) {
			mins.add(num);
		}
		stack.add(num);
	}
	
	public static int pop() {
		if(mins.lastElement() == stack.peek()) {
			mins.remove(stack.peek());
		}
		return stack.pop() ; 
	}
	
	public static int min(){
		return mins.lastElement();
	}

}
