package main.java.interviews;

/**
 * Created by arorai on 3/30/17.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
