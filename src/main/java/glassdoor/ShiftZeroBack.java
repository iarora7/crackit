package main.java.glassdoor;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by arorai on 3/22/17.
 */
public class ShiftZeroBack {

    public static void main(String args[]) {
        int[] a = {0,2,4,0,3,0,22,1,0};
        shiftZeros(a);

    }

    private static void shiftZeros(int[] a) {
        int p=0;
        int i=0;
        while(i<a.length) {
            if(a[i] != 0) {
                a[p] = a[i];
                p++;
                i++;
            } else {
                i++;
            }
        }
        while(p<i) {
            a[p++] = 0;
        }
        for (int k: a
             ) {
            System.out.println(k);
        }
    }
}
