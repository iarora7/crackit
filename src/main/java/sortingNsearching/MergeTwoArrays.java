package main.java.sortingNsearching;

/*
 * Merge two sorted arrays. Assume that array A is big enough to hold array B.
 */

public class MergeTwoArrays {
	
	public static void main(String args[]) {
		int[] a = new int[10];
		int[] b = new int[3];
		
		a[0] = 4; a[1] = 8; a[2] = 9;
		b[0] = 2; b[1] = 7; b[2] = 10;
		a = mergeArrays(a,b,3,3);
		for(int i=0;i<6;i++) {
			System.out.println(a[i]);
		}
	}

	/* two arrays a & b and total number of elements in them.*/
	private static int[] mergeArrays(int[] a, int[] b, int i, int j) {
		int n = i+j-1;
		i = i-1;
		j = j-1;
		int k = n;
		while(k>=0 && i>=0 && j>=0){
			if(a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		}
		while(j>=0) {
			a[k--] = b[j--];
		}
		
		return a;
	}

}
