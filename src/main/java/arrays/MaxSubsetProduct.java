package main.java.arrays;

public class MaxSubsetProduct {
	
	public static void main(String[] args){
		int[] a = {-2, -3, 4, 0, 5, 5, -1, -2};
		int max_product = maxProduct(a);
		System.out.println("Maximum Subset Product: " + max_product);
	}

	private static int maxProduct(int[] a) {
		int current_max, current_min, global_max;
		current_max = current_min = global_max = a[0];
		for(int i=1; i<a.length; i++){
			int temp = current_max;
			current_max = Math.max(Math.max(temp*a[i], a[i]), current_min*a[i]);
			current_min = Math.min(Math.min(temp*a[i], a[i]), current_min*a[i]);
			global_max = Math.max(global_max, current_max);
		}
		return global_max;
	}

}
