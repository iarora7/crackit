package main.java.strings;
import java.util.Scanner;

public class ReverseStringWords {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		
		String[] ip = input.split(" ");
		reverseWords(ip);
	}

	private static void reverseWords(String[] ip) {
		int i=0, j=ip.length-1;
		String temp;
		if(i<j){
			temp = ip[i];
			ip[i] = ip[j];
			ip[j] = temp;
			i++; j--;
		}
		for(String word : ip){
			System.out.print(word + " ");
		}
	}
	// See also : http://www.programcreek.com/2014/05/leetcode-reverse-words-in-a-string-ii-java/
}
