package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arorai on 1/23/17.
 */
public class NumberCompliment {

    public static void main(String args[]) {
        int num =5;
        System.out.print(findComplement(num));

    }

    public static int findComplement(int num) {

        List<Integer> binary = decimalToBinary(num);
        int res = 0;
        int len = binary.size();
        for(int i=0; i<len; i++) {
            if(binary.get(i)==0) {
                res += Math.pow(2, len-i-1);
            }
        }

        return res;
    }

    public static List<Integer> decimalToBinary(int num) {
        List<Integer> binary = new ArrayList<Integer>();
        int i=0;
        while(num > 0) {
            binary.add(0, num%2);
            num = num/2;
            i++;
        }
        return binary;
    }
}
