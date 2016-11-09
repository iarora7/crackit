package main.java.bitwiseOp;

public class Swap {
	
	/* Swap two elements using XOR bitwise operation. */
	
	public static void main(String args[]){
		int a=5, b=9;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		double x =2, y=3;
		
//		x=x^y;
//		y=x^y;
//		x=x^y;
		
		System.out.println("x="+ x + "    y=" + y);
	}

}
