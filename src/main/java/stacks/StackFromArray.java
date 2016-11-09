package main.java.stacks;

/*
 * Design k stack using a simple array -- Geeks Solution
 */

public class StackFromArray {
	
	int n = 10, k = 3;
	int arr[] = new int[n];
	int top[] = new int[k];
	int next[] = new int[n];
	int free = 0;
	
	StackFromArray() {
		
		for(int i=0; i<k; i++){
			top[i] = -1;
		}
		
		for(int i=0; i<n; i++){
			next[i] = i+1;
		}
		
		next[n-1] = -1; // -1 is used to indicate end of free list
	}
	
	public static void main(String args[]) {
		StackFromArray stack = new StackFromArray();
		
		   	stack.push(15, 2);
		    stack.push(45, 2);
		 
		    // Let us put some items in stack number 1
		    stack.push(17, 1);
		    stack.push(49, 1);
		    stack.push(39, 1);
		 
		    // Let us put some items in stack number 0
		    stack.push(11, 0);
		    stack.push(9, 0);
		    stack.push(7, 0);
		    
		    System.out.println("Pop from stack 2: " + stack.pop(2));
		    System.out.println("Pop from stack 1: " + stack.pop(1));
		    System.out.println("Pop from stack 0: " + stack.pop(0));
	}
	
	void push(int num, int sn) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		
		int i = free;
		free = next[i];
		next[i] = top[sn];
		
		top[sn] = i;
		arr[i] = num;
		
	}
	
	int pop(int sn) {
		if(isEmpty(sn)){
			System.out.println("Stack Underflow.");
			return -1;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = free;
		free = i;
		
		return arr[i];
	}

	private boolean isFull() {
		return (free == -1);
	}
	
	private boolean isEmpty(int sn) {
		return (top[sn] == -1);
	}

}
