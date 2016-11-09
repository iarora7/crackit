package main.java.strings;

import java.util.BitSet;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class RemoveDuplicatesString {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine().toLowerCase();
//		System.out.println("unique: " + removeDuplicatesBitSet(input));
		removeDupsHashTable(input);
		scan.close();
	}
	
	/* Maintain a HashTable for all newly found characters*/
	private static void removeDupsHashTable(String input) {
		Hashtable charSet = new Hashtable<>();
		for (int i=0;i<input.length();i++) { 
			char ch = input.charAt(i);
			if(!charSet.containsKey(ch)){
				charSet.put(ch, true);
				System.out.println(ch + " added to hash table.");
			}
		}
		Enumeration e = charSet.keys();
	    while (e.hasMoreElements())
	      System.out.print(e.nextElement());
	}

	public static String removeDuplicatesBitSet(String string) { 
		BitSet bitset = new BitSet(26); 
		StringBuilder result = new StringBuilder(); 
		for (int i=0;i<string.length();i++) { 
			char ch = string.charAt(i); 
			int pos = ch - 'a'; 
			if (!bitset.get(pos)) { 
				bitset.set(pos); 
				result.append(ch); 
			}
		} 
		return result.toString(); 
	}


}
