package main.java.arrays;

/**
 * Created by arorai on 1/5/17.
 * Search an element in a sorted and rotated array.
 */
public class SortedAndRotated {

    public static void main(String args[]) {
        SortedAndRotated sortedAndRotated = new SortedAndRotated();
        int[] a = {3,4,5,1,2};
        int element = 1;
        int index = searchElement(a, 0, a.length-1, element);
        System.out.println("Element found at index : " + index);
    }

    private static int searchElement(int[] a, int l, int h, int element) {

        int mid = (l+h)/2;
        if(a[mid] == element) {
            return mid;
        }

        if(a[l] < a[mid]) {
            if(element >= a[l] && element <= a[mid]) {
                return searchElement(a, l, mid-1, element);
            } else {
                return searchElement(a, mid+1, h, element);
            }

        }else if(a[mid] < a[h]) {
            if(element >= a[mid] && element <= a[h]) {
                return searchElement(a, mid+1, h, element);
            } else {
                return searchElement(a, l, mid-1, element);
            }
        }
        return -1;
    }


}
