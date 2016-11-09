package main.java.leetcode;

/*
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 
 * P   A   H   N
   A P L S I I G
   Y   I   R	
 */

public class ZigZagConversion {
	
	public static void main(String args[]) {
		String str = "PAYPALISHIRING";
//		String str = "ABCD";
		int rowCount = 3; //3;
		String convertedStr = convert(str,rowCount);
		System.out.println(convertedStr);
	}

	private static String convert(String s, int numRows) {
		if(numRows==1) {
			return s;
		}
		
		int len = s.length();
		StringBuilder arr[] = new StringBuilder[numRows];
		
		for(int i=0; i<numRows; i++) {
			arr[i] = new StringBuilder();
		}
		
		int row=0;
		boolean down = true;
		
		for(int i=0; i<len; i++) {
			arr[row].append(s.charAt(i));
			
			if(row == numRows-1) {
				down = false;
			} else if(row==0) {
				down = true;
			}
			
			row = (down) ? (++row) : (--row);
		}
		StringBuilder convertedStr = new StringBuilder();
		for(int i=0;i<numRows;i++) {
			convertedStr.append(arr[i]);
		}
		return convertedStr.toString();
	}

}
