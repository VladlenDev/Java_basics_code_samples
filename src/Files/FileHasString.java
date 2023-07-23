package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHasString {

    public static void main(String[] args) {

        boolean match1 = false, match2 = false;

        try {
            match1 = findStringInFile("resources/textSample.txt", "Hello World!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            match2 = findStringInFile("resources/textSample.txt", "Excepteur sint occaecat cupidatat non proident");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(match1);
        System.out.println(match2);
    }

    public static boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        // read the file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(str)) {
                scanner.close();
                return true;
            }
        }
        scanner.close();

        return false;
    }

}
