package Searching.SentinelLinearSearch.Recursive;

public class SLS {
    public static int recursiveSearch(int[] arr, int key, int index) {
        if (arr[index] == key)
            return index;
        return recursiveSearch(arr, key, index + 1);
    }

    public static int sentinelLinearSearch(int[] arr, int key) {
        int n = arr.length;
        int last = arr[n - 1];
        arr[n - 1] = key;
        int index = recursiveSearch(arr, key, 0);
        arr[n - 1] = last;
        if (index < n - 1 || arr[n - 1] == key)
            return index;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {15, 22, 18, 35, 40};
        int key = 35;
        int index = sentinelLinearSearch(arr, key);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}