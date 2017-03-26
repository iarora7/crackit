package main.java.glassdoor;

/**
 * Created by arorai on 3/22/17.
 */
public class Fibonacci {

    public static void main(String args[]) {
        int n = 10;
        for (int i: fibonacciSeries(n)) {
            System.out.print(i + " ");
        }
    }

    private static int[] fibonacciSeries(int n) {

        int[] res = new int[n];
        if(n == 0) return res;
        if(n == 1) {
            res[0] = 0;
            return res;
        }
        res[0] = 0;
        res[1] = 1;
        for(int i=2; i<n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res;
    }
}
