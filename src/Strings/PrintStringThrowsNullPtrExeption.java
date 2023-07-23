package Strings;

public class PrintStringThrowsNullPtrExeption {

    public static void main(String[] args) {
        printString(null, 3);

    }

    static void printString(String s, int count) {
//        if (s == null) return; // avoidance
        for (int i = 0; i < count; i++) {
            System.out.println(s.toUpperCase()); // Exception in thread "main" java.lang.NullPointerException
        }
    }

}
