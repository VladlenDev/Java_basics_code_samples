package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTryCatch {

    public static void main(String[] args) {

        try {
            foo(10);
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void foo(int x) throws IllegalArgumentException, NullPointerException {
        // some code
    }

}
