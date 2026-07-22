package Searching.UpperBound.Recursive;

public class UB {

    static int upperBound(int[] arr, int left, int right, int target, int ans) {

        if (left > right)
            return ans;

        int mid = left + (right - left) / 2;

        if (arr[mid] > target)
            return upperBound(arr, left, mid - 1, target, mid);

        return upperBound(arr, mid + 1, right, target, ans);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 6, 8, 10};
        int target = 6;

        int index = upperBound(arr, 0, arr.length - 1, target, arr.length);

        if (index == arr.length)
            System.out.println("No Upper Bound Found");
        else
            System.out.println("Upper Bound Index: " + index);
    }
}