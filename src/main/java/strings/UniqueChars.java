package main.java.strings;

import java.util.Scanner;

public class UniqueChars {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string with all unique characters: ");
		String userString = scan.next();
		System.out.print("your input string: " + userString + " is");
		System.out.println(isUnique(userString)? " unique." : " not unique.");
		
		scan.close();
	}
	
	public static boolean isUnique(String userString){
		if(userString.length() > 26){
			return false;
		}
		int checker = 0;
		for(int i = 0; i < userString.length(); i++){
			int val = userString.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
}
