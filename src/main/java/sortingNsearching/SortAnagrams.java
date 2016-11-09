package main.java.sortingNsearching;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Sort an array of strings and keep anagrams together.
 * Below implementation takes O(nlogn)
 */

public class SortAnagrams {
	
	public static void main(String args[]){
		SortAnagrams sortAnagram = new SortAnagrams();
		String[] arr = {"isha", "asd", "sahi", "naim", "main", "sda"};
		Arrays.sort(arr, sortAnagram.new AnagramComparator());
		for(String word : arr) {
			System.out.println(word);
		}
 	}
	
	public class AnagramComparator implements Comparator<String> {
		
		public String sortChars(String s) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}

		@Override
		public int compare(String o1, String o2) {
			return sortChars(o1).compareTo(sortChars(o2));
		}
		
	}

}
