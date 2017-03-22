package main.java.strings;

/**
 * Created by arorai on 3/11/17.
 *
 * Convert string number to corresponding int value, if not string number return 0
 */
public class Atoi {

    public static void main(String args[]) {
        String str = "73826";
        int num = atoi(str);
        System.out.print(num);
    }

    private static int atoi(String str) {
        int res = 0;
        int begin = 0;
        boolean negative = false;
        if(str.charAt(0) == '+') {
            negative = false;
            begin = 1;
        } else if(str.charAt(0) == '-') {
            negative = true;
            begin = 1;
        }
        for(int i=begin; i<str.length(); i++) {
            if(str.charAt(i) - '0' > 9 || str.charAt(i) - '0' < 0) {
                return 0;
            }
            res = res*10 + (str.charAt(i) - '0');
        }
        if(negative) {
            res = -1*res;
        }
        return res;
    }
}
