package main.java.general;

import java.util.Date;

/**
 * Created by arorai on 3/7/17.
 */
public class DateTest {
    final Date today = new Date();
    Date tom = new Date(1455451106920l);

    public static void main(String args[]) {
        DateTest date = new DateTest();

//        date.today.setTime(1455451106920l); // valid
//        date.today = date.tom; // invalid
        date.tom = new Date(); // valid
//        date.today = new Date(1455451106920l); // invalid




        System.out.println(date.today);
        System.out.print(date.tom);
    }
}
