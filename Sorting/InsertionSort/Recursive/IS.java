package Sorting.InsertionSort.Recursive;

public class IS {

    static void insertionSort(int[] arr, int n) {

        if (n <= 1)
            return;

        insertionSort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {

            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }

    static void printArray(int[] arr) {

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr, arr.length);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}