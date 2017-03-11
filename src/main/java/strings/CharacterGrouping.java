package main.java.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by arorai on 1/8/17.
 * Group all occurrences of characters according to first appearance.
 * Input : str = "geeksforgeeks"
 * Output:  ggeeeekkssfor
 */
public class CharacterGrouping {

    public static void main(String args[]) {
        CharacterGrouping characterGrouping = new CharacterGrouping();
        String str = "geeksforgeeks";
        characterGrouping.groupCharacters(str);
    }

    private void groupCharacters(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++) {
            if(map.containsKey(chars[i])) {
                int val = map.get(chars[i]);
                map.put(chars[i], val+1);
            } else {
                map.put(chars[i],1);
            }

        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            for(int i=0;i<entry.getValue();i++) {
                System.out.print(entry.getKey());
            }
        }
    }
}
