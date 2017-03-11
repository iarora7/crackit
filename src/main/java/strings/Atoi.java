package main.java.strings;

/**
 * Created by arorai on 3/11/17.
 *
 * Convert string number to corresponding int value, if not string number return 0
 */
public class Atoi {

    public static void main(String args[]) {
        String str = "826";
        int num = atoi(str);
        System.out.print(num);
    }

    private static int atoi(String str) {
        int res = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) - '0' > 9) {
                return 0;
            }
            res = res*10 + (str.charAt(i) - '0');
        }
        return res;
    }
}
