package main.java.dp;

import java.util.Arrays;

/*
 * Print the number of steps a child will take if he can hop 1/2/3 steps. 
 */

public class StepCountWays {
	
	public static void main(String args[]) {
		int n = 4;
		int[] map = new int[n+1];
		Arrays.fill(map, -1);
		System.out.println("Total number of ways: " + countways(n, map));
	}

	private static int countways(int n, int[] map) {
		
		if(n < 0) {
			return 0;
		} else if(n==0) {
			return 1;
		} else  if(map[n] > -1) {
			return map[n];
		} else {
			return countways(n-1, map) +
					countways(n-2, map) + 
					countways(n-3, map);
		}
	}

}
