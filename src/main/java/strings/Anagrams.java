package main.java.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
	
	public static void main(String args[]){
		String str1 = "heolo";
		String str2 = "heloo";
		
		String res = checkAnagrams(str1, str2) ? "Anagrams!":"Not Anagrams!!";
		System.out.println(res);
	}

	/* Algo: 
	 * 1. Check if either/both strings are empty
	 * 2. Convert strings in char arrays
	 * 3. take string1 and make hash map of all characters
	 * 4. take string 2 and delete characters from previous hash map
	 * 5. after both the operations, if hash map has zero character count then anagrams else not.
	 * */
	 
	private static boolean checkAnagrams(String str1, String str2) {
		if(str1 == null || str2 == null) {
			System.out.println("Either or both the string are empty.");
			return false;
		}
		if(str1.length() != str2.length())
			return false;
		
		char[] s = str1.toCharArray();
		char[] t = str2.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i< str1.length(); i++){
			if(map.containsKey(s[i])){
				map.put(s[i], map.get(s[i])+1);
			} else {
				map.put(s[i], 1);
			}
		}
		for(int i=0;i<str2.length();i++){
			if(map.containsKey(t[i])){
				int value = map.get(t[i])-1;
				if(value < 0){
					return false;
				} else 
					map.put(t[i], value);
			} else {
				return false;
			}
		}
		for(Map.Entry<Character, Integer> entity : map.entrySet()){
			System.out.println(entity.getKey() + " - " + entity.getValue());
		}
		return true;
	}

}
