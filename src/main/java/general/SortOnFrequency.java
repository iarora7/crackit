package main.java.general;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Sort the numbers based on frequency of their occurances
 */
public class SortOnFrequency {

	public static void main(String args[]) {
		int[] arr = { 2, 1, 2, 4, 3, 3, 1, 2, 3, 3, 1, 1 };
		int[] sortedArray = sortOnFreq(arr);
		for(int x : sortedArray)
			System.out.print(x + ", ");
	}

	private static int[] sortOnFreq(int[] arr) {
		int[] sortedArray = new int[arr.length];
		int j=0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				map.put(arr[i], 1);
			}
		}
		Map<Integer, Integer> sortedMap = sortByValue(map);
		for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			for(int i=0; i<entry.getValue(); i++) {
				sortedArray[j++] = entry.getKey();
			}
		}
		return sortedArray;
	}

	// Custom comparator to sort map based on values
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

}
