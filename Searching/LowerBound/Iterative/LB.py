def lower_bound(arr, target):
    left = 0
    right = len(arr) - 1
    ans = len(arr)

    while left <= right:
        mid = left + (right - left) // 2

        if arr[mid] >= target:
            ans = mid
            right = mid - 1
        else:
            left = mid + 1

    return ans


arr = [2, 4, 6, 8, 10]
target = 5

index = lower_bound(arr, target)

if index == len(arr):
    print("No Lower Bound Found")
else:
    print("Lower Bound Index:", index)