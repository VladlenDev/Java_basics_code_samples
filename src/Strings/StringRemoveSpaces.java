package Strings;

public class StringRemoveSpaces {
    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String str1 = new String("Ever more");
        String str2 = new String(" A van  guard   ");

        System.out.println(removeWhiteSpaces(str1));
        System.out.println(removeWhiteSpaces(str2));

        System.out.println(str1.strip());
        System.out.println(str2.strip());

    }

}
