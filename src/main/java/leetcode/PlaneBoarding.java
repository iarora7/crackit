package main.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PlaneBoarding {
	
	private static SortedMap<String, Boolean> allSeats = new TreeMap<String, Boolean>();
	
	public static void main(String args[]) {
		int width = 2, length = 9;
		List<String> passengers = new ArrayList<>();
//		A1,A6,B2,A3,B4,B3,A5*,A7,B1,B5,A2
		passengers.add("A1");
		passengers.add("A6");
		passengers.add("B2");
		passengers.add("A3");
		passengers.add("B4");
		passengers.add("B3");
		passengers.add("A5*");
		passengers.add("A7");
		passengers.add("B1");
		passengers.add("B5");
		passengers.add("A2");
		
		getSeatList(width, length, passengers);
	}

	private static List<String> getSeatList(int width, int length, List<String> passengers) {
		HashMap<String, Boolean> seatsOccupied = new HashMap<>();
		
		storeAllSeats(allSeats, width, length);
		List<String> possibleLazySeats = new ArrayList<>();
		for(String p : passengers) {
			if(p.length()>2) {
				// Check width=2 then A&B only
				
				
				// Check length=9 then A9 max
				if(Character.getNumericValue(p.charAt(1)) > length) {
					System.out.println("Wrong data");
					return null;
				}
				Set<String> keys = allSeats.keySet();
				Iterator i = keys.iterator();
				if(i.hasNext()) {
					String curr = (String)i.next();
					if(allSeats.get(curr)) {
						System.out.println(curr);
					}
				}
			}
			allSeats.put(p, true);
			if(possibleLazySeats.contains(p)) {
				possibleLazySeats.remove(p);
			}
		}
		return null;
	}

	private static void storeAllSeats(SortedMap<String, Boolean> allSeats, int width, int length) {
		char[] letter = {'A', 'B'};
		char[] digit;
		System.out.println("Seats: ");
		for(int i=0; i<length; i++) {
			for(int j=0; j<width; j++) {
				String seat = letter[j] + Integer.toString(i+1);
				allSeats.put(seat, false);
//				System.out.println(seat);
			}
		}
	}

}
