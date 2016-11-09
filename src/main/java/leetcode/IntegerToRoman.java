package main.java.leetcode;

/*
 * Another solution is here: https://discuss.leetcode.com/topic/57928/10ms-and-short-java-solution
 */

public class IntegerToRoman {
	
	public static void main(String args[]) {
		int num = 1009;
		System.out.println(convertToRoman(num));
	}

	private static String convertToRoman(int n) {
		String M[] = {"", "M", "MM", "MMM" };
		String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		return M[n/1000] + C[(n%1000)/100] + X[(n%100)/10] + I[n%10];
	}

}
