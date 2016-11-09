package main.java.leetcode;

/*
 * Divide a number without using using multiplication, division and mod operator
 */

public class DivideNumber {
	
	public static void main(String args[]) {
		int dividend = -1;
		int divisor = 1;
		int quotient = divide(dividend, divisor);
		System.out.println(quotient);
	}

	private static int divide(int dividend, int divisor) {
		int q = 0;
		if(dividend < dividend) {
			return 0;
		}
		while(dividend >= divisor) {
			q += 1;
			dividend -= divisor;
		}
		return q;
	}

}


