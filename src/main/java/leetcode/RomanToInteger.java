package main.java.leetcode;

import java.util.HashMap;

/**
 * Created by arorai on 3/26/17.
 *
 */
public class RomanToInteger {

    public static void main(String args[]) {
        String s = "X";
        System.out.println(s + " = " + romanToIntRL(s));
        System.out.print(s + " = " + romanToIntLR(s));
    }

    public static int romanToIntRL(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2; i>=0; i--) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                res = res + map.get(s.charAt(i));
            } else {
                res = res - map.get(s.charAt(i));
            }
        }
        return res;
    }

    public static int romanToIntLR(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

//        int res = map.get(s.charAt(0));
        int res = 0;
        System.out.print("before= " + res);
        for(int i=0; i<s.length()-1; i++) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                res  = res + map.get(s.charAt(i)) + map.get(s.charAt(i+1));
                System.out.print("greater= " + res);
                i++;
            } else {
                res  = res - map.get(s.charAt(i));
                System.out.print("less= " + res);
            }
        }

        return res;
    }
}
