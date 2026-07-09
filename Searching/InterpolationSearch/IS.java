package Searching.InterpolationSearch;

import java.util.Scanner;

public class IS {

    public static int interpolationSearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {

            if (low == high) {
                if (arr[low] == key)
                    return low;
                return -1;
            }

            int pos = low + ((key - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            if (arr[pos] == key)
                return pos;

            if (arr[pos] < key)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

            System.out.print("Array: ");
            for (int num : arr)
                System.out.print(num + " ");

            System.out.print("\nEnter element to search: ");
            int key = sc.nextInt();

            int result = interpolationSearch(arr, key);

            if (result == -1)
                System.out.println("Element not found.");
            else
                System.out.println("Element found at index " + result);
        }
    }
}