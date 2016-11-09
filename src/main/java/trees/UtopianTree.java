package main.java.trees;

import java.util.Scanner;

public class UtopianTree {

	public static int getHeight(int n){
		int height = 1;
		
		for (int i = 0 ; i< n ; i++) {
	        if ( i % 2 == 0 )
	            height *= 2;
	        else 
	            height += 1;
		}
		return height;
	}

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
		int n = 4;
		int[] cycles = new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.println(getHeight(i)); //in.nextInt()
		}
	}
}