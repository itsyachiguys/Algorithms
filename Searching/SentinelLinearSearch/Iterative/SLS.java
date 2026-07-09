package Searching.SentinelLinearSearch.Iterative;

public class SLS {

    public static int sentinelLinearSearch(int[] arr, int key) {
        int n = arr.length;

        int last = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;

        if (i < n - 1 || last == key)
            return i;

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int key = 40;

        int index = sentinelLinearSearch(arr, key);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}