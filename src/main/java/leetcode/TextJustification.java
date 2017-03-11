package main.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arorai on 1/20/17.
 * Not completed. Check leetcode problem 68.
 */
public class TextJustification {

    public static void main(String args[]) {
        TextJustification textJustification = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int l = 16;
        List<String> result = textJustification.fullJustify(words, l);
        for(String line : result) {
            System.out.println(line);
        }
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> sentences = new ArrayList<String>();
        if(words.length == 0) {
            sentences.add("");
            return sentences;
        }
        int lineLength=0;
        String[] lineWords = new String[words.length];
        int j=-1;
        int i=0;
        StringBuilder line;
        while(i < words.length) {
            line = new StringBuilder();
            lineLength = words[i].length();
            j=i; i++;
            while(i < words.length && lineLength + words[i].length() + 1 <= maxWidth) {
                lineLength += words[i].length() + 1;
                i++;
            }
            int extraSpace = maxWidth - lineLength;
            int extraBetween = extraSpace>0 ? extraSpace/(i-j) : 0;
            extraBetween = (i-j-1)>0 ? extraBetween + 1 : extraBetween; // default spaces between the words
            System.out.println(j + " and " + i);
            System.out.println("lineLength:"+lineLength + " and extraSpace:" + extraSpace);
            while(j<=i-1){
                line = line.append(words[j]);
                if(j<i-1 || j==words.length-1){
                    for(int s=0; s<extraBetween; s++){
                        line = line.append(" ");
                    }
                }
                j++;
            }
            sentences.add(line.toString());
            System.out.println(line);
        }

        return sentences;
    }
}
