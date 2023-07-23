package Arrays;

import java.util.Random;
import java.util.Arrays;

public class ArrayShuffle {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        shuffle(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndexToSwap = rand.nextInt(arr.length);
            int temp = arr[randomIndexToSwap];
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp;
        }

    }

}
