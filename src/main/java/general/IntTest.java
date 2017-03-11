package main.java.general;

/**
 * Created by arorai on 3/7/17.
 */
public class IntTest {
    public static void main(String args[]) {
        Integer a = 5;
        int b = 10;
//        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1.concat(s2.toUpperCase());
        System.out.println(s1+s2+s3);
    }
}
