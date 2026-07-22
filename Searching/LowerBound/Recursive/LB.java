package Searching.LowerBound.Recursive;

public class LB {

    static int lowerBound(int[] arr, int left, int right, int target, int ans) {

        if (left > right)
            return ans;

        int mid = left + (right - left) / 2;

        if (arr[mid] >= target)
            return lowerBound(arr, left, mid - 1, target, mid);

        return lowerBound(arr, mid + 1, right, target, ans);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        int target = 5;

        int index = lowerBound(arr, 0, arr.length - 1, target, arr.length);

        if (index == arr.length)
            System.out.println("No Lower Bound Found");
        else
            System.out.println("Lower Bound Index: " + index);
    }
}