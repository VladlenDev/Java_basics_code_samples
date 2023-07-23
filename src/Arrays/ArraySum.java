package Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(sumIntegerArray(arr));
    }

    public static int sumIntegerArray(int[] arr) {
        int sum = 0;

        for(int i : arr)
            sum += i;

        return sum;
    }
}
