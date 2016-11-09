package main.java.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		StringBuilder revString = new StringBuilder();
		for(int i=input.length()-1; i>=0; i--){
			revString.append(input.charAt(i));
		}
		System.out.println("Reveresed string: " + revString.toString());
		scan.close();
	}
}
