package main.java.dp;

public class MagicIndexUnique {
	
	private static int[] array = {-40,-20,-1,1,2,3,5,7,9,12,13};
	
	public static void main(String args[]) {
		int magicIndex = findMagicIndex(array, 0, array.length-1);
		System.out.println(magicIndex != -1 ? "Magic index exists at " + magicIndex : "No magic index");
	}

	private static int findMagicIndex(int[] array, int start, int end) {
		if(end<start || start<0 ) {
			return -1;
		}
		int mid = (start+end)/2;
		if(array[mid] == mid) {
			return mid;
		}
		if(array[mid] > mid) {
			return findMagicIndex(array, start, mid-1);
		} else {
			return findMagicIndex(array, mid+1, end);
		}
	}

}
