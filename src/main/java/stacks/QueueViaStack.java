package main.java.stacks;

import java.util.Stack;

/* Implement a queue via stack */

public class QueueViaStack {
	
	Stack<Integer> s1, s2;
	String currStack; 

	QueueViaStack(){
		
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		currStack = "s1";
	}
	
	public static void main(String args[]){
		QueueViaStack q = new QueueViaStack();
		q.pop();
		System.out.println("Stack1 elements: " + q.s1);
		System.out.println("Stack2 elements: " + q.s2);
		q.push(10);
		System.out.println("Stack1 elements: " + q.s1);
		System.out.println("Stack2 elements: " + q.s2);
		q.push(20);
		q.push(30);
		q.pop();
		q.push(40);
		q.pop();
		q.pop();
		q.pop();
		q.pop();
		System.out.println("Stack1 elements: " + q.s1);
		System.out.println("Stack2 elements: " + q.s2);
	}
	
	public void push(int num) {
		if("s1".equals(currStack)){
			s1.push(num);
		} else {
			shiftStack();
			currStack = "s1";
			push(num);
		}
//		System.out.println("push("+num+")");
	}
	
	public int pop() {
		int value;
		if("s2".equals(currStack)) {
			if(s2.size() > 0) {
				value = s2.pop();
			} else {
				value = Integer.MIN_VALUE;
				System.err.println("Queue underflow!");
			}
				
		} else {
			shiftStack();
			currStack = "s2";
			value = pop();
		}
//		System.out.println("pop(" + value + ")");
		return value;
	}

	private void shiftStack() {
		if("s1".equals(currStack)) {
			while(s1.size() > 0) {
				s2.push(s1.pop());
			}
		} else {
			while(s2.size() > 0) {
				s1.push(s2.pop());
			}
		}
	}
}
