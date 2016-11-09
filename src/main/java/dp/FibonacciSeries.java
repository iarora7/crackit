package main.java.dp;

public class FibonacciSeries {
	private static int MAX = 100;
	private static int[] lookup = new int[MAX];
	
	public static void main(String args[]) {
		int n=9;
		for(int i=0; i< MAX; i++) {
			lookup[i] = -1;
		}
		System.out.println("Fib number " + fibonacciSeries(n));
		
		System.out.println("Fibonacci number iterative: " + fibonacciItr(n));
	}

	private static int fibonacciItr(int n) {
		int[] arr = new int[100];
		arr[0] = 0; arr[1] = 1;
		for(int i=2;i<=n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}

	// Recursive solution
	private static int fibonacciSeries(int n) {
		if(lookup[n] == -1) {
			if(n<=1) {
				return n;
			}
			lookup[n] = fibonacciSeries(n-1) + fibonacciSeries(n-2);
		}
		
		return lookup[n];
	}

}
