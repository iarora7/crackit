package main.java.dp;

public class MagicIndexNonUnique {
	
	/* Magic index exist at 2 and 7, returns 2 because that is encountered first! */
	private static int[] array = {-10,-5, 2, 2, 2, 3, 4, 7, 9, 12 , 13};
	
	public static void main(String args[]) {
		int magicIdx = findMagicIndex(array, 0, array.length);
		System.out.println(magicIdx >= 0 ? "Magic Index at " + magicIdx : "No Magic Index present");
	}

	private static int findMagicIndex(int[] array, int start, int end) {
		if(end<start || start < 0 || end > array.length) {
			return -1;
		}
		
		int midIdx = (start+end)/2;
		int midValue = array[midIdx];
		if(midIdx == midValue) {
			return midIdx;
		}
		//Left visit
		int leftIndex = Math.min(midIdx-1, midValue);
		int left = findMagicIndex(array, start, leftIndex);
		if(left >= 0) {
			return left;
		}
		
		//Right visit
		int rightIndex = Math.max(midIdx+1, midValue);
		int right = findMagicIndex(array, rightIndex, end);
		return right;
	}

}
