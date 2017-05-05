package main.java.leetcode;

public class ReverseString {
	
	public static void main(String args[]) {
		String s =  "   a child is playing ";
		
		System.out.println("Revered string:" + reverseString(s));
	}

	private static String reverseString(String s) {
		s = s.trim();
		s.replace('\t', ' ');
		
		String arr[] = s.split(" ");
		String rev = "";
		for(int i=arr.length-1; i>=0; i--) {
			if(!arr[i].equals("")) {
				rev += arr[i];
				if(i>0)
					rev += " ";
			}
		}
		return rev;
 	}
}
