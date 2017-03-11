package main.java.bitwiseOp;

/**
 * Created by arorai on 3/4/17.
 */
public class CountOnes {

    public static void main(String args[]) {
        CountOnes co = new CountOnes();
        System.out.print(co.count_one(7));
    }

    int count_one(int n) {
        int count=0;
        while(n != 0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}


