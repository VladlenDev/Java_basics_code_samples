package Arrays;

public class SecondHighestElement {

    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 6, 8, 24, 56, 2, 1, 100, 9, 90, 8, 10, -6};

        System.out.println(findSecondHighest(arr));

    }

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }

}
