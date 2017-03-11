package main.java.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by arorai on 1/5/17.
 * Median of two sorted arrays.
 */
public class MedianOfArrays {

    public static void main(String args[]) {
        MedianOfArrays medianOfArrays = new MedianOfArrays();
        int a1[] = {1, 12, 15, 26, 38};
        int a2[] = {2, 13, 17, 30, 45};
        int median = getMedian(a1,a2,5);
        System.out.println("Median : " + median);
    }

    private static int getMedian(int[] a1, int[] a2, int n) {
        if(n==0) {
            return -1;
        } else if(n==1) {
            return (a1[0]+a2[0])/2;
        } else if(n==2) {
            return (Math.max(a1[0],a2[0])+ Math.min(a1[1],a2[1]))/2;
        }

        int m1 = median(a1,n);
        int m2 = median(a2,n);
        System.out.println("Medians : " + m1 + "  " + m2);

        if(m1==m2) {
            return m1;
        }
        if(m1 > m2) {
            a1 = Arrays.copyOfRange(a1,0,n/2+1);
            a2 = Arrays.copyOfRange(a2,n/2,n);
            return getMedian(a1,a2,a1.length);
        } else if(m1 < m2) {
            a1 = Arrays.copyOfRange(a1,n/2, n);
            a2 = Arrays.copyOfRange(a2,0,n/2+1);
            return getMedian(a1,a2,a1.length);
        }
        return 0;
    }

    private static int median(int[] a, int n) {
        if(n%2==0) {
            return (a[n/2] + a[(n/2)-1])/2;
        } else {
            return a[n/2];
        }
    }
}
