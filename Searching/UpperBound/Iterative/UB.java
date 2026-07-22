package Searching.UpperBound.Iterative;

public class UB {

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 6, 8, 10};
        int target = 6;

        int index = upperBound(arr, target);

        if (index == arr.length)
            System.out.println("No Upper Bound Found");
        else
            System.out.println("Upper Bound Index: " + index);
    }
}