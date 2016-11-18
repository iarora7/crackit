package main.java.interviews;

import java.io.*;
import java.util.Scanner;

/**
 * Created by arorai on 11/17/16.
 */
public class LastKLines {

    private static final String filename = "/Users/arorai/git/crackit/src/main/java/interviews/newfile";


    public static void main(String args[]) {
        BufferedReader br;
        FileReader fr;
        String line = null;
        int k = 3, index=0;
        String arr[] = new String[k];
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
                if(index==k) {
                    index = 0;
                }
                arr[index] = line;
                index++;
            }

            for(int i = index; i<arr.length; i++) {
                System.out.println( arr[i]);
            }
            for (int i=0 ; i<index; i++ ) {
                System.out.println(arr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
