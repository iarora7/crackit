package main.java.stacks;

import java.util.Stack;

public class PostfixEvaluation {
	
	public static void main(String args[]){
		char exp[] = {'2','3','1','*','+','9','-'};
		
		int result = evaluatePostfix(exp);
		System.out.println(result);
	}

	private static int evaluatePostfix(char[] exp) {
		Stack<Integer> stack = new Stack<Integer>();
		int c=0;
		for(int i=0; i<exp.length; i++){
			if(Character.isDigit(exp[i])) {
				stack.push((int)exp[i] - 48);
			} else if(stack.size() >= 2) {
				int op2 = stack.pop();
				int op1 = stack.pop();
				switch(exp[i]) {
					case '+' : c = op1+op2; break;
					case '-' : c = op1-op2; break;
					case '*' : c = op1*op2; break;
					case '/' : c = op1/op2; break;
				}
				stack.push(c);
			}
		}
 		return stack.peek();
	}

}
