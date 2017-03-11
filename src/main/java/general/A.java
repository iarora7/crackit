package main.java.general;

/**
 * Created by arorai on 3/7/17.
 */
class A1 {
    int a;
    public A1(int x) {a=x;}
}


public class A {
    public static void main(String args[]) {
        A1 a = new A1(2);
        System.out.print(a.a);

    }
}
