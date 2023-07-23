package Strings;

public class StringRemoveOccurences {

    public static void main(String[] args) {
        String str1 = "abcdABCDabcdABCD";

        str1 = str1.replace("a", "");

        System.out.println(str1); // bcdABCDbcdABCD
    }

}
