package main.java.general;

/*
 * Given an array of numbers, make sure the sum of set of nums is never less than 1 
 * {-5, 1, 4, -1, -6, -1} - least positive number(magicNumber) to keep summation >1 is 9 
 */

public class PositiveSum {
	
	public static void main(String args[]) {
		int[] arr = {-5, 1, 4, -1, -6, -1};
		int magicNumber = findPositiveSumNum(arr);
		System.out.println("Magic number:" + magicNumber);
	}

	private static int findPositiveSumNum(int[] arr) {
		int n = arr.length;
		int[] m = new int[n];
		m[0] = Math.abs(arr[0]) + 1;
		for(int i=1; i<n; i++) {
			int currsum = 0;
			for(int j=0; j<=i; j++) {
				currsum += arr[j];
			}
			currsum = Math.abs(currsum);
			if(currsum+1 > m[i-1]){
				m[i] = currsum+1;
			} else {
				m[i] = m[i-1];
			}
			System.out.println("m["+i+"]="+m[i]);
		}
		return m[n-1];
	}

}
