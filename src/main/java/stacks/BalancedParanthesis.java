package main.java.stacks;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static Stack<Character> stack = new Stack<Character>();
	
	public static void main(String args[]) {
		String exp = "{()}[((){}[])]";
		boolean balaned = areParanthesisBalanced(exp);
		System.out.println(exp + " is balanced? " + balaned);
	}

	private static boolean areParanthesisBalanced(String exp) {
		for(int i=0; i<exp.length(); i++){
			char c = exp.charAt(i);
			if('(' == c || '{' == c || '[' == c) {
				stack.push(c);
			} else {
				if(!isMatchingPair(c)) {
					return false;
				}
			}
		}
		if(stack.size() != 0){
			return false;
		}
		return true;
	}

	private static boolean isMatchingPair(char c) {
		char ch = 'a';
		switch(c) {
		case ')' : ch='('; break;
		case '}' : ch='{'; break;
		case ']' : ch='['; break;
		}
		if(ch != stack.peek()) {
			return false;
		}
		stack.pop();
		return true;
	}


}
