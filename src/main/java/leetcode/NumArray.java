package main.java.leetcode;

public class NumArray {
	
	private static int[] nums = {-2,0,3,-5,2,-1};
	NumArray() {
	}
	
	public static void main(String args[]) {
		for(int i=1; i<nums.length; i++) {
			nums[i] += nums[i-1];
		}
		System.out.println(sumRange(0,2));
		System.out.println(sumRange(2,5));
		System.out.println(sumRange(0,5));
	}

	private static int sumRange(int i, int j) {
		if(i==0) {
			return nums[j];
		}
		return nums[j] - nums[i-1];
	}

}
