package main.java.strings;

/**
 * Created by arorai on 3/11/17.
 *
 * the string aabcccccaaa would become a2blc5a3.
 */
public class StringCompression {

    public static void main(String args[]) {
        String str = "aabcccccaaa";
        System.out.print(compressString(str));
    }

    private static String compressString(String str) {
        if( countCompression(str) > str.length()) {
            return str;
        }

        StringBuilder newStr = new StringBuilder();
        char curr = str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == curr) {
                count++;
            } else {
                newStr.append(curr);
                newStr.append(count);
                count = 1;
                curr = str.charAt(i);
            }
        }
        newStr.append(curr);
        newStr.append(count);

        return newStr.toString();
    }

    private static int countCompression(String str) {
        int size = 0;
        char curr = str.charAt(0);
        int count = 1;
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == curr) {
                count++;
            } else {
                size += (1 + String.valueOf(count).length());
                count = 1;
                curr = str.charAt(i);
            }
        }
        size += (1 + String.valueOf(count).length());
        return size;
    }
}
