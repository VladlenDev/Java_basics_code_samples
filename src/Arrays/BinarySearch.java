package Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        if (low > high) {
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 6, 8, 24, 56, 2, 1, 100, 9, 90, 8, 10, -6};

        Arrays.sort(arr);
        /* {-6, 1, 1, 2, 3, 6, 8, 8, 9, 9, 10, 24, 56, 90, 100} */

        System.out.println(binarySearch(arr, 24));
        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch(arr, 3));
    }

}
