package main.java.dp;

import java.util.HashSet;
import java.util.Set;

/*
 * Write down all valid parenthesis combinations.
 * With duplicate strings(avoided using Set).
 */

public class Parentheses {
	
	public static void main(String args[]) {
		int n = 3;
		Set<String> allParens = getParens(n);
		for(String paren : allParens) {
			System.out.println(paren);
		}
	}

	private static Set<String> getParens(int n) {
		Set<String> set = new HashSet<>();
		if(n==0){
			set.add("");
			return set;
		}
		Set<String> prevParens = getParens(n-1);
		for(String paren : prevParens) {
			for(int i=0; i<paren.length(); i++) {
				if(paren.charAt(i) == '(') {
					String s = insertInside(paren, i);
					set.add(s);
				}
			}
			if(!set.contains("()"+paren)) {
				set.add("()"+paren);
			}
		}
		return set;
	}

	private static String insertInside(String paren, int i) {
		String start = paren.substring(0, i+1);
		String end = paren.substring(i+1);
		return start + "()" + end;
	}

}
