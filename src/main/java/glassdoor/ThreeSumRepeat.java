package main.java.glassdoor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by arorai on 3/22/17.
 */
public class ThreeSumRepeat {

    public static void main(String args[]) {
        int[] nums = {-1,2,0,-5,-5,1,10};
//        int[] nums = {-1,5,-4,-4,8,32,2};
        int target = 0;
        System.out.print(threeSum(nums, target));
    }

    private static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++) {
            if(i>0 && nums[i] == nums[i-1]) {   // skip same result
                continue;
            }
            int j=i;
            int k=nums.length-1;
            while(j <= k) {
                if(nums[i] + nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                } else if(nums[i] + nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return res;
    }
}
