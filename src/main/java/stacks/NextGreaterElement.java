package main.java.stacks;

/*
 * Find the next greater element in array.
 * fails for {100, 80, 60, 70, 60, 75, 85};
 */
public class NextGreaterElement {
	
	public static void main(String[] args) {
		int[] arr1 = {25,2,5,4};
		int[] arr = {100, 80, 60, 70, 60, 75, 85}; //{12,6,7,13};
		getNextGreaterElements(arr);
	}

	private static void getNextGreaterElements(int[] arr) {
		int nge = -1;
		printNGE(arr[0],nge);
		for(int i=1; i<arr.length; i++){
			if(arr[i] < arr[i-1]){
				nge = arr[i-1];
			} else if(arr[i] < nge){
				
			} else {
				nge = -1;
			}
			printNGE(arr[i],nge);
		}
	}

	private static void printNGE(int i, int nge) {
		System.out.println(i + " -- " + nge);
	}

}
