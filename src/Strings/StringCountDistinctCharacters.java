package Strings;

import java.util.HashMap;
import java.util.Map;

public class StringCountDistinctCharacters {

    public static void main(String[] args) {

        String str1 = "abcdABCDabcd";

         System.out.println(countChars(str1)); // {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
    }

    public static Map<Character, Integer> countChars(String input) {

        char[] chars = input.toCharArray();

        Map<Character, Integer> charsCount = new HashMap<>();

        for (char c : chars) {
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c) + 1);
            } else
                charsCount.put(c, 1);
        }

        return charsCount;

    }

}
