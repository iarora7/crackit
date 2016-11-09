package main.java.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	/* O(n) complexity */
    public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index + 1 ;
				result[1] = i+1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
    }
    
    public static void main(String[] args){
    	System.out.println("Entering string 23,42,5,72,85,18");
    	int[] numbers = {23,42,5,72,85,15};
    	int target = 90;
    	
    	int[] res = twoSumSort(numbers, target);
    	int[] result = twoSum(numbers, target);
//    	Non zero based indices.
    	System.out.println("Output indices:" + result[0] + ", " + result[1] + " --- "
    						+ numbers[result[0]-1] + " and " + numbers[result[1]-1]);
    }

    /* O(nlogn)*/
	private static int[] twoSumSort(int[] numbers, int target) {
		int[] res = new int[2];
		Arrays.sort(numbers);
		int i=0, j=numbers.length-1;
		while(i!=j){
			if(numbers[i] + numbers[j] > target)
				j--;
			else if(numbers[i] + numbers[j] < target)
				i++;
			else {
				res[0] = i+1;
				res[1] = j+1;
				break;
			}
		}
		System.out.println("Sorted 2 sum result: " + res[0] + ", " + res[1]);
		return res;
	}

}
