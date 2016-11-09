package main.java.stacks;

import java.util.Stack;

public class InfixToPostfix {
	public static Stack<Character> op = new Stack<Character>();
	
	public static void main(String args[]) {
		String exp = "a+b*c+d";
		String exp2 ="a+b*(c^d-e)^(f+g*h)-i";
		convertInfixToPostfix(exp);
	}

	private static void convertInfixToPostfix(String exp) {
		
		for(int i=0; i<exp.length(); i++){
			char c = exp.charAt(i);
			if(isOperand(c)){
				printChar(c);
			} else if('(' == c){
				pushToStack(c);
			} else if(')' == c) {
				popFromStack(c);
			} else if(op.isEmpty()) {
				pushToStack(c);
			} else if(prec(c) >= prec(op.peek())) {
				pushToStack(c);
			} else {
				popFromStack(c);
			}
		}
		popAll();
	}

	private static void popAll() {
		while (!op.isEmpty()) {
			printChar(op.pop());
		}
	}

	private static int prec(char c) {
		switch(c) {
		case '+' :
		case '-' :
			return 0;
		case '*' :
		case '/' :
			return 1;
		case '^' :
			return 2;
		}
		return -1;
	}

	private static void popFromStack(char c) {
		if(')' == (c)) {
			while('(' != (op.peek())) {
				printChar(op.pop());
			}
			op.pop();
		} else {
			while(!op.isEmpty() && prec(c) <= prec(op.peek())) {
				printChar(op.pop());
			}
			op.push(c);
		}
		
	}

	private static void pushToStack(char c) {
		op.push(c);
//		System.out.println("Stack: " + op.toString());
	}

	private static boolean isOperand(char c) {
		return (c>='a' && c<='z' || c>='A' && c<='Z');
	}

	private static void printChar(char c) {
		System.out.print(c);
	}

}
