package main.java.arrays;

import java.util.Scanner;

public class SubArraySum {
	
	public static void main(String[] args){
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int n = arr.length;
		int sum = 33;
		
		System.out.println("Choose among the following menu:");
		System.out.println("1: Find sub array equal to target sum");
		System.out.println("2: Find two elements in array whose sum equal target sum");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter either 1 or 2: ");
		int option = scan.nextInt();
		switch(option){
		case 1: findSubArray(arr, n, sum);
			break;
		case 2: findElements(arr, n, sum);
			break;
		default : System.out.println("Invalid option!");
		}
	}

	private static void findElements(int[] arr, int n, int sum) {
		System.out.println("http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/");
	}

	private static void findSubArray(int[] arr, int n, int sum) {
		int curr_sum = arr[0], start=0, i;
		boolean found = false;
		
		for (i=1; i<=n; i++){
			while(curr_sum > sum && start < i-1){
				curr_sum -= arr[start];
				start++;
			}
			if(curr_sum == sum){
				System.out.println("Sum found in index: " + start + ", " + (i-1));
				found = true;
			}
			if(i<n){
				curr_sum += arr[i];
			}
		}
		if(!found){
			System.out.println("No array found!" + i);
		}
		
	}

	

	
}
