package main.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by arorai on 3/17/17.
 * Question: list of all triplets that sum upto a target.
 * Complexity: O(n^2)
 */
public class ThreeSum {

    public static void main(String args[]) {
//        int[] nums = {1,5,4,8,32,2};
        int[] nums = {-1,5,-4,-4,8,32,2};
//        int[] nums = {4, 2, -1, 1, -5, 6, -4};
//        int[] nums = {-1,2};
        int finalTarget = 0;
        System.out.print(threeSum(nums, finalTarget));
    }

    public static List<List<Integer>> threeSum(int[] nums, int finaltarget) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            int target = finaltarget - nums[i];
            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
                    while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return res;
    }
}
