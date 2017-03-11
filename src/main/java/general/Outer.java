package main.java.general;

/**
 * Created by arorai on 3/7/17.
 */
public class Outer {
    private int x = 5;

    public class Inner {
        public void printX() {
            System.out.print(Outer.this.x);
        }
    }

    public static void main(String args[]) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.printX();
    }
}
