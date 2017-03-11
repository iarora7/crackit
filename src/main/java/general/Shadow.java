package main.java.general;

/**
 * Created by arorai on 3/7/17.
 */
public class Shadow {

    public static void main(String args[]) {
        //S1 s1 = new S1();
        //S2 s2 = new S2();
        //System.out.println("Print S1" + s1.S);
        //System.out.println("Print S2" + s2.S);

        String one = new String("hello");
        String two = new String("hello"); // two different objects
        String three = "hello";
        String four = "hello";

        if(one.equals(two)) {
            System.out.println("one == two");
        } else {
            System.out.println("one != two");
        }


        if(three == four) {
            System.out.println("three == four"); // String interning, both three and four refer to same string "hello"
        } else {
            System.out.println("3 != 4");
        }
    }
}

class S1 {
    public String S = "S1";
    public String gets() {
        return S;
    }
}

class S2 {
    public String S = "S2";
    public String gets() {
        return S;
    }
}
