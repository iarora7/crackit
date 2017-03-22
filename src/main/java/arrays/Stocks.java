package main.java.arrays;

/**
 * Created by arorai on 3/12/17.
 * int[] s = {25,30,48,15,25,45,10,25};
 */
public class Stocks {

    public static void main(String args[]) {
        int[] s = {-4,3,2,1};
        System.out.print(maxProfit(s));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0 ;
        }
        int max = 0 ;
        int sofarMin = prices[0] ;
        for (int i = 0 ; i < prices.length ; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin) ;
            } else {
                sofarMin = prices[i];
            }
        }
        return  max ;
    }
}
