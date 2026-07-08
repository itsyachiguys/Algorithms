package Searching.BinarySearch.Recursive;

import java.util.Scanner;

public class BS {

    static int binarySearch(int arr[], int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == key)
            return mid;

        if (arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + result);

        sc.close();
    }
}