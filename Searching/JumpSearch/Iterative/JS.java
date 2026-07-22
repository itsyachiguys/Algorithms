package Searching.JumpSearch.Iterative;

public class JS {

    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        while (prev < Math.min(step, n)) {
            if (arr[prev] == target)
                return prev;

            prev++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 12;

        int index = jumpSearch(arr, target);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
    }
}