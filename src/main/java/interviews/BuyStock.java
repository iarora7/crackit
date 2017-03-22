package main.java.interviews;

/**
 * Created by Shivalik Narad on 3/20/2017.
 */
public class BuyStock {

    public static int maximumProfit(int[] prices) {
        //if the prices array is null or has 1 or less elements we will simply return 0
        if (prices == null || prices.length <= 1) return 0;

        int minPrice = prices[0]; // initialize the first price as minPrice
        int maxProf = 0; // initialize maxProf to 0

        // iterate over the price array once this will guarantee O(n)
        // because each element in the price array will be traversed only once
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < minPrice) { // set the minPrice to new value if the current price is lower than minPrice
                minPrice = prices[i];
            } else { // calculate the currentProf if current price is greater than the set minPrice
                int currentProf = prices[i] - minPrice;
                maxProf = Math.max(maxProf, currentProf); // set the maxProf to highest profit
            }
        }
        return maxProf;
    }

    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 6, 4, 3, 1};
//        int[] prices = {25,30,48,15,25,45,10,25};
//        int[] prices = {1,2,3,4}; // 3
//        int[] prices = {4,3,2,1}; // 0
//        int[] prices = {1,1,1,1}; // 0
        //int[] prices = {1,2,1,2}; // 1
        //int[] prices = {}; // 0
        int[] prices = null;
        int maxProf = maximumProfit(prices);

        System.out.println("Maximum profit : " + maxProf);
    }
}