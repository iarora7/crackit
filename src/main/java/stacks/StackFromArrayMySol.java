package main.java.stacks;

import java.util.Stack;

public class StackFromArrayMySol extends Stack{
	
	/*
	 * Implement 3 stacks using array.
	 * Approach : Divide the array into 3 equal sized arrays and maintain the top for each array. 
	 * You just need to calculate the actual array index using absStackTop() to perform push and pop operations.
	 */
	
	private static final int size = 5;	// size of each stack
	private static final int n = 3;	// number of stacks
	private static int top[] = {-1, -1, -1};
	private static int arr[] = new int[size * n];
	
	public static void main(String args[]) {
		try {
//			System.out.println("Pop element from empty array.");
//			pop(2);
			
			System.out.println("Stack 1 is empty? " + isEmpty(0));
			
			System.out.println("Entering 1,2,3 in respective stacks.");
			push(1, 0);
			push(2, 1);
			push(3, 2);
			
			System.out.println("Stack 1 is empty? " + isEmpty(0));
			
			System.out.println("Peeking in stacks stacks.");
			System.out.println("peek(0) : " + peek(0));
			System.out.println("peek(1) : " + peek(1));
			System.out.println("peek(2) : " + peek(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught: " + e);
			e.printStackTrace();
		}
	}
	
	private static void push(int value, int stackNumber) throws Exception{
		if(top[stackNumber] < size) {
			top[stackNumber]++;
			arr[absStackTop(stackNumber)] = value;
		} else {
			throw new Exception("Stack " + stackNumber + " is full!");
		}
	}
	
	private static int pop(int stackNumber) throws Exception{
		if(top[stackNumber] < 0) {
			throw new Exception("Stack " + stackNumber + " is empty!");
		} else {
			int value = arr[absStackTop(stackNumber)];
			arr[absStackTop(stackNumber)] = 0;
			top[stackNumber]--;
			return value;
		}
	}
	
	private static int peek(int stackNumber) {
			return arr[absStackTop(stackNumber)];
	}
	
	private static boolean isEmpty(int stackNumber) {
		return top[stackNumber] == -1;
	}
	
	private static int absStackTop(int stackNumber) {
		return stackNumber * size + top[stackNumber];
	}

}
