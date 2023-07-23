package Collections;

import java.util.LinkedList;
import java.util.List;

public class ListContainsOdd {
    public static boolean onlyOddNumbers(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }

        return true;
    }
    public static boolean onlyOddNumbersParallel(List<Integer> list) {
        return !list
                .parallelStream() // parallel stream for faster processing
                .anyMatch(x -> x % 2 == 0); // return as soon as any elements match the condition
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<Integer>();
        List<Integer> oddNumbers = new LinkedList<Integer>();

        for(int i = 1; i <= 19; i += 2) {
            numbers.add(i);
            oddNumbers.add(20 - i);
        }

        numbers.add(200);
        numbers.add(333);
        oddNumbers.add(333);

        System.out.println("numbers only odd: " + onlyOddNumbers(numbers));
        System.out.println("oddNumbers only odd: " + onlyOddNumbers(oddNumbers));

        System.out.println("numbers only odd: " + onlyOddNumbersParallel(numbers));
        System.out.println("oddNumbers only odd: " + onlyOddNumbersParallel(oddNumbers));

    }
}
