package Searching.ExponentialSearch;

import java.util.Scanner;

public class ES {

    static int binarySearch(int[] arr, int left, int right, int key) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    static int exponentialSearch(int[] arr, int key) {

        int n = arr.length;

        if (arr[0] == key)
            return 0;

        int i = 1;

        while (i < n && arr[i] <= key)
            i *= 2;

        return binarySearch(arr, i / 2, Math.min(i, n - 1), key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};

        System.out.print("Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int result = exponentialSearch(arr, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + result);

        sc.close();
    }
}