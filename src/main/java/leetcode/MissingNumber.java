package main.java.leetcode;

public class MissingNumber {
	
	public static void main(String args[]){
		int[] nums = {0,2};
		System.out.println(missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = ((n)*(n+1))/2;
		int arrSum=0;
		for(int i=0;i<nums.length;i++){
			arrSum = arrSum + nums[i];
		}
		return sum - arrSum;
	}

}
