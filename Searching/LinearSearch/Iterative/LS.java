package Searching.LinearSearch.Iterative;

public class LS {
    public static int linear_search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 43, 68, 77, 23 };
        int target = 43;
        int index = linear_search(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found.");
        }
        target = 40;
        index = linear_search(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
