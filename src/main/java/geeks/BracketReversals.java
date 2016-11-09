package main.java.geeks;

import java.util.Stack;

/*
 * Minimum number of bracket reversals required to balance the string
 */
public class BracketReversals {
	
	public static void main(String args[]) {
		String exp = "}{{}}{{{"; // {{{} 1, {{{{ 2, }{{}}{{{ 3
		int num = countBracketReversal(exp);
		System.out.println(num==-1 ? "Cannot be reversed" : num + " reversals required");
	}

	private static int countBracketReversal(String exp) {
		// Check if exp is even string
		if(exp.length()%2 != 0){
			return -1;
		}
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i< exp.length(); i++){
			char c = exp.charAt(i);
			if(c == '{'){
				stack.push(c);
			} else if(c == '}') {
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				} else {
					stack.push(c);
				}
			} else {
				return -1;
			}
		}
		System.out.println(stack.toString());
		double open=0, close=0;
		int turns=-1;
		while(!stack.isEmpty()) {
			char c = stack.pop();
			if(c == '{') {
				open++;
			} else if(c == '}') {
				close++;
			}
		}
		turns = (int) (Math.ceil(open/2) + Math.ceil(close/2));
		
		return turns;
	}

}
