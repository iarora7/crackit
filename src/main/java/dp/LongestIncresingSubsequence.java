package main.java.dp;

/*
 * Find the longest subsequence which is sorted in increasing order
 */
public class LongestIncresingSubsequence {
	
	public static void main(String args[]) {
		int[] arr = {10,22,9,33,21,50,41,60,80};
		int n = findLongestIncresingSubsequence(arr);
		System.out.println("lis is: " + n);
	}

	private static int findLongestIncresingSubsequence(int[] arr) {
		int n = arr.length;
		int m[] = new int[n];
		for(int i=0; i<n; i++) {
			m[i] = 1;
		}
		
		for(int i=0; i< n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] > arr[j] && m[i] < m[j] + 1){
					m[i] = m[j] + 1;
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(max < m[i])
				max = m[i];
		}
		return max;
	}

}
