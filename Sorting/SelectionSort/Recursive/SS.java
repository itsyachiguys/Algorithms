package Sorting.SelectionSort.Recursive;

public class SS {

    static void selectionSort(int[] arr, int start) {

        if (start >= arr.length - 1)
            return;

        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {

            if (arr[i] < arr[minIndex])
                minIndex = i;
        }

        int temp = arr[minIndex];
        arr[minIndex] = arr[start];
        arr[start] = temp;

        selectionSort(arr, start + 1);
    }

    static void printArray(int[] arr) {

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr, 0);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}