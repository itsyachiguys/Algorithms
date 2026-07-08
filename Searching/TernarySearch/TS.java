package Searching.TernarySearch;

import java.util.Scanner;

public class TS {

    static int ternarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;
            if (key < arr[mid1]) {
                right = mid1 - 1;
            } else if (key > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45};

        System.out.print("Array: ");

        for (int num : arr)
            System.out.print(num + " ");

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int result = ternarySearch(arr, 0, arr.length - 1, key);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + result);

        sc.close();
    }
}
