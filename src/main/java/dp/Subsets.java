package main.java.dp;

import java.util.ArrayList;

/*
 * return all subsets of a set. CTCI solution.
 * 
 * The other method exist with cloning the subsets and adding the new item to create new subsets.
 */

public class Subsets {
	private static ArrayList<Integer> set = new ArrayList<>();
	private static ArrayList<ArrayList<Integer>> allSets;
	
	public static void main(String args[]) {
		set.add(1); set.add(2);
		allSets = getSets(set);
		
		for(ArrayList<Integer> subset : allSets) {
			System.out.println(subset.toString());
		}
	}
	
	private static ArrayList<ArrayList<Integer>> getSets(ArrayList<Integer> set) {
		int max = set.size() << 1;
		ArrayList<ArrayList<Integer>> allSets = new ArrayList<>();
		for(int i=0; i<max; i++) {
			ArrayList<Integer> subset = getSetFromInteger(set, i);
			allSets.add(subset);
		}
		return allSets;
	}

	private static ArrayList<Integer> getSetFromInteger(ArrayList<Integer> set, int i) {
		int index = 0;
		ArrayList<Integer> subset = new ArrayList<>();
		for(int k=i; k>0; k>>=1){
			if((k&1) == 1) {
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
	}

}
