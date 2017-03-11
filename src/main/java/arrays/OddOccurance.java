package main.java.arrays;

/**
 * Created by arorai on 1/3/17.
 * All numbers occur even number of times except one number which occurs odd number of times.
 * Find the number in O(n) time & constant space.
 */
public class OddOccurance {

    public static void main(String args[]){
        OddOccurance oddOccurance = new OddOccurance();
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int oddNumber = oddOccurance.getOddOccurance(arr);
        System.out.println("Odd Element: " + oddNumber);
    }

    private int getOddOccurance(int[] arr) {
        int size = arr.length;
        int res = 0;
        for(int i=0 ; i<size; i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
