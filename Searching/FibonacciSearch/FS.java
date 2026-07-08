package Searching.FibonacciSearch;

import java.util.Scanner;

public class FS {

    static int fibonacciSearch(int[] arr, int key) {
        int n = arr.length;
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm1 + fibMMm2;
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm1 + fibMMm2;
        }
        int offset = -1;
        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, n - 1);
            if (arr[i] < key) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i] > key) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else {
                return i;
            }
        }
        if (fibMMm1 == 1 && offset + 1 < n && arr[offset + 1] == key)
            return offset + 1;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.print("Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();
        int result = fibonacciSearch(arr, key);
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index " + result);
        sc.close();
    }
}
