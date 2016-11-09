package main.java.dp;

import java.util.ArrayList;

/*
 * List all permutations of a string. Best case time complexity O(n!)
 */
public class StringPermutations {
	
	private static ArrayList<String> permutations;
	
	public static void main(String args[]) {
		String str = "isha";
		permutations = new ArrayList<>();
		permutations = getPerms(str);
		System.out.println(permutations.size());
		for(String word : permutations) {
			System.out.println(word);
		}
	}

	private static ArrayList<String> getPerms(String str) {
		ArrayList<String> permutations = new ArrayList<>();
		if("null".equals(str)) {
			return null;
		}
		
		if(str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0);
		String remainder = str.substring(1);
		ArrayList<String> words = new ArrayList<>();
		words = getPerms(remainder);
		
		for(String word : words) {
			for(int j=0;j<=word.length();j++) {
				permutations.add(insertChar(word, first, j));
			}
		}
		return permutations;
	}

	private static String insertChar(String word, char first, int j) {
		String start = word.substring(0,j);
		String end = word.substring(j);
		return start + first + end;
	}

}
