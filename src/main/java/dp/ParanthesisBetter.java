package main.java.dp;

import java.util.ArrayList;

/*
 * Mindblowing solution. Simple syntax but recursion handles all cases.
 */

public class ParanthesisBetter {
	private static ArrayList<String> list = new ArrayList<>();
	
	public static void main(String args[]){
		int n=4;
		getParen(n);
	}

	private static void getParen(int n) {
		char[] str = new char[2*n];
		getParanthesis(str, n, n, 0);
		System.out.println(list.size());
		for(String item : list) {
			System.out.println(item);
		}
	}

	private static void getParanthesis(char[] str, int leftCtr, int rightCtr, int i) {
		if(leftCtr<0 || rightCtr < leftCtr){
			return;
		}
		
		if(leftCtr==0 && rightCtr==0) {
			String s = String.copyValueOf(str);
			list.add(s);
		} else {
			if(leftCtr > 0) {
				str[i] = '(';
				getParanthesis(str, leftCtr-1, rightCtr, i+1);
			}
			
			if(rightCtr > leftCtr) {
				str[i] = ')';
				getParanthesis(str, leftCtr, rightCtr-1, i+1);
			}
		}
	}

	

}
